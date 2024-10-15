package HA;

import java.util.Scanner;

//Задача 5.(*) Программа запрашивает у пользователя количество секунд, прошедших с начала суток.
//Нужно вывести часы, минуты и секунды.
//Проверьте, что число введенных пользователем секунд не более 86 400.

public class Hausaufgaben_les_09_secondsInDay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя секунды и проверяем правильность ввода

        System.out.println("Введите секунды (0 - 86400): ");
        int seconds = scanner.nextInt();

        while (0 > seconds || seconds > 86401) {
            System.out.println("Такого количества секунд в сутках нет, попробуйте еще раз (0 - 86400): ");
            seconds = scanner.nextInt();
        }
        int hoursDay = seconds / 3600;
        System.out.println("С начала суток прошло " + hoursDay + " часов");

        int minutesDay = (seconds - hoursDay * 3600) / 60;
        System.out.println("С начала суток прошло " + minutesDay + " минут");

        int secondsDay = seconds - hoursDay * 3600 - minutesDay * 60;
        System.out.println("С начала суток прошло " + secondsDay + " секунд");
    }
}
