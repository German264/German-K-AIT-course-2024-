package Hausaufgaben_les_13;

//Задача 2. Подбросьте монетку 100 раз и подсчитайте, сколько раз выпал орел и сколько решка.
//Запишите результаты в массив. Рассчитайте вероятность выпадения орла и решки.

import java.util.Random;

public class ha2 {
    public static void main(String[] args) {
        Random random = new Random(); //сделали оъект

        int[] toss = new int[100];
        for (int i = 0; i < toss.length; i++) {
            //вызов датчика случайных чисел
            int n = random.nextInt(2) + 1; // генерируем случайное число от 0 до 5 и сдвигаем на 1
            toss[i] = n;
            System.out.print(toss[i] + " "); // выводим значение броска
        }
        System.out.println();

        //calculate results of tossing
        int[] res = new int[2]; //array for results
        for (int i = 0; i < toss.length; i++) {
            int n = toss[i];
            switch (n) {
                case 1 -> res[0]++;
                case 2 -> res[1]++;
            }
        }
        //print res
        System.out.print("'Орел' выпал: "+res[0]+" раза.    'Решка' выпала: "+res[1]+" раза.");
        System.out.println();

        double x = res[0];
        double y = res[1];

        double p1 = x / 100.0;
        double p2 = y / 100.0;

        System.out.println("Вероятность выпадания 'орла': " + p1 + "    Вероятность выпадания 'решки': " + p2);
    }
}
