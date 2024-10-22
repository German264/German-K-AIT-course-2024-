package Homework.car_garage.ait.cars.Car_sorting;

import java.util.Objects;

public class CarSorting implements Comparable<CarSorting> {

    private String model;
    private String color;
    private double price;
    private int yearOfProduction;

    public CarSorting(String model, String color, double price, int yearOfProduction) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.yearOfProduction = yearOfProduction;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CarSorting that)) return false;
        return Double.compare(price, that.price) == 0 && yearOfProduction == that.yearOfProduction && Objects.equals(model, that.model) && Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, price, yearOfProduction);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CarSorting{");
        sb.append("model='").append(model).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", price=").append(price);
        sb.append(", yearOfProduction=").append(yearOfProduction);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(CarSorting carSorting) {
        return this.getYearOfProduction() - carSorting.getYearOfProduction();
    }
}
