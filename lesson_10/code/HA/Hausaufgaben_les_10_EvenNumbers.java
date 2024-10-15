package HA;
//Задача 2
//Заполнить массив четными числами от 0 до 50. 0, 2, 4, 8, ... , 42, 44, 48, 50
//Распечатать массив в порядке возрастания, затем в порядке убывания.

public class Hausaufgaben_les_10_EvenNumbers {
    public static void main(String[] args) {

        int[] numbers = new int[50];
        int evenNumbers = 0;

        //Массив в порядке возрастания
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            if ((numbers[i] % 2) == 0) {
                evenNumbers = numbers[i];
                System.out.print(evenNumbers + " ");
            }
        }
        System.out.println();
        //Массив в порядке убывания
        for (int i = numbers.length - 1; i >= 0; i--) {
            numbers[i] = i + 1;
            if ((numbers[i] % 2) == 0) {
                evenNumbers = numbers[i];
                System.out.print(evenNumbers + " ");
            }
        }
    }
}
