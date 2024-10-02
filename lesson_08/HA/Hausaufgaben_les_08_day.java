package HA;

//Задача 3. Определение времени суток.
//Напишите программу, которая принимает на вход текущий час (от 0 до 23)
// и выводит приветствие в зависимости от времени суток (утро, день, вечер, ночь).

import java.util.Scanner;

public class Hausaufgaben_les_08_day {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите время суток: ");

        int time = scanner.nextInt();

        //Проверка правильности ввода
        while (24 < time | time < 0) {
            System.out.println("Такого времени в сутках нет, попробуйте еще раз: ");
            time = scanner.nextInt(); // Ожидаем ввод
        }
        if (time >= 6 && time < 12) {
            System.out.println("Утренние часы");
        } else if (time >= 12 && time < 18) {
            System.out.println("Дневные часы");
        } else if (time >= 18 && time < 24) {
            System.out.println("Вечерние часы");
        } else if (time >= 0 && time < 6) {
            System.out.println("Ночные часы");
        }

    }
}

