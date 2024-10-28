package classwork_33.coffee_mashine;

import java.util.Scanner;

public class CoffeeAppl {
    public static void main(String[] args) {

        System.out.println("Welcome to Coffee Shop!");
        boolean flag = true;
        Coffee[] coffees = Coffee.values();

        Scanner scanner = new Scanner(System.in);

        // start of loop
        while (flag) {
            System.out.println("Input your choice: Press 1 for Espresso, 2 for Americano,3 for Capuccino,4 for Latte\");");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1, 2, 3, 4 -> {
                    System.out.println("Your choice is: " + coffees[choice - 1].getTitle());
                    System.out.println("Pls, make payment: " + coffees[choice - 1].getPrice());
                }
//                case 2 -> {
//                    System.out.println("Your choice is: " + coffees[choice - 1].getTitle());
//                    System.out.println("Pls, make payment: " + coffees[choice - 1].getPrice());
//                }
//                case 3 -> {
//                    System.out.println("Your choice is: " + coffees[choice - 1].getTitle());
//                    System.out.println("Pls, make payment: " + coffees[choice - 1].getPrice());
//                }
//                case 4 -> {
//                    System.out.println("Your choice is: " + coffees[choice - 1].getTitle());
//                    System.out.println("Pls, make payment: " + coffees[choice - 1].getPrice());
//                }

                case 5 -> flag = false;
                default -> System.out.println("Wrong choice");
            }
        }
    }
}
