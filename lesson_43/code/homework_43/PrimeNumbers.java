package homework_43;

//Задание 2.
//Имеется набор целых чисел: 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20. Требуется из этого списка отобрать только простые числа.
//Используйте методы stream()

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumbers {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        // Отбираем только простые числа
        List<Integer> primeNumbers = numbers.stream()
                .filter(PrimeNumbers::isPrime)  // Фильтрация по методу isPrime
                .collect(Collectors.toList()); // Сбор в новый список

        System.out.println("Простые числа: " + primeNumbers);
    }

    // Метод для проверки простоты числа
    private static boolean isPrime(int number) {
        if (number <= 1) return false; // Число должно быть больше 1
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false; // Если делится на i, то не простое
        }
        return true; // Если не делится на числа от 2 до sqrt(number), то простое
    }
}
