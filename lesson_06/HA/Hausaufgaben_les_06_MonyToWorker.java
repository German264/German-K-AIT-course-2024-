package HA;

//Задача 1. Напишите программу расчета выдачи денег работнику с учётом надбавки за стаж, если базовая зарплата 500$.
// За 3 года работы надбавка 10%,
// за 5 лет работы надбавка 50%,
// за 10 лет работы надбавка 100%,
// за 15 лет работы надбавка 150%.
// Сколько лет проработал работник вводится с клавиатуры.

import java.util.Scanner;

public class Hausaufgaben_les_06_MonyToWorker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Стаж работы: ");
        double length  = scanner. nextDouble();

        double wage = 500;
        double bonus = 0;
        double total = 0;

        if (length < 3){
            bonus = 0;
            total = wage;
        }else if (length >= 3 && length < 5){
            bonus = 10;
            total = wage * 1.1;
        }else if (length >= 5 && length < 10){
            bonus = 50;
            total = wage * 1.5;
        }else if (length >= 10 && length < 15){
            bonus = 100;
            total = wage * 2;
        } else if (length >= 15) {
            bonus = 150;
            total = wage * 2.5;
        }
        System.out.println("Базовая зарплата: "+wage+"  Надбавка за стаж (в процентах) : "+bonus+"  ИТОГО: "+total);
    }
}
