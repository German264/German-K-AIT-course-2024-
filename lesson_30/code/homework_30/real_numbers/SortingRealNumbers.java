package homework_30.real_numbers;

import java.util.Arrays;

public class SortingRealNumbers {
    public static void main(String[] args) {

        Double[] numbers = {7.5, 8.9, 1.0, 5.6, 0.7, 10.0, 9.8, 0.9, 3.6, 6.1};

        System.out.println("-------------Sort ascending----------------");
        Arrays.sort(numbers, (n1, n2) -> Double.compare(n1, n2));
        // draft print
        System.out.println(Arrays.toString(numbers));
        // for each
        int index = 0;
        for (Double i : numbers) {
            System.out.print(i + " ");
            index++;
        }

        System.out.println();
        System.out.println("-------------Sort descending----------------");
        Arrays.sort(numbers, (n1, n2) -> - Double.compare(n1, n2));
        // draft print
        System.out.println(Arrays.toString(numbers));
        // for each
        int index1 = 0;
        for (Double i : numbers) {
            System.out.print(i + " ");
            index++;
        }
        System.out.println();
    }
}
