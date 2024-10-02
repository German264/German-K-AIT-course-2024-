package HA;

//Задача 1. Программа получает на вход строку и число повторений этой строки.
// Программа должна вывести эту строку нужное количество раз.
// Пример: строка - молоко, кол-во раз 3 молоко молоко молоко

import java.util.Scanner;

public class Hausaufgaben_les_07_Line {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String line = scanner.nextLine();

        System.out.println("Сколько раз повторить?: ");
        int dat = scanner.nextInt();

        int count = 0;

        while (count < dat){
            System.out.println(line);
            count++;
        }
    }
}
