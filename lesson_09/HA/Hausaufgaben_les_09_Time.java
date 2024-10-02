package HA;
//Задача 1. В программе задаются часы, минуты и секунды.
//Нужно вывести общее количество секунд, прошедших с начала суток.
//Вычисление произведите в методе, который получает на вход часы, минуты и секунды.

import java.util.Scanner;

public class Hausaufgaben_les_09_Time {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя часы, минуты и секунды и проверяем правильность ввода

        System.out.println("Введите часы (0-23): ");
        int hours = scanner.nextInt();

        while (0 > hours || hours > 23) {
            System.out.println("Такого часа в сутках нет, попробуйте еще раз: ");
            hours = scanner.nextInt();
        }
        System.out.print("Введите минуты (0-59): ");
        int minutes = scanner.nextInt();
        while (0 > minutes | minutes > 59) {
            System.out.println("Такой минуты в часе нет, попробуйте еще раз: ");
            minutes = scanner.nextInt();
        }
        System.out.print("Введите секунды (0-59): ");
        int seconds = scanner.nextInt();
        while (0 > seconds | seconds > 59) {
            System.out.println("Такой секунды в минуте нет, попробуйте еще раз: ");
            seconds = scanner.nextInt();
        }

        int res = hours * 60 * 60 + minutes * 60 + seconds;
        System.out.println("С начала суток прошло "+ res +" секунд");

    }
}
