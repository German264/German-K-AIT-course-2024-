package homework;

//Задача 1. Реализуйте в классе ArrayMethods следующие методы для массивов целых чисел:
//сумма всех элементов массива с нечетными индексами;
//поиск 5-го элемента в массиве.
//Разработайте тесты для этих методов.

import java.util.Arrays;
import java.util.Objects;

public class Task_01_homework22 {

    private int[] array;

    public Task_01_homework22(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "Task_01{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task_01_homework22 that)) return false;
        return Objects.deepEquals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    //сумма всех элементов массива с нечетными индексами;
    public static int sumOfElementsOddIndex(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    //поиск 5-го элемента в массиве
    public static String findElementByIndex(int[] array, int i) {
        if (i < 0 || i >= array.length) {
            return "Индекс вне границ массива."; // Сообщение об ошибке
        }
        return "Элемент по индексу " + i + ": " + array[i];
    }
}

