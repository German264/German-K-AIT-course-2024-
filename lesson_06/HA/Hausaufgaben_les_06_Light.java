package HA;

//Задание 3. Напишите программу для машины на светофоре. Что делать водителю,
// если горит красный,
// жёлтый или зелёный свет.
// Цвет светофора задается в программе, затем с клавиатуры.

import java.util.Scanner;

public class Hausaufgaben_les_06_Light {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите номер света светофора: 1 - КРАСНЫЙ, 2 - Желтый, 3 - Зеленый ");
        int light = scanner.nextInt();

        switch (light) {
            case 1 -> {
                System.out.println("КРАСНЫЙ свет");
            }
            case 2 -> {
                System.out.println("ЖЕЛТЫЙ свет");
            }
            case 3 -> {
                System.out.println("ЗЕЛЕНЫЙ свет");
            }
        }

            switch (light) {
                case 1 -> {
                    System.out.println("Стоим.");
                }
                case 2 -> {
                    System.out.println("На перекресток не выезжать.");
                }
                case 3 -> {
                    System.out.println("Едем.");
                }
                default -> System.out.println("Такого света нет!");

        }
    }
}
