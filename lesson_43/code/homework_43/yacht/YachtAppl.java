package homework_43.yacht;

//Задание 3.
//Создать класс «Яхта» (Boat). В классе должна храниться следующая информация:
//производитель(верфь);
//страна (флаг);
//год выпуска;
//длина;
//материал корпуса (дерево, пластик, металл);
//стоимость.
//Нужно создать набор яхт и выполнить следующие задачи:
//отобразить все яхты;
//отобразить яхты, сделанные из указанного материала корпуса;
//отобразить яхты дороже указанной цены;
//отобразить яхты, чей год выпуска находится в заданном диапазоне;
//отсортировать яхты в порядке убывания стоимости;
//получить среднюю стоимость яхты из созданного набора;
//сколько и конкретно какие яхты под каким флагом стоят в порту.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class YachtAppl {
    public static void main(String[] args) {

        // Создание списка яхт
        List<Yacht> yachts = new ArrayList<>();
        yachts.add(new Yacht("Verft1", "USA", 2015, 30.5, "Wood", 1000000));
        yachts.add(new Yacht("Verft2", "Germany", 2018, 25.0, "Metal", 2000000));
        yachts.add(new Yacht("Verft3", "Italy", 2020, 28.0, "Plastic", 1500000));
        yachts.add(new Yacht("Verft4", "France", 2016, 22.5, "Wood", 800000));
        yachts.add(new Yacht("Verft5", "Japan", 2019, 32.0, "Metal", 2500000));
        yachts.add(new Yacht("Verft6", "Spain", 2017, 27.0, "Plastic", 1200000));

        // Задачи:
        // 1. Отобразить все яхты
        System.out.println("Все яхты:");
        yachts.forEach(System.out::println);

        // 2. Отобразить яхты, сделанные из указанного материала корпуса
        String material = "Wood";
        System.out.println("\nЯхты из материала " + material + ":");
        yachts.stream()
                .filter(yacht -> yacht.getMaterial().equalsIgnoreCase(material))
                .forEach(System.out::println);

        // 3. Отобразить яхты дороже указанной цены
        double priceLimit = 1500000;
        System.out.println("\nЯхты дороже " + priceLimit + ":");
        yachts.stream()
                .filter(yacht -> yacht.getPrice() > priceLimit)
                .forEach(System.out::println);

        // 4. Отобразить яхты, чей год выпуска находится в заданном диапазоне
        int yearStart = 2015;
        int yearEnd = 2018;
        System.out.println("\nЯхты, выпущенные с " + yearStart + " по " + yearEnd + ":");
        yachts.stream()
                .filter(yacht -> yacht.getYearOfManufacture() >= yearStart && yacht.getYearOfManufacture() <= yearEnd)
                .forEach(System.out::println);

        // 5. Отсортировать яхты в порядке убывания стоимости
        System.out.println("\nЯхты, отсортированные по стоимости:");
        yachts.stream()
                .sorted(Comparator.comparingDouble(Yacht::getPrice).reversed())
                .forEach(System.out::println);

        // 6. Получить среднюю стоимость яхты
        double averagePrice = yachts.stream()
                .mapToDouble(Yacht::getPrice)
                .average()
                .orElse(0.0);
        System.out.println("\nСредняя стоимость яхты: " + averagePrice);

        // 7. Сколько и конкретно какие яхты под каким флагом стоят в порту
        System.out.println("\nЯхты по флагам:");
        Map<String, List<Yacht>> yachtsByCountry = yachts.stream()
                .collect(Collectors.groupingBy(Yacht::getCountry));

        yachtsByCountry.forEach((country, countryYachts) -> {
            System.out.println(country + ":");
            countryYachts.forEach(System.out::println);
        });
    }
}
