package homework_33.to_do_list;

import homework_33.Days.Days;

import java.util.Scanner;

public class To_do_listAppl {
    public static void main(String[] args) {

        boolean flag = true;
        System.out.println("Добро пожаловать в меню списка дел!\n Выберите один из пунктов меню:");
        To_do_list[] lists = To_do_list.values();
        for (To_do_list list : lists) {
            System.out.println(list.getMenuItem() + " : " + list.getDescription() );
        }

        Scanner scanner = new Scanner(System.in);

        // start of loop
        while (flag) {

            int choice = scanner.nextInt();

            switch (choice) {
                case 1, 2, 3 -> {
                    System.out.println("Вы выбрали пункт "+ lists[choice - 1].getMenuItem() + " " + lists[choice - 1].getDescription() + "\n Выбирайте далее:");
                }
                case 4 -> {
                    flag = false;
                    System.out.println("Я надеюсь, что Вы хорошо провели время и совсем не устали. Спокойной ночи!");
                }
                default -> System.out.println("Wrong choice");
            }
        }
    }
}
