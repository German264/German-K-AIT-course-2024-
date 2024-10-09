package homework_20;
//Задание 1. Напишите программу, которая запрашивает у пользователя строку, содержащую целые числа, и выводит сумму всех этих введенных чисел.
// Используйте классы-обёртки для преобразования строк в соответствующие примитивы.
import java.util.Scanner;

public class SumString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Просим пользователя ввести строку целых чисел
        System.out.println("Введите строку целых чисел, разделенных пробелами:");

        // Считываем строку
        String input = scanner.nextLine();

        // Разделяем строку по пробелам, чтобы получить массив строк
        String[] numbers = input.split("\\s+");

        // Преобразуем каждую строку в целое число и выводим его
        System.out.println("Вы ввели:");
        for (String number : numbers) {  /*Цикл "for-each" перебирает все элементы массива numbers.
                                           Для каждого элемента массива (в данном случае строки, содержащей число) создаётся переменная number,
                                           которая поочерёдно принимает значение каждого элемента массива*/
            int num = Integer.parseInt(number);  // Преобразуем строку в int
            System.out.print(num + " ");
        }
        System.out.println();

        // Подсчет суммы чисел
        int sum = 0;
        for (String number : numbers) {
            int num = Integer.parseInt(number);  // Преобразуем строку в int
            sum += num;  // Суммируем числа
        }

        // Вывод суммы чисел
        System.out.println("Сумма чисел: " + sum);
    }
}