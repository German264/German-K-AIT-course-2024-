package Hausaufgaben_14;

//
// На повторение: Задача 1. Найти произведение всех двузначных нечетных чисел кратных 17.

public class HA_14_multiplesNumbers {
    public static void main(String[] args) {

        // Массив длиной 90
        int[] numbers = new int[90];
        int product = 1;

        // Заполняем массив двузначными числами от 10 до 99
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 10;
        }
        System.out.println("Двузначные нечетные числа кратные 17:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0 && numbers[i] % 17 == 0) {
                System.out.print(numbers[i] + "  ");
                product = product * numbers[i];
            }
        }
        System.out.println();
        System.out.println("Произведение двузначных нечетных чисел кратных 17 = " + product);
    }
}
