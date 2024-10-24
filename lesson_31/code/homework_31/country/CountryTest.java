package homework_31.country;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CountryTest {

    Country[] countries;

    @BeforeEach
    void setUp() {

        countries = new Country[6];

        countries[0] = new Country("Russia", 146_000_000);
        countries[1] = new Country("Australia", 25_000_000);
        countries[2] = new Country("Brazil", 211_000_000);
        countries[3] = new Country("Canada", 37_000_000);
        countries[4] = new Country("Japan", 126_000_000);
        countries[5] = new Country("India", 1390_000_000);

    }

    public void printArray(Object[] array, String titleOfReport) {
        System.out.println("--------------- " + titleOfReport + " ------------------- ");
        for (Object o : array) {
            System.out.println(o);
        }
    }

//    Распечатать в отсортированном виде.
//    Есть ли в списке стран страна с населением 90 млн человек?
//    Отсортируйте список по алфавиту.
//    Есть ли в списке страна по имени Indonesia? Какой она имеет номер в списке?

    @Test
    void testComparable() {
        printArray(countries, ":List of countries as is");
        Arrays.sort(countries);
        printArray(countries, "List of countries sorted by population.");
        Country pattern = new Country(null, 280_000_000);
        int index = Arrays.binarySearch(countries, pattern);
        System.out.println(index);
    }

    @Test
    void testComparatorByName() {
        Comparator<Country> comparatorByCountryName = new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Arrays.sort(countries, comparatorByCountryName);
        printArray(countries, "List of countries sorted by name.");
        Country pattern = new Country("Indonesia", 0);
        int index = Arrays.binarySearch(countries, pattern, comparatorByCountryName);
        if (index >= 0) {
            System.out.println("Find country " + pattern.getName() + " on index: " + index);
        } else {
            System.out.println("Country " + pattern.getName() + " did not find, but it could be on index " + (-index - 1));
        }
    }

//    Скопируйте массив в другой, имеющий в 2 раза большую длину.
//    Отсортируйте полученный массив.
//    Имеется ли в списке стран страна Germany?
//            "Germany", 83_000_000

    @Test
    void testArrayCopy() {
        Country[] countriesCopy = Arrays.copyOf(countries, countries.length * 2);
        printArray(countriesCopy, "countriesCopy as is");
        System.out.println(countriesCopy.length);
        Comparator<Country> comparatorByName = Comparator.nullsLast((c1, c2) -> c1.getName().compareTo(c2.getName()));
        // sorting
        Arrays.sort(countriesCopy, comparatorByName);
        // print
        printArray(countriesCopy, "countriesCopy after sorting by name");

        Country pattern = new Country("Germany", 0);
        int index = Arrays.binarySearch(countriesCopy, 0, countries.length, pattern, comparatorByName);
        System.out.println(index);
    }

// Вставьте страну Germany в список, сохранив порядок сортировки по населению (!)
// Вставляем в имеющийся список

    @Test
    void testInsertKeepSorting(){
        Arrays.sort(countries); // by default sorting (population)
        printArray(countries, "Native sorting");
        // increase up to 7
        Country[] countriesCopy7 = Arrays.copyOf(countries, countries.length + 1);
        Country country = new Country("Germany", 83_000_000);
        int index = Arrays.binarySearch(countriesCopy7, 0, countriesCopy7.length - 1, country);
        index = index >=0 ? index : - index -1; // обработка индекса
        // подготовили место для вставки
        System.arraycopy(countriesCopy7, index, countriesCopy7, index + 1, countriesCopy7.length - index -1);
        countriesCopy7[index] = country;
        countries = countriesCopy7; // переопределили ссылку на массив
        printArray(countries, "List with added city");
    }
}