package classwork_13;

import java.util.Scanner;

public class ArrayMethodsAppl {

    public static void main(String[] args) {

//        int[] myArray = ArrayMethods.fillArray(-10, 10, 20);
//
//        ArrayMethods.printArray(myArray);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input number for searching: ");
//        int n = scanner.nextInt();
//
//        boolean isInArray = ArrayMethods11.searchInArray(myArray, n);
//        System.out.println("Number " + n + " is in array: " + isInArray);

        int[] myArray = {10, 20, 30, 40, 50};
        System.out.println(ArrayMethods.linearSearch(myArray, 10));
        System.out.println(ArrayMethods.linearSearch(myArray, 100));

        System.out.println("-------------------------------------------");

        int index = ArrayMethods.binarySearch(myArray, 20);
        System.out.println(index);

    }

}
