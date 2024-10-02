package Hausaufgaben_les_13;

public class ha1_Method {

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
