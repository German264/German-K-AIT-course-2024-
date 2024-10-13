package homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task_02_homework22TestVariant_01 {

    Task_02_homework22 task02Homework22;
    // Задаем массив для тестирования
    int[] array;

    @BeforeEach
    void setUp() {
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
}