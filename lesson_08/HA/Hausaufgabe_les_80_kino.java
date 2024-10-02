package HA;

//Задача 4. В кинотеатре есть разные типы билетов: стандартный, студенческий (-10%) и для пенсионеров(-25%).
//Каждый тип билета имеет свою стоимость.
//Клиент может также выбрать место в VIP-зоне, что увеличит стоимость билета на 25%.
// Создайте метод calculateTicketPrice, который принимает:
//- возраст клиента
//- статус студента
//- флаг VIP-места
//- возвращает итоговую стоимость билета.
//Реализуйте приложение-бот, которое задает необходимые вопросы и объявляет стоимость билета.

import java.util.Scanner;

public class Hausaufgabe_les_80_kino {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Если Вы пенсионер - нажмите 1, если нет нажмите любую цифру:");
        int pensioner = scanner.nextInt();

        System.out.println("Если Вы студент - нажмите 1, если нет нажмите любую цифру: ");
        int student = scanner.nextInt();


        //Проверка правильности ввода
        while (pensioner == 1 & student == 1) {
            System.out.println("Неправильный ввод, попробуйте еще раз: ");

            System.out.println("Если Вы пенсионер - нажмите 1, если нет нажмите любую цифру: ");
            pensioner = scanner.nextInt(); // Ожидаем ввод

            System.out.println("Если Вы студент - нажмите 1, если нет нажмите любую цифру: ");
            student = scanner.nextInt();
        }

        System.out.println("Если Вы хотите билет в VIP зоне - нажмите 1, если нет нажмите любую цифру: ");
            int vip = scanner.nextInt();


            double standartTicket = 20;

            if (pensioner == 1 & vip == 1 & student != 1) {
                System.out.println("Стоимость билета ИТОГО: " + standartTicket * 0.75 * 1.25);
            }else if (pensioner == 1 & student != 1 & vip != 1) {
                System.out.println("Стоимость билета ИТОГО: " + standartTicket * 0.75);
            }
            if (student == 1 & vip == 1 & pensioner != 1) {
                System.out.println("Стоимость билета ИТОГО: " + standartTicket * 0.9 * 1.25);
            }else if (student == 1 & pensioner != 1 & vip != 1) {
                System.out.println("Стоимость билета ИТОГО: " + standartTicket * 0.9);
            }
            if (vip == 1 & pensioner != 1 & student != 1) {
                System.out.println("Стоимость билета ИТОГО: " + standartTicket * 1.25);
            }else if (pensioner != 1 & student != 1 & vip != 1) {
                System.out.println("Стоимость билета ИТОГО: " + standartTicket);
            }
        }
    }

