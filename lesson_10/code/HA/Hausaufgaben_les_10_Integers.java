package HA;
//Задача 3
//Создайте массив из 20 случайных(*) целых чисел в интервале от 10 до 30.
//Выведите массив на печать.
//Поменяйте местами первый и последний элементы массива и снова выведите массив на печать.

public class Hausaufgaben_les_10_Integers {
    public static void main(String[] args) {

        int[] integers = new int[20];
        int a = 10;
        int b = 30;
        for (int i = 0; i < integers.length; i++) {
            integers[i] = (int) (Math.random() * (b - a + 1)) + a; // генерируем случайные числа
            System.out.print(integers[i] + " ");
        }
    }
}

