package homework_34.time.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

public class DateOperation {

    //  Этот метод принимает дату рождения в виде стринга,
    //    и возвращающий возраст.

    public static int getAge(String birthDate) {
        // TODO Homework
        LocalDate birth = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd]"));
        LocalDate ld = LocalDate.now();
        long age = ChronoUnit.YEARS.between(birth, ld);
        return (int) age;
    }

    public static String[] sortStringDates(String[] dates) {
        // TODO Homework
        // Определяем DateTimeFormatter для разных форматов
        DateTimeFormatter df = DateTimeFormatter.ofPattern("[yyyy-MM-dd][dd/MM/yyyy]");

        // Создаем пары (исходная строка, LocalDate), сортируем по LocalDate и возвращаем исходные строки
        return Arrays.stream(dates)
                .map(date -> new Object[]{date, LocalDate.parse(date, df)}) // Пары (исходная строка, LocalDate)
                .sorted(Comparator.comparing(o -> (LocalDate) o[1])) // Сортировка по LocalDate
                .map(o -> (String) o[0]) // Извлечение исходных строк в отсортированном порядке
                .toArray(String[]::new); // Преобразование потока в массив строк
    }
}
