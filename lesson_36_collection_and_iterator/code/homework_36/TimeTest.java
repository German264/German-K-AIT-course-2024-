package homework_36;


import java.util.Arrays;

public class TimeTest {
    public static void main(String[] args) {

        // Определяем размеры массивов
        int[] sizes = {10, 100, 1000};

        for (int size : sizes) {
            // Заполняем массив случайными числами
            int[] newArray = TimeTest.fillArray(0, 1000, size);
            System.out.println("Исходный массив (" + size + " элементов): " + Arrays.toString(newArray));

            // Сортируем массив и замеряем время
            int[] sortedArray = TimeTest.bubbleSort(newArray);
            System.out.print("Отсортированный массив: ");
            for (int num : sortedArray) {
                System.out.print(num + " ");
            }
            System.out.println("\n");
        }
    }

    // Заполнение массива случайными числами
    // a - левая граница, b - правая граница, n - количество
    public static int[] fillArray(int a, int b, int n) {
        int[] res = new int[n];
        for (int i = 0; i < res.length; i++) {
            res[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        return res;
    }

    public static int[] bubbleSort(int[] array) {
        long t1 = System.currentTimeMillis(); // Запоминаем время начала
        // Основной цикл сортировки
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) { // Сравнение двух элементов массива, если левый больше правого => обмен
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        long t2 = System.currentTimeMillis(); // Запоминаем время окончания
        System.out.println("Время выполнения для " + array.length + " элементов: " + (t2 - t1) + " миллисекунд");
        return array;
    }
}

