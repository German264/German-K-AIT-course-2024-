package homework_38.day_temperature;

//Задача 1.
//Имеются результаты измерений температуры в городе за последнюю неделю октября и первую неделю ноября. Создайте класс DayTemperature c полями:
//LocalDate date;
//double temperature;
//Сформируйте два ArrayList и внесите в них данные измерений температуры.
//Рассчитайте среднюю температуру в городе за прошедшие две недели.
//В какой день была минимальная температура? В какой день максимальная?

import java.time.LocalDate;

public class DayTemperature {

    private LocalDate date;
    private double temperature;

    public DayTemperature(LocalDate date, double temperature) {
        this.date = date;
        this.temperature = temperature;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DayTemperature{");
        sb.append("date=").append(date);
        sb.append(", temperature=").append(temperature);
        sb.append('}');
        return sb.toString();
    }
}
