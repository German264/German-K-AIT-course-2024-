package homework_44.computer;

import homework_43.yacht.Yacht;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ComputerAppl {
    public static void main(String[] args) {

        List<Computer> computerList = new ArrayList<>();

        computerList.add(new Computer("i7", 8, 256, "Aser", 1200));
        computerList.add(new Computer("i5", 16, 256, "HP", 1500));
        computerList.add(new Computer("AMD", 8, 512, "NoName", 2000));
        computerList.add(new Computer("Intel i5", 8, 256, "Dell", 750));
        computerList.add(new Computer("AMD Ryzen 5", 16, 512, "HP", 850));
        computerList.add(new Computer("Intel i7", 32, 1024, "Apple", 1500));

        // Задачи:
        // 1. Отобразить все компьютеры
        System.out.println("Все компьютеры:");
        computerList.forEach(System.out::println);

        // 2. Отобразить компьютеры с одинаковым ram
        int ram = 8;
        System.out.println("\n----------------------Компьютеры с одинаковым ram " + ram + ":--------------------");
        computerList.stream()
                .filter(computer -> computer.getRam() == ram)
                .forEach(System.out::println);

        // 3. Отобразить компьютеры дороже указанной цены
        double priceLimit = 850;
        System.out.println("\n-----------------------Компьютеры дороже " + priceLimit + ":-------------------------");
        computerList.stream()
                .filter(computer -> computer.getPrice() > priceLimit)
                .forEach(System.out::println);

        // 4. Отобразить коьпьютеры, чей ssd находится в заданном диапазоне
        int ssdStart = 256;
        int ssdEnd = 512;
        System.out.println("\n---------------------Компьютеры с ssd от " + ssdStart + " до " + ssdEnd + ":-------------------");
        computerList.stream()
                .filter(computer -> computer.getSsd() >= ssdStart && computer.getSsd() <= ssdEnd)
                .forEach(System.out::println);

        // 5. Отсортировать компьютеры в порядке убывания стоимости
        System.out.println("\n----------------Компьютеры, отсортированные по стоимости:---------------");
        computerList.stream()
                .sorted(Comparator.comparingDouble(Computer::getPrice))
                .forEach(System.out::println);

        // 6. Получить среднюю стоимость компьютера
        double averagePrice = computerList.stream()
                .mapToDouble(Computer::getPrice)
                .average()
                .orElse(0.0);
        System.out.println("\n----------Средняя стоимость компьютера: " + averagePrice + "--------------------------");
    }
}
