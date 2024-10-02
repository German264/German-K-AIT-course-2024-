package Hausaufgaben_14;

//Задача 1. Часть1. Заполните массив целыми числами от 1 до 100.
//Создайте второй массив с размером на 1 больше, чем имеющийся. Скопируйте первый массив в новый массив.
//Часть 2. Добавьте случайное целое число в интервале от 1 до 100 на случайное место в исходный массив.
//Часть 3. В полученном массиве найдите наиболее коротким способом, какое число было добавлено в массив.

import classwork_13.ArrayMethods;

import java.util.Random;

public class HA_14_SearchForNumberInArray {
    public static void main(String[] args) {

        // Часть 1: Заполнение массива числами от 1 до 100 и копирование в новый массив
        int[] array = new int[100]; // Исходный массив длиной 100
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1; // Заполняем элемент значением i+1 (числа от 1 до 100)
        }
        printArray(array);  // Выводим исходный массив

        // Создаем новый массив, размер которого на 1 больше исходного
        int newLength = array.length + 1;
        int[] newArray = copyOfArray(array, newLength); // Копируем старый массив в новый больший массив


        // Часть 2: Добавление случайного числа в случайное место в новый массив
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Генерация случайного числа от 1 до 100
        int randomIndex = random.nextInt(newArray.length); // Генерация случайного индекса для вставки числа

        // Сдвигаем элементы вправо, начиная с позиции randomIndex
        for (int i = newArray.length - 1; i > randomIndex; i--) {
            newArray[i] = newArray[i - 1]; // Сдвиг элементов
        }

        // Вставляем случайное число на случайное место
        newArray[randomIndex] = randomNumber;

        // Выводим новый массив
        System.out.println("Массив с добавленным случайным числом:");
        printArray(newArray);

        // ПРОСТОЙ СПОСОБ - ПРЯМОЙ ВЫВОД СЛУЧАЙНОГО ЧИСЛА И ЕГО ИНДЕКСА:
        // Выводим случайное число и его индекс в массиве
        System.out.println("Случайное число, добавленное в массив = " + randomNumber+", его индекс в массиве = "+randomIndex);

        // ПОИСК И ВЫВОД СЛУЧАЙНОГО ЧИСЛА ЧЕРЕЗ СОРТИРОВКУ МАССИВА И БИНАРНЫЙ ПОИСК:
        int[] myArray = copyOfArray(newArray, newArray.length); ;
        bubbleSort(myArray);
        // Выводим отсортированный массив
        System.out.println("Отсортированный массив:");
        printArray(myArray);

        int index = binarySearch(myArray, randomNumber);
        System.out.println("Случайное число, добавленное в массив = " +randomNumber+", его индекс в массиве = "+index);
    }

    // Метод для вывода массива
    public static void printArray(int[] res) {
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " "); // Выводим элементы массива
        }
        System.out.println();
    }

    // Метод для копирования массива
    public static int[] copyOfArray(int[] array, int newLength) {
        int[] newArray = new int[newLength];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i]; // Копируем элементы из исходного массива
        }
        return newArray;
    }

    // Сортируем массив
    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if(array[j] > array[j + 1]) { // compare 2 elements of array, if left > right => swap
                    //swapping
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Бинарный поиск
    public static int binarySearch(int[] array, int n){
        int leftIndex = 0;
        int rightIndex = array.length -1;

        while (leftIndex <= rightIndex){
            int midIndex = (leftIndex + rightIndex) / 2;
            if(array[midIndex] == n){
                return midIndex;
            } else if (n < array[midIndex]) {
                rightIndex = midIndex - 1; // правую половину надо отбросить
            } else {
                leftIndex = midIndex + 1; // левую половину надо отбросить
            }
        }
        return -leftIndex - 1; // если элемент не нашёлся
    }
}
