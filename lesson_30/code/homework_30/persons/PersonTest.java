package homework_30.persons;

import classwork_30.Soldier.Soldier;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;
class PersonTest {

    Person[] persons;

    @BeforeEach
    void setUp() {

        persons = new Person[]{
                new Person("Paul", 35, 87),
                new Person("Eva", 53, 56),
                new Person("Heinz", 47, 78),
                new Person("Eva", 92, 124),
                new Person("John", 53, 78),
                new Person("Heinz", 40, 73),
        };
    }
    @Test
    void testNativeSortingByAge(){
        System.out.println("-------------- Print as is -------------");
        printArray(persons);
        Arrays.sort(persons);
        System.out.println("------- Print after sorting by age ------");
        printArray(persons);
    }

    @Test
    void testNativeSortingByWeight(){
        System.out.println("------------- Print as is --------------");
        printArray(persons);
        Arrays.sort(persons, (persone1, persone2)  -> Double.compare(persone1.getWeight(), persone2.getWeight()));
        System.out.println("----- Print after sorting by weight -----");
        printArray(persons);
    }

    @Test
    void testNativeSortigByName(){
        Comparator<Person> comparatorByName = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return  o1.getName().compareTo(o2.getName());
            }
        };
        System.out.println("------------- Print as is --------------");
        printArray(persons);
        Arrays.sort(persons, comparatorByName);
        System.out.println("------- Print after sorting by name -----");
        printArray(persons);
    }

    @Test
    void testSortPersonsByNameAndAge(){
        Comparator<Person> comparatorNameAndAge = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int res = o1.getName().compareTo(o2.getName());
                return res !=0 ? res : Integer.compare(o1.getAge(), o2.getAge());
            }
        };
        System.out.println("-------------- Print as is -------------");
        printArray(persons);
        Arrays.sort(persons, comparatorNameAndAge);
        System.out.println("------- Print sorting name and age -----");
        printArray(persons);
    }

    @Test
    void testSortPersonsByAgeAndWeight(){
        System.out.println("-------------- Print as is --------------");
        printArray(persons);
        Arrays.sort(persons, (o1, o2) -> {
            int res = (o1.getAge() - o2.getAge());
            return res !=0 ? res : Double.compare(o1.getWeight(), o2.getWeight());
        });
        System.out.println("---- Print sorting age and weight --------");
        printArray(persons);
    }

    // Работа метода binarySearch на массиве объектов
    @Test
    void testBinarySearch(){
        System.out.println("-------------- Print as is --------------");
        printArray(persons);
        Arrays.sort(persons, (o1, o2) -> (o1.getAge() - o2.getAge()));
        System.out.println("------ Print after sorting by Age -------");
        printArray(persons);
        // create object - pattern for searching
        Person pattern = new Person(null, 100, 0);
        int index = Arrays.binarySearch(persons, pattern, (o1, o2) -> (o1.getAge() - o2.getAge()) );
        System.out.println("Index = " + index);
    }

    public void printArray(Object[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}