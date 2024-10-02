package Hausaufgaben_14;

// На повторение: Задача 2. В сберкассу на трёхпроцентный вклад положили s рублей.
// Какой станет сумма вклада через n лет.
// Использовать цикл for.

import java.util.Scanner;

public class HA_14_Sberkassa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");
        double s = scanner.nextInt();

        System.out.println("Через солько лет?: ");
        int n = scanner.nextInt();

        int p = 3; // Процентная ставка
        int count = 0;

        for (int i = 0; i < n; i++) {
            s = s + s * p / 100;
        }
        System.out.printf("Сумма вклада через %d лет: %.2f рублей%n", n, s);
    }
}
