package homework_38.day_temperature;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DayTemperatureAppl {
    public static void main(String[] args) {

        List<DayTemperature> octoberTemperatures = new ArrayList<>();
        List<DayTemperature> novemberTemperatures = new ArrayList<>();

        // Заполнение данными за последнюю неделю октября
        octoberTemperatures.add(new DayTemperature(LocalDate.of(2023, 10, 25), 10.5));
        octoberTemperatures.add(new DayTemperature(LocalDate.of(2023, 10, 26), 12.3));
        octoberTemperatures.add(new DayTemperature(LocalDate.of(2023, 10, 27), 8.7));
        octoberTemperatures.add(new DayTemperature(LocalDate.of(2023, 10, 28), 11.0));
        octoberTemperatures.add(new DayTemperature(LocalDate.of(2023, 10, 29), 9.5));
        octoberTemperatures.add(new DayTemperature(LocalDate.of(2023, 10, 30), 7.2));
        octoberTemperatures.add(new DayTemperature(LocalDate.of(2023, 10, 31), 10.1));

        // Заполнение данными за первую неделю ноября
        novemberTemperatures.add(new DayTemperature(LocalDate.of(2023, 11, 1), 11.7));
        novemberTemperatures.add(new DayTemperature(LocalDate.of(2023, 11, 2), 12.9));
        novemberTemperatures.add(new DayTemperature(LocalDate.of(2023, 11, 3), 10.3));
        novemberTemperatures.add(new DayTemperature(LocalDate.of(2023, 11, 4), 9.1));
        novemberTemperatures.add(new DayTemperature(LocalDate.of(2023, 11, 5), 10.0));
        novemberTemperatures.add(new DayTemperature(LocalDate.of(2023, 11, 6), 8.9));
        novemberTemperatures.add(new DayTemperature(LocalDate.of(2023, 11, 7), 9.8));

        // Merging lists
        ArrayList<DayTemperature> allTemperatures = new ArrayList<>(octoberTemperatures);
        allTemperatures.addAll(novemberTemperatures);

        for (DayTemperature i : allTemperatures) {
            System.out.println(i);
        }
        System.out.println("----------------------------------");

        double sumTemp = 0;
        for (DayTemperature i : allTemperatures) {
            sumTemp += i.getTemperature();
        }
        double avgTemperature = sumTemp / allTemperatures.size();
        System.out.println("Средняя температура за две недели: " + avgTemperature);

        double maxTemperature = Double.NEGATIVE_INFINITY;
        for (DayTemperature i : allTemperatures) {
            if (i.getTemperature() > maxTemperature) {
                maxTemperature = i.getTemperature();
            }
        }
        System.out.println("Максимальная температура за две недели: " + maxTemperature);

        double minTemperature = Double.POSITIVE_INFINITY;
        for (DayTemperature i : allTemperatures) {
            if (i.getTemperature() < minTemperature) {
                minTemperature = i.getTemperature();
            }
        }
        System.out.println("Мнимальная температура за две недели: " + minTemperature);
    }
}
