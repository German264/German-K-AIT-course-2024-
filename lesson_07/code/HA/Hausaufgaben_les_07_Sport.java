package HA;

//Задача 3. В первый день спортсмен пробежал s километров, а затем он каждый день увеличивал пробег на 10 % от предыдущего значения.
// Определите номер того дня, на который пробег спортсмена составит не менее target километров.
// Программа получает на вход действительные числа s и target и должна вывести одно натуральное число.

import java.util.Scanner;

public class Hausaufgaben_les_07_Sport {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Пробежал в первый день (километров): ");
        double sKm = scanner.nextDouble();

        System.out.println("Должен пробежать (километров): ");
        double target = scanner.nextDouble();

        double running = 0;
        int count = 0;

        while (running < target) {

            running = sKm + running * 1.1;;
            count++;

        }
        System.out.println("Пробег в " + target + " километров будет достигнут в день " + count);

    }
}
