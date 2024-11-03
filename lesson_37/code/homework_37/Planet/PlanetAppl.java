package homework_37.Planet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PlanetAppl {
    public static void main(String[] args) {

        List<Planet> planets = new ArrayList<>();

        planets.add(new Planet("Уран", 7, 2871, 86.8, 27));
        planets.add(new Planet("Венера", 2, 108.2, 4.87, 0));
        planets.add(new Planet("Марс", 4, 227.9, 0.642, 2));
        planets.add(new Planet("Меркурий", 1, 57.9, 0.330, 0));
        planets.add(new Planet("Юпитер", 5, 778.3, 1898, 79));
        planets.add(new Planet("Нептун", 8, 4497.1, 102, 14));
        planets.add(new Planet("Сатурн", 6, 1427, 568, 83));
        planets.add(new Planet("Земля", 3, 149.6, 5.97, 1));

        System.out.println("--------------- Print as is ---------------");
        for (Planet planet : planets) {
            System.out.println(planet);
        }

        System.out.println("--------- Print after order from Sun -------");
        planets.sort(Planet::compareTo);
        for (Planet planet : planets){
            System.out.println(planet);
        }

        Comparator<Planet> comparatorByName = new Comparator<Planet>() {
            @Override
            public int compare(Planet o1, Planet o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        planets.sort(comparatorByName);
        System.out.println("-----------Print after sorting by name-------");
        for (Planet planet : planets) {
            System.out.println(planet);
        }

        Comparator<Planet> comparatorByMass = new Comparator<Planet>() {
            @Override
            public int compare(Planet o1, Planet o2) {
                return Double.compare(o1.getMass(), o2.getMass());
            }
        };

        planets.sort(comparatorByMass);
        System.out.println("-----------Print after sorting by mass-------");
        for (Planet planet : planets) {
            System.out.println(planet);
        }

        Comparator<Planet> comparatorBynumberOfMoons = new Comparator<Planet>() {
            @Override
            public int compare(Planet o1, Planet o2) {
                return Integer.compare(o1.getNumberOfMoons(), o2.getNumberOfMoons());
            }
        };

        planets.sort(comparatorBynumberOfMoons);
        System.out.println("-----------Print after sorting by number of moons-------");
        for (Planet planet : planets) {
            System.out.println(planet);
        }
    }
}
