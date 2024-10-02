package Hausaufgaben_14;

// Задача 2. Задача про поиск "счастливого пельменя".
// Хозяйка налепила для гостей 30 пельменей.
// В один из пельменей она положила монету, которая увеличивает вес пельменя на 15 грамм.
// Напишите программу, которая ищет счастливый пельмень.

import java.util.Random;

public class HA_14_Pelmeny {
    public static void main(String[] args) {

        // Часть 1: Заполнение массива n числами в диапазоне от a до b включительно
        int[] array = fillArray(15, 20, 29);
        System.out.println("Массив пельменей без 'счастливого':");
        printArray(array);// Выводим исходный массив пельменей по их весу

        // Создаем новый массив, размер которого на 1 больше исходного
        int newLength = array.length + 1;
        int[] newArray = copyOfArray(array, newLength); // Копируем старый массив в новый больший массив


        // Часть 2: Добавление случайного числа в случайное место в новый массив (добавляем "счастливый пельмень")
        Random random = new Random();
        int randomNumber = random.nextInt(20 - 15 + 1) + 15 +15; // Генерация случайного числа от 15 до 20 (вес пельменей) + вес монеты 15
        int randomIndex = random.nextInt(newArray.length); // Генерация случайного индекса для вставки числа

        // Сдвигаем элементы вправо, начиная с позиции randomIndex
        for (int i = newArray.length - 1; i > randomIndex; i--) {
            newArray[i] = newArray[i - 1]; // Сдвиг элементов
        }

        // Вставляем случайное число на случайное место
        newArray[randomIndex] = randomNumber;

        // Выводим новый массив
        System.out.println("Массив с добавленным 'счастливым пельменем' (случайным числом):");
        printArray(newArray);

        // Поиск и вывод веса и индекса "счастливого пельменя"
        int[] myArray = copyOfArray(newArray, newArray.length); ;
        bubbleSort(myArray);
        // Выводим отсортированный массив
        System.out.println("Отсортированный массив с добавленным 'счастливым пельменем':");
        printArray(myArray);

        int index = binarySearch(myArray, randomNumber);
        System.out.println("Вес 'счастливого пельменя' = " +randomNumber+", его индекс в массиве = "+index);
    }

    // Метод заполнения массива n числами в диапазоне от a до b включительно
    public static int[] fillArray(int a, int b, int n) {
        int[] res = new int[n];
        for (int i = 0; i < res.length; i++) {
            res[i] = (int) (Math.random() * (b - a + 1) + a); //случайные числа
        }
        return res;
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
