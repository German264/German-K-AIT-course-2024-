package HA;

//Задача 1. Чему равно значение выражения x-- + --x при x = 5? Проверьте свое предположение с помощью кода.

public class Hausaufgaben_les_08_x {
    public static void main(String[] args) {
        int x = 5;
        int x1 = --x;
        int x2 = x--;

        int y = x1 + x2;

        int z = 6;
        int a = --z;
        System.out.println(a);
        System.out.println(--z);

        int r = 7;
        int t = r--;
        System.out.println(t);
        System.out.println(r);

        System.out.println("x-- + --x при x = 5 равно: "+y);
    }
}
