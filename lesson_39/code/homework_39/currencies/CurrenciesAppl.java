package homework_39.currencies;

import java.util.*;

public class CurrenciesAppl {
    public static void main(String[] args) {

        Set<Currencies> currencies = new LinkedHashSet<>(Arrays.asList(Currencies.values()));

        System.out.println("Курсы валют к Euro:");
        for (Currencies curr : currencies) {
            System.out.println(curr);
        }
        System.out.println("----------------------------------");

        boolean flag = true;

        Scanner scanner = new Scanner(System.in);

        // start of loop
        while (flag) {
            System.out.println("Выберите, какую валюту вы хотите обменять на Euro: Нажмите 1 если USD, 2 если GBP,3 если JPY,4 если CHF,5 если AUD,6 если CAD,7 если CNY,8 если RUB,9 - Завершить обмен\");");
            int choice = scanner.nextInt();

            Currencies selectedCurrency = null;

            switch (choice) {
                case 1 -> selectedCurrency = Currencies.USD;
                case 2 -> selectedCurrency = Currencies.GBP;
                case 3 -> selectedCurrency = Currencies.JPY;
                case 4 -> selectedCurrency = Currencies.CHF;
                case 5 -> selectedCurrency = Currencies.AUD;
                case 6 -> selectedCurrency = Currencies.CAD;
                case 7 -> selectedCurrency = Currencies.CNY;
                case 8 -> selectedCurrency = Currencies.RUB;
                case 9 -> {
                    flag = false;// Выход из программы
                    System.out.println("Жаль что вы уходите, приходите еще!");
                }
                default -> System.out.println("Неверный выбор");
            }

            if (selectedCurrency != null) {
                System.out.println("Вы выбрали: " + selectedCurrency);
                System.out.print("Введите сумму: ");
                double sum = scanner.nextDouble();
                double sumInEuro = sum / selectedCurrency.getRateToEuro();
                System.out.println("К выдаче в Euro: " + sumInEuro);
            }
        }
        scanner.close(); // Закрываем сканер после завершения работы
    }
}

