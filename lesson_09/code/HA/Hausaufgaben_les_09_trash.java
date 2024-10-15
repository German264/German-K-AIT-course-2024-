package HA;

//Задача 4. Написать программу-бот, который помогает выбрасывать мусор в баки разных цветов:
//упаковки в желтый бак
//пищевые отходы в коричневый бак
//бумага в зеленый бак
//прочие отходы в черный бак
//Используйте цифры для кодирования вариантов действий.

import java.util.Scanner;

public class Hausaufgaben_les_09_trash {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите категорию мусора: 1 - Упаковки, 2 - Пищевые отходы, 3 - Бумага, 4 - Прочие отходы: ");
        int tank = scanner.nextInt();

        //Проверка правильности ввода
        while (0 > tank | tank > 5) {
            System.out.println("Такой категории нет, попробуйте еще раз (1 - 4): ");
            tank = scanner.nextInt(); // Ожидаем ввод
        }

        switch (tank) {
            case 1 -> {
                System.out.println("В желтый бак");
            }
            case 2 -> {
                System.out.println("В коричневый бак");
            }
            case 3 -> {
                System.out.println("В зеленый бак");
            }
            case 4 -> {
                System.out.println("В черный бак");
            }


        }
    }
}
