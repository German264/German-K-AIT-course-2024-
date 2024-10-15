package HA;

//Задача 2. Написать программу, выводящую на экран максимальное из трех целых чисел.
//Числа задайте самостоятельно внутри программы.
//Решите эту задачу с помощью if ... else и также с помощью тернарного оператора.

public class Hausaufgaben_les_09_MaxNunber {
    public static void main(String[] args) {

        int a = 54;
        int b = 62;
        int c = 38;
        int max;

        if (a > b & a > c) {
            max = a;
        } else if (b > c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println("Максимум по методу 'if ... else': " + max);

        max = (a > b & a > c) ? a : (b > c) ? b : c; //ternary operator
        System.out.println("Максимум с помощью тернарного оператора: " + max);

    }
}
