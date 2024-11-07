package classwork_41.collections;

//- .max, .min
//- .reverse
//- .shuffle

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsMethods {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("papaya");
        fruits.add("orange");
        fruits.add("pineapple");
        fruits.add("grape");
        fruits.add("apricot");
        fruits.add("peach");
        fruits.add("pear");
        fruits.add("banana");

        for (String fruit : fruits) {
            System.out.print(fruit + " | ");
        }
        System.out.println();
        System.out.println("--------------------------");
        fruits.forEach(System.out::println);

        System.out.println("------------ sorting ----------------");
        Comparator<String> fruitComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return - o1.compareTo(o2);
            }
        };

        Collections.sort(fruits); // sorting
        fruits.forEach(System.out::println);

        System.out.println("------------ sorting reverse ----------------");
        Collections.sort(fruits, fruitComparator); // sorting, rewrite collection (элементы переставляются местами)
        fruits.forEach(System.out::println);

        System.out.println("------------ max ----------------");
        System.out.println(Collections.max(fruits, fruitComparator)); //

        System.out.println("------------ reverse ----------------");
        Collections.reverse(fruits);
        fruits.forEach(System.out::println);

        System.out.println("------------ shuffle ----------------");
        Collections.shuffle(fruits);
        fruits.forEach(System.out::println);
    }
}
