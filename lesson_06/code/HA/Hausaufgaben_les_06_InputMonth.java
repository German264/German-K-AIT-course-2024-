package HA;

//Задача 2. Пользователь с клавиатуры вводит число от 1 до 12, программа сообщает,
// какому времени года принадлежит введенный месяц.

import java.util.Scanner;

public class Hausaufgaben_les_06_InputMonth {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Номер месяца: ");
        int numMonth = scanner.nextInt();

        switch (numMonth){
            case 1 -> {
                System.out.println("Это Январь.");
            }
            case 2 -> {
                System.out.println("Это Февраль.");
            }
            case 3 -> {
                System.out.println("Это Март.");
            }
            case 4 -> {
                System.out.println("Это Апрель.");
            }
            case 5 -> {
                System.out.println("Это Май.");
            }
            case 6 -> {
                System.out.println("Это Июнь.");
            }
            case 7 -> {
                System.out.println("Это Июль.");
            }
            case 8 -> {
                System.out.println("Это Август.");
            }
            case 9 -> {
                System.out.println("Это Сентябрь.");
            }
            case 10 -> {
                System.out.println("Это Октябрь.");
            }
            case 11 -> {
                System.out.println("Это Ноябрь.");
            }
            case 12 -> {
                System.out.println("Это Декабрь.");
            }
            default -> System.out.println("Такого месяца нет!");
        }
        switch (numMonth){
            case 1, 2, 12 ->{
                System.out.println("ЗИМА");
            }
            case 3, 4, 5 ->{
                System.out.println("ВЕСНА");
            }
            case 6, 7, 8 ->{
                System.out.println("ЛЕТО");
            }
            case 9, 10, 11 ->{
                System.out.println("ОСЕНЬ");
            }
        }

    }
}
