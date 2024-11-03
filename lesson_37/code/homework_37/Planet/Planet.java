package homework_37.Planet;

import java.util.Objects;

public class Planet implements Comparable<Planet>{

    private String name;
    private int orderFromSun;       // Порядковый номер планеты от Солнца
    private double distanceFromSun; // расстояние до Солнца в миллионах км
    private double mass;            // масса в единицах 10^24 кг
    private int numberOfMoons;      // количество спутников

    public Planet(String name, int orderFromSun, double distanceFromSun, double mass, int numberOfMoons) {
        this.name = name;
        this.orderFromSun = orderFromSun;
        this.distanceFromSun = distanceFromSun;
        this.mass = mass;
        this.numberOfMoons = numberOfMoons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrderFromSun() {
        return orderFromSun;
    }

    public void setOrderFromSun(int orderFromSun) {
        this.orderFromSun = orderFromSun;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public void setDistanceFromSun(double distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public int getNumberOfMoons() {
        return numberOfMoons;
    }

    public void setNumberOfMoons(int numberOfMoons) {
        this.numberOfMoons = numberOfMoons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Planet planet)) return false;
        return orderFromSun == planet.orderFromSun && Double.compare(distanceFromSun, planet.distanceFromSun) == 0 && Double.compare(mass, planet.mass) == 0 && numberOfMoons == planet.numberOfMoons && Objects.equals(name, planet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, orderFromSun, distanceFromSun, mass, numberOfMoons);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Planet{");
        sb.append("name='").append(name).append('\'');
        sb.append(", orderFromSun=").append(orderFromSun);
        sb.append(", distanceFromSun=").append(distanceFromSun);
        sb.append(", mass=").append(mass);
        sb.append(", numberOfMoons=").append(numberOfMoons);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Planet o) {
        return Integer.compare(this.getOrderFromSun(), o.getOrderFromSun());
    }
}
