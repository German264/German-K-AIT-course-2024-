package cycles;

//Пользователь вводит натуральное число (целое, положительное).
//Выясните, сколько цифр в числе.

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {

        //5467
        //--------------
        //5467 % 10 = 7 - первая цифра справа числа
        //5467 / 10 = 546
        //продолжим в цикле / 10 пока рез. > 0

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inpun positive integer number: ");
        int number = scanner.nextInt();
        int number1 = number;

        int count = 0;

        while (number > 0){
            number = number / 10; //number - параметр цикла
            System.out.println(number);
            count++;

        }
        System.out.println("Digits in number "+ number1 +" are = "+ count);


    }
}
