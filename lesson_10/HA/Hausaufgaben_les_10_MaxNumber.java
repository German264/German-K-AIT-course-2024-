package HA;
//Задача 4 (*)
//Задан массив целых чисел: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38.
//Найдите максимальный элемент массива и его индекс.

public class Hausaufgaben_les_10_MaxNumber {
    public static void main(String[] args) {

        int[] myNumber = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};
        int max = myNumber[0];
        int iMax = 0;
        for (int i = 0; i < myNumber.length; i++) {
            if (myNumber[i] > max) {
                max = myNumber[i];
                iMax = i;
            }
        }
        System.out.println("Максимальное число = " + max + ", его индекс = " + iMax);
    }
}
