package HA;

//Задача 2. Вводится положительное целое число, найдите сумму его цифр.
// Пример: 1725, сумма цифр = 15

import java.util.Scanner;

public class Hausaufgaben_les_07_sumDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");
        int number = scanner.nextInt();

        int res = 0;

        while (number > 0) {

            res = res + number % 10;
            number = number / 10;

        }
        System.out.println("Сумма цифр введенного числа равна: " +res);
    }
}
