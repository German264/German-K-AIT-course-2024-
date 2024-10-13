package homework;

//Задача 2. Создайте массив из 100 случайных целых чисел в интервале от -10 до 10. Подсчитайте, сколько в этом массиве оказалось:
//положительных чисел;
//отрицательных чисел;
//четных чисел;
//нулей.
// Реализуйте все подсчеты методами и напишите для них тесты.

import java.util.Arrays;
import java.util.Objects;

public class Task_02_homework22 {

    private int[] array;

    public Task_02_homework22(int[] array) {
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
        return "Task_02_homework22{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task_02_homework22 that)) return false;
        return Objects.deepEquals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    //массив из 100 случайных целых чисел в интервале от -10 до 10
    public static int[] fillArray(int a, int b, int n) {
        a = -10;
        b = 10;
        n = 100;
        int[] res = new int[n];
        for (int i = 0; i < res.length; i++) {
            res[i] = (int) (Math.random() * (b - a + 1) + a); //случайные числа
        }
        return res;
    }
    //количество положительных чисел
    public static int countOfPositiveElements(int[] array) {
        int countPositive = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                countPositive ++;
            }
        }
        return countPositive;
    }

    //количество отрицательных чисел
    public static int countOfNegativeElements(int[] array) {
        int countNegative = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                countNegative ++;
            }
        }
        return countNegative;
    }

    //количество четных чисел
    public static int countOfEvenElements(int[] array) {
        int countEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countEven ++;
            }
        }
        return countEven;
    }

    //количество нулей
    public static int countOfNullElements(int[] array) {
        int countNull = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                countNull ++;
            }
        }
        return countNull;
    }
}
