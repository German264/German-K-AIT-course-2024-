package homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class Task01homework22Test {

    Task_01_homework22 task_01_homework22; //object
    // Задаем массив для тестирования
    int[] array = {0,1,2,3,4,5,6,7,8,9};

    @BeforeEach
    void setUp() {
        task_01_homework22 = new Task_01_homework22(array);
    }

    @Test
    void sumOfElements() {
        //expected
        int expected = 25;
        //actual
        int sum = Task_01_homework22.sumOfElementsOddIndex(array);
        assertEquals(expected, sum);
    }

    @Test
    void findElementByIndex() {
        int i = 5;
        //expected
        String expected = "Элемент по индексу 5: 5";
        //actual
        String actual = Task_01_homework22.findElementByIndex(array, i);
        assertEquals(expected, actual, "Индекс вне границ массива.");

    }
}