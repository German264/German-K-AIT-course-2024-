package classwork_31.cities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

//City("Denver", 600_000);
//City("Boston", 670_000);
//City("Chicago", 2_700_000);
//City("Atlanta", 470_000);
//City("New York", 8_500_000);
//City("Dallas", 1_300_000);

class CityTest {

    City[] cities;

    @BeforeEach
    void setUp() {

        cities = new City[6];

        cities[0] = new City("Denver", 600_000);
        cities[1] = new City("Boston", 670_000);
        cities[2] = new City("Chicago", 2_700_000);
        cities[3] = new City("Atlanta", 470_000);
        cities[4] = new City("New York", 8_500_000);
        cities[5] = new City("Dallas", 1_300_000);
    }

    public void printArray(Object[] array, String titleOfReport) {
        System.out.println("--------------- " + titleOfReport + " ------------------- ");
        for (Object o : array) {
            System.out.println(o);
        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
    }

    //    Распечатать в отсортированном виде.
//    Есть ли в списке городов город с населением 1.2 млн человек?
//    Отсортируйте список по алфавиту.
//    Есть ли в списке город по имени Chicago? Какой он имеет номер в списке?

    @Test
    void testComparable(){
        printArray(cities, ":List of cities as is");
        Arrays.sort(cities);
        printArray(cities, "List of cities sorted by population.");
        City pattern = new City(null, 600_000);
        int index = Arrays.binarySearch(cities,pattern);
        System.out.println(index);
    }

    @Test
    void testComparatorByName(){
        Comparator<City> comparatorByCityName = new Comparator<City>() {
            @Override
            public int compare(City o1, City o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Arrays.sort(cities, comparatorByCityName);
        printArray(cities, "List of cities sorted by name.");
        City pattern = new City("Las Vegas", 0);
        int index = Arrays.binarySearch(cities, pattern, comparatorByCityName);
        if(index >= 0){
            System.out.println("Find city " + pattern.getName() + " on index: " + index );
        } else {
            System.out.println("City " + pattern.getName() + "did not find, but it could be on index " + (- index -1));
        }
    }

//    Скопируйте массив в другой, имеющий в 2 раза большую длину.
//    Отсортируйте полученный массив.
//    Имеется ли в списке городов город Salem?
//            "Salem", 690_000

    @Test
    void testArrayCopy(){
        City[] citiesCopy = Arrays.copyOf(cities, cities.length * 2);
        printArray(citiesCopy, "citiesCopy as is");
        System.out.println(citiesCopy.length);
        Comparator<City> comparatorByName = Comparator.nullsLast((c1, c2) -> c1.getName().compareTo(c2.getName()));
        // sorting
        Arrays.sort(citiesCopy, comparatorByName);
        // print
        printArray(citiesCopy, "citiesCopy after sorting by name");

        City pattern = new City("Salem", 0);
        int index = Arrays.binarySearch(citiesCopy, 0, cities.length, pattern, comparatorByName);
        System.out.println(index);
    }

    // Вставьте город Salem в список, сохранив порядок сортировки по населению (!)
// Вставляем в имеющийся список
    @Test
    void testInsertKeepSorting(){
        Arrays.sort(cities); // by default sorting (population)
        printArray(cities, "Native sorting");
        // increase up to 7
        City[] citiesCopy7 = Arrays.copyOf(cities, cities.length + 1);
        City city = new City("Salem", 690_000);
        int index = Arrays.binarySearch(citiesCopy7, 0, citiesCopy7.length - 1, city);
        index = index >=0 ? index : - index -1; // обработка индекса
        // подготовили место для вставки
        System.arraycopy(citiesCopy7, index, citiesCopy7, index + 1, citiesCopy7.length - index -1);
        citiesCopy7[index] = city;
        cities = citiesCopy7; // переопределили ссылку на массив
        printArray(cities, "List with added city");
    }
}