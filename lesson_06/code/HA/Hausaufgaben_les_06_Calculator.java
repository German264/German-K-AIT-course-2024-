package HA;

import java.util.Scanner;

public class Hausaufgaben_les_06_Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Первое число: ");
        int dat1 = scanner.nextInt();

        System.out.println("ВВедите номер операции: 1 => +, 2 => - , 3 => *, 4 => /, 5 => %");
        int oper = scanner.nextInt();

        System.out.println("Второе число: ");
        int dat2 = scanner.nextInt();

        switch (oper){
            case 1 -> {
               int res = dat1 + dat2;
                System.out.println("Результат: "+res);
            }
            case 2 -> {
                int res = dat1 - dat2;
                System.out.println("Результат: "+res);
            }
            case 3 -> {
                int res = dat1 * dat2;
                System.out.println("Результат: "+res);
            }
            case 4 -> {
                int res = dat1 / dat2;
                System.out.println("Результат: "+res);
            }
            case 5 -> {
                int res = dat1 % dat2;
                System.out.println("Результат: "+res);
            }
            default -> System.out.println("Операция не существует!");
        }

        }


    }

