package homework_42;

//Задание 1.
//Соберите в структуру Map порядка 20 стран, по несколько стран из разных континентов Земли. Подсчитайте количество стран на континентах из полученного списка.

import java.util.HashMap;
import java.util.Map;

public class Countries {
    public static void main(String[] args) {

        Map<String, String> countries = new HashMap<>();

        countries.put("Russia", "Europe/Asia");
        countries.put("Germany", "Europe");
        countries.put("France", "Europe");
        countries.put("China", "Asia");
        countries.put("Japan", "Asia");
        countries.put("India", "Asia");
        countries.put("Egypt", "Africa");
        countries.put("South Africa", "Africa");
        countries.put("Nigeria", "Africa");
        countries.put("Australia", "Australia");
        countries.put("New Zealand", "Australia");
        countries.put("Brazil", "South America");
        countries.put("Argentina", "South America");
        countries.put("Colombia", "South America");
        countries.put("Canada", "North America");
        countries.put("United States", "North America");
        countries.put("Mexico", "North America");
        countries.put("Saudi Arabia", "Asia");
        countries.put("Italy", "Europe");
        countries.put("Kenya", "Africa");

        NumdersOfCountriesOnContinents(countries);
    }

    private static void NumdersOfCountriesOnContinents(Map<String, String> countries) {
        Map< String, Integer> resultMap = new HashMap<>();

        for (String continent : countries.values()) {
            if(!resultMap.containsKey(continent)){
                resultMap.put(continent, 1); // Континент встречается впервые
            } else { // когда такой континент уже есть в Map
                resultMap.put(continent, resultMap.get(continent) + 1); // увеличиваем частоту на 1
            }

        }
        for (String continent : resultMap.keySet()) {
            System.out.println("Continent: " + continent + ", Country: " + resultMap.get(continent));
        }
    }
}
