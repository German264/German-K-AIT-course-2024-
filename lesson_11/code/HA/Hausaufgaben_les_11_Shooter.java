package HA;
//Задача 2
//У стрелка есть 10 попыток поразить мишень.
//Смоделируйте 10 выстрелов с помощью датчика случайных чисел.
//Ответьте на вопрос, сколько очков набрал стрелок?
//Попал ли он хоть раз в центр мишени?

import java.util.Random;

public class Hausaufgaben_les_11_Shooter {
    public static void main(String[] args) {
        Random random = new Random(); //сделали оъект (датчик случайных чисел)

        int[] shooting = new int[10];

        System.out.print("Выбил очков за 10 выстрелов: ");
        System.out.println();
        for (int i = 0; i < shooting.length; i++) {
            //вызов датчика случайных чисел (куда стрелок попал за 10 выстрелов)
            shooting[i] = random.nextInt(11); //диапазон очков на выстрел от 1 до 10 включительно
            System.out.print(shooting[i] + " ");
        }
        System.out.println();

        // сколько очков выбил всего
        int sum = 0;
        for (int i = 0; i < shooting.length; i++) {
            sum += shooting[i]; // добавляем очки каждого выстрела
        }
        System.out.println("Всего очков: " + sum);

        boolean res = false;
        for (int i = 0; i < shooting.length; i++) {
            if (shooting[i] == 10) {
                res = true;
                boolean isTrue = true; // или false

                if (isTrue) {
                    System.out.println("да");
                } else {
                    System.out.println("нет");
                }
            }
        }
        System.out.println("Попал в 'десятку' хоть раз? " + (res ? "ДА!" : "НЕТ."));
    }
}
