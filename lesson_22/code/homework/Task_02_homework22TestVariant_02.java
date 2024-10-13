package homework;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task_02_homework22TestVariant_02 {

    static Task_02_homework22 task02Homework22;
    static int[] array; // Задаем массив, который будет использоваться для всех тестов (один и тот же)

    @BeforeAll
    static void setUp() {
        task02Homework22 = new Task_02_homework22(array);
        array = Task_02_homework22.fillArray(-10, 10, 100);
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Выводим массив:");
        System.out.println(Arrays.toString(array));
    }

    @Test
    void testCountPositiveNumbers() {
        // Проверяем, что метод корректно считает положительные числа
        int count = Task_02_homework22.countOfPositiveElements(array);
        System.out.println("Положительных чисел: " + count);
        assertTrue(count >= 0 && count <= 100, "Неправильное количество положительных чисел");
    }

    @Test
    void testCountNegativeNumbers() {
        // Проверяем, что метод корректно считает отрицательные числа
        int count = Task_02_homework22.countOfNegativeElements(array);
        System.out.println("Отрицательных чисел: " + count);
        assertTrue(count >= 0 && count <= 100, "Неправильное количество отрицательных чисел");
    }

    @Test
    void testCountEvenNumbers() {
        // Проверяем, что метод корректно считает четные числа
        int count = Task_02_homework22.countOfEvenElements(array);
        System.out.println("Четных чисел: " + count);
        assertTrue(count >= 0 && count <= 100, "Неправильное количество четных чисел");
    }

    @Test
    void testCountZeros() {
        // Проверяем, что метод корректно считает нули
        int count = Task_02_homework22.countOfNullElements(array);
        System.out.println("Нулей: " + count);
        assertTrue(count >= 0 && count <= 100, "Неправильное количество нулей");
    }

    @Test
    void fillArray() {
        int a = -10;
        int b = 10;
        int n = 100;
        // Вызов метода fillArray и получение результата и генерирование массива
        int[] res = Task_02_homework22.fillArray(a, b, n);
        // Проверка, что длина массива равна 100
        assertEquals(n, res.length);
        // Проверка, что все элементы массива находятся в диапазоне от -10 до 10
        for (int i = 0; i < res.length; i++) {
            assertTrue(res[i] >= a && res[i] <= b, "Элемент массива вне диапазона: " + res[i]);
        }
        int expected = 100;
        int sumEl = Task_02_homework22.countOfPositiveElements(array) + Task_02_homework22.countOfNegativeElements(array) + Task_02_homework22.countOfNullElements(array);
        System.out.println("Общее количество положительных, отрицательных чисел и нулей равно количеству элементов массива.");
        assertEquals(expected, sumEl,"Общее количество положительных, отрицательных чисел и нулей НЕ равно количеству элементов массива.");
    }
}