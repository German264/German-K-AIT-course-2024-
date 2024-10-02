package HA;
//Задача 1
//Задан массив целых чисел: 65, 37, 51, -17, 73, -41, 52, 56, -55, 83.
//Найдите максимальный элемент массива и его индекс. Поставьте этот элемент в начало массива.

public class Hausaufgaben_les_11_Max {
    public static void main(String[] args) {

        int[] array = {65, 37, 51, -17, 73, -41, 52, 56, -55, 83};
        int maxOfArray = array[0];
        int indexOfMaxElement = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxOfArray) {
                maxOfArray = array[i];
                indexOfMaxElement = i;
            }
        }
        System.out.println("Максимальный элемент массива = " + maxOfArray + ", индекс максимального элемента = " + indexOfMaxElement);

        // Сдвигаем элементы массива вправо начиная с индекса 1
        for (int i = indexOfMaxElement; i > 0; i--) {
            array[i] = array[i - 1];
        }

        // Устанавливаем максимальный элемент на первое место
        array[0] = maxOfArray;

        // Вывод массива после сдвига
        System.out.print("Максимальный элемент в начале массива (массив сдвигается): ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
