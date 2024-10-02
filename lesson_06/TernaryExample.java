//**Задание 2.**
//  В программе задаются два целых числа.
//  Найдите минимальное из них с помощью тернарного оператора.
//  Дополните программу возможностью ввода чисел пользователем.

import java.util.Scanner;

public class TernaryExample {
    public static void main(String[] args) {

        int a=500;
        int b=200;

        int min=(a<b)?a:b; //ternary operator

        System.out.println("Min = "+min);

        int max=(a>b)?a:b; //ternary operator

        System.out.println("Max = "+max);

        //input data

        Scanner scanner = new Scanner(System.in); //Вызов сканера
        System.out.println("Input 1st number: ");
        a= scanner.nextInt();
        System.out.println("Input 2st number: ");
        b= scanner.nextInt();

        min=minAB(a,b);  //call method
        System.out.println("Min = "+min);
    }

    public static int minAB(int a, int b){
        return (a<b)?a:b;
    }
}
