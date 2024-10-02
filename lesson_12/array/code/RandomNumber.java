//Задайте массив из 10 случайных натуральных чисел в интервале от 1 до 100.
//Запросите у пользователя какое-то натуральное число.
//Определите, есть ли это число в массиве.
//Создайте и используйте метод searchInArray, который получает на вход массив и искомое число, а возвращает
//ответ - нашлось ли это число в массиве.

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[10];
        //fill in array numbers
        for (int i = 0; i< numbers.length; i++){
            numbers[i] = random.nextInt(100)+1;
        }
        //print array
        printArray(numbers);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive integer mumber: ");
        int n = scanner.nextInt();

        boolean isInArray = searchInArray(numbers, n);
        System.out.println("Number "+n+" is in array: "+isInArray);
    }

    private static boolean searchInArray(int[] numbers, int n) {
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == n){
                return true;
            }
        }
        return false;
    }
    private static void printArray(int[] array){
        for (int i = 0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("---------------------------------");
    }
}
