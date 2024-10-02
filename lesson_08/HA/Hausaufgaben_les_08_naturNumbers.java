package HA;

//Задача 2. Распечатайте все натуральные числа меньшие 200 и кратные 13. Используйте циклы while и do while.

import java.util.Scanner;

public class Hausaufgaben_les_08_naturNumbers {
    public static void main(String[] args) {

        int num = 1; //Парам. цикла
        int x = 201;

        while (num < x) {
            if (num % 13 == 0) {
                System.out.print(num + " ");
            }
            num++; //Постфиксная операция, увел. на 1
        }
        System.out.println();
        int num1 = 1; //Парам. цикла
        int x1 = 201;

        do {
            if (num1 % 13 == 0) {
                System.out.print(num1 + " ");
            }
            num1++; //Постфиксная операция, увел. на 1
        }
        while (num1 < x1);
    }
}
