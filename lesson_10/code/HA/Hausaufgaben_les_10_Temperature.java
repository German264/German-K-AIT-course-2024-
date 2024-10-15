package HA;
//Задача 1
//Собрать в массив данные о дневной температуре в вашем городе да прошедшую неделю.
//Выведите на печать температуру, которая была во вторник и затем в четверг.
//Найти среднюю температуру за прошлую неделю.

public class Hausaufgaben_les_10_Temperature {
    public static void main(String[] args) {
        double[] temper = {17.1, 16.2, 20.6, 22.7, 22.8, 23.3, 21.6}; //объявление массива в явном виде
        double sumTemper = 0;
        double averageTemper = 0;
        for (int i = 0; i < temper.length; i++) {
            sumTemper = sumTemper + temper[i];   // Суммируем все значения в массиве
        }
        averageTemper = sumTemper / temper.length;  // Вычисляем среднюю температуру за неделю
        System.out.printf("Средняя температура за прошлую неделю составила %.1f\u00B0С %n", averageTemper);
        System.out.println("Температура во вторник была " + temper[1] + " \u00B0С");
        System.out.println("Температура в четверг была " + temper[3] + " \u00B0С");
    }
}
