package Hausaufgaben_les_13;

public class ha2_MethodAppl {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7}; // Исходный массив
        int newLength = 4; // Новая длина для копирования
        System.out.println("Новый массив длиной " + newLength + ":");
        // Копируем массив
        int[] newArray = ha1_Method.copyOfArray(array, newLength);
        // Выводим результат копирования
        ha1_Method.printArray(newArray);
    }
}
