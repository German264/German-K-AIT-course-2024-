package classwork_41.treeset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class TreeSetInteger {
    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>(Arrays.asList(10, 20, 30, -80, -230, 0));

        TreeSet<Integer> numbers = new TreeSet<>(num);

        System.out.println(numbers);
        System.out.println(numbers.size());
        numbers.add(13);
        numbers.add(100500);
        System.out.println(numbers);
        System.out.println(numbers.size());

        for (Integer n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.println(numbers.first()); // -230
        System.out.println(numbers.last()); // 100500

        System.out.println(numbers.ceiling(5)); //10
        System.out.println(numbers.contains(5)); // false
        System.out.println(numbers.floor(5)); // 0

        System.out.println(numbers.tailSet(5)); // 10, 13, ...

        System.out.println(numbers.subSet(-50, 30)); // 0, 10, 13, 20

        System.out.println(numbers.subSet(-80, true, 30, true)); // -80, 0, 10, 13, 20, 30

    }
}
