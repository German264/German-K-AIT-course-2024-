package Hausaufgaben_les_13;

//Задача 1. Написать метод copyOfArray.
//Метод принимает на вход массив целых чисел и целое число - длину нового массива newLength.
//Метод должен создать новый массив длиной newLength.
//В новый массив должны быть скопированы элементы из входящего массива:
//Пример: Исходный массив: {0, 1, 2, 3, 4 , 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}

public class ha1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7}; // Исходный массив
        int newLength = 4; // Новая длина для копирования
        System.out.println("Новый массив длиной " + newLength + ":");
        // Копируем массив
        int[] newArray = copyOfArray(array, newLength);
        // Выводим результат копирования
        printArray(newArray);
    }
    // Метод для копирования массива
    public static int[] copyOfArray(int[] array, int newLength) {
        int[] newArray = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }
    // Метод для вывода массива
    public static void printArray(int[] res) {
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " "); // Выводим элементы массива
        }
        System.out.println();
    }
}

