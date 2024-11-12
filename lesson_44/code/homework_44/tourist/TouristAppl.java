package homework_44.tourist;

//Задача 1.
//Турагентство специализируется на странах Средиземноморья - Испания, Франция, Италия, Греция, Турция, Тунис.
// Имеется таблица с данными о поездках клиентов в течение 2020-2023 годов в перечисленные страны. Каждый из клиентов посетил от одной до 3 стран, причем некоторые страны по 2 и более раз.
//Необходимо ответить на вопросы:
//Какие страны наиболее популярны?
//Кто из клиентов посетил наибольшее количество стран?

import classwork_44.programmer_and_technologies.Programmer;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TouristAppl {
    public static void main(String[] args) {

        // data set
        List<Tourist> tourists = fillListTourist(); // новый объект

        System.out.println("===================== List of all clients ==============================");
        tourists.forEach(System.out::println);

        // print countries
        System.out.println("=================== List of all countries ===============================");
        printCountries(tourists);

        System.out.println("========== Popularrity of countries by frequency of visits ==============");
        // countries => frequency
        printCountriesByFrequency(tourists);

        System.out.println("============ Most active clients (by countries visited) ==================");
        printMostActiveClients(tourists);

    } //end of main

    private static void printMostActiveClients(List<Tourist> tourists) {
        Map<Integer, List<Tourist>> activeClients = tourists.stream()
                .collect(Collectors.groupingBy(p -> p.getCountry().size()));
        activeClients.forEach((key, value) -> System.out.println(key + " : " + value));

        System.out.println("-------------------------- Champion --------------------------------------");
        // ищем max
        int max = activeClients.keySet().stream()
                .max(Integer::compareTo).orElse(0);
        List<Tourist> champ = tourists.stream()
                .filter(programmer -> programmer.getCountry().size() == max)
                .toList();
        System.out.println(champ);
    }

    private static void printCountriesByFrequency(List<Tourist> tourists) {
        // Map frequency => country
        Map< String , Long > countriesByFrequency = tourists.stream()
                .map(Tourist::getCountry)         // получаем список стран, посещенных каждым туристом
                .flatMap(List::stream)            // объединяем списки в единый поток
                .collect(Collectors.groupingBy(   // группируем по названию стран
                        country -> country,       // ключ - название страны
                        Collectors.counting()     // считаем количество посещений каждой страны
                ));
        countriesByFrequency.entrySet().stream()
                .sorted((entry1, entry2) -> Long.compare(entry2.getValue(), entry1.getValue())) //
                .forEach(entry -> System.out.printf("Страна: %s, Частота посещения: %d%n", entry.getKey(), entry.getValue()));
    }

    private static void printCountries(List<Tourist> tourists) {
        List<String> countries = tourists.stream()
                .map(Tourist::getCountry) // взяли спискии с языками
                .flatMap(List::stream) // объединили в один список, чтобы работать с новым потоком
                 .distinct()// убрали дубликаты
                .sorted()
                .toList();
                 countries.forEach(System.out::println);

    }

    private static List<Tourist> fillListTourist() {
        return List.of(
                new Tourist("Olesia", List.of("Iran", "Kyrgystan", "United Arab Emirates", "France", "Italy", "Portugal", "Spain")),
                new Tourist("Bilbo Baggins", List.of("Italy", "Spain", "Turkey")),
                new Tourist("Tatyana", List.of("Italy", "Spain", "Italy", "Greece", "Turkey")),
                new Tourist("Anton", List.of( "Germany", "Nederland", "Turkey", "Georgia")),
                new Tourist("Sergei_B", List.of( "Tunis", "Turkey", "China", "Vietnam")),
                new Tourist("Galina", List.of("Italy", "France", "Italy")),
                new Tourist("Anatoly", List.of( "Montenegro", "Albania", "Greece", "Italy")),
                new Tourist("Andrii", List.of("UK", "Ireland", "Spain")),
                new Tourist("Liubov", List.of( "Croatien", "Slovenien", "Spain", "France", "Egypt")),
                new Tourist("Liam", List.of("Spain", "Portugal", "Morocco", "Cyprus")),
                new Tourist("Emma", List.of( "Greece", "Turkey", "Croatia", "Montenegro")),
                new Tourist("Mia", List.of("Italy", "Malta", "Spain", "Turkey")),
                new Tourist("Noah", List.of( "Turkey", "Greece", "Italy", "Croatia")),
                new Tourist("Olivia", List.of( "Croatia", "Montenegro", "Albania", "Greece")),
                new Tourist("Lucas", List.of("Portugal", "Spain", "France", "Italy")),
                new Tourist("Amelia",List.of( "Greece", "Cyprus", "Spain", "Italy")),
                new Tourist("Oliver", List.of("Spain", "Italy", "Turkey", "Greece")),
                new Tourist("Isabella", List.of( "France", "Spain", "Italy", "Greece")),
                new Tourist("Ethan", List.of("Italy", "Greece", "Spain", "Croatia")),
                new Tourist("Ava", List.of("Greece", "Turkey", "Spain", "Italy")),
                new Tourist("Liam", List.of("Spain", "Italy", "Morocco", "Greece")),
                new Tourist("Sophia", List.of("Italy", "Spain", "Turkey", "Greece")),
                new Tourist("Jackson", List.of("Greece", "Spain", "Italy", "Croatia")),
                new Tourist("Olivia", List.of("Croatia", "Greece", "Italy", "Montenegro")),
                new Tourist("Logan", List.of( "Spain", "Greece", "Italy", "Turkey")),
                new Tourist("Emma", List.of("Greece", "Italy", "Spain", "Cyprus")),
                new Tourist("Aiden", List.of("Italy", "Greece", "Spain", "Turkey"))
        );
    }
} //end of class
