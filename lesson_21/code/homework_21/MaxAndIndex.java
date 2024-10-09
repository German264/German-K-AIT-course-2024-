package homework_21;

//Задание 2. Разработайте тесты для методов обрабатывающих массивы:
//поиск минимального (максимального) элемента
//поиск индекса минимального (максимального) элемента

import java.util.Arrays;
import java.util.Objects;

public class MaxAndIndex {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 1, 9, 2};
        MaxAndIndex array = new MaxAndIndex(numbers); // Использование класса MaxAndIndex

        // Вызов метода findMaxAndIndex и получение результата
        int[] result = array.findMaxAndIndex();
        int maxOfArray = result[0]; // Максимальный элемент
        int indexOfMaxElement = result[1]; // Индекс максимального элемента

        // Вывод результата
        System.out.println("Максимальный элемент массива = " + maxOfArray + ", индекс максимального элемента = " + indexOfMaxElement);
    }

    private int[] array;

    public MaxAndIndex(int[] array) {
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
        return "MaxAndIndex{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MaxAndIndex that)) return false;
        return Objects.deepEquals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    // Метод для поиска максимального значения и его индекса
    public int[] findMaxAndIndex() {
        int maxOfArray = array[0];
        int indexOfMaxElement = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxOfArray) {
                maxOfArray = array[i];
                indexOfMaxElement = i;
            }
        }
        return new int[] {maxOfArray, indexOfMaxElement}; // Возвращаем массив с максимальным значением и его индексом
    }
}