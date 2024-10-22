package Homework.car_garage.ait.cars.Car_sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CarSortingTest {

    CarSorting[] carSortings;

    @BeforeEach
    void setUp() {

        carSortings = new CarSorting[5];
        carSortings[0] = new CarSorting("Mod3", "white", 12000, 2020);
        carSortings[1] = new CarSorting("Mod5", "yellow", 4000, 2015);
        carSortings[2] = new CarSorting("Mod1", "black", 14000, 2022);
        carSortings[3] = new CarSorting("Mod4", "green", 7000, 2018);
        carSortings[4] = new CarSorting("Mod2", "blue", 13000, 2021);
    }
    @Test
    void sortCarByModelTest(){
        Comparator<CarSorting> comparatorByModel = new Comparator<CarSorting>() {
            @Override
            public int compare(CarSorting c1, CarSorting c2) {
                return c1.getModel().compareTo(c2.getModel());
            }
        };

        System.out.println("---------- List cars as is --------------");
        printCarSortings();

        Arrays.sort(carSortings,comparatorByModel);

        System.out.println("---------- List cars sorted by Model --------------");
        printCarSortings();
        System.out.println("---------------------------------------------------");
    }

    @Test
    void sortCarByColorlTest(){
        Comparator<CarSorting> comparatorByColor = new Comparator<CarSorting>() {
            @Override
            public int compare(CarSorting c1, CarSorting c2) {
                return c1.getColor().compareTo(c2.getColor());
            }
        };

        System.out.println("---------- List cars as is --------------");
        printCarSortings();

        Arrays.sort(carSortings,comparatorByColor);

        System.out.println("---------- List cars sorted by Color --------------");
        printCarSortings();
    }

    @Test
    void sortCarByPriceTest(){
        Comparator<CarSorting> comparatorByPrice = new Comparator<CarSorting>() {
            @Override
            public int compare(CarSorting c1, CarSorting c2) {
               return Double.compare(c1.getPrice(), c2.getPrice());
            }
        };

        System.out.println("---------- List cars as is --------------");
        printCarSortings();

        Arrays.sort(carSortings,comparatorByPrice);

        System.out.println("---------- List cars sorted by Price --------------");
        printCarSortings();
    }

    @Test
    void sortCarByYearOfProductionTest() {
        System.out.println("---------- List cars as is --------------");
        printCarSortings();

        // Сортируем по году выпуска с использованием метода compareTo()
        Arrays.sort(carSortings);

        System.out.println("---------- List cars sorted by Year of Production --------------");
        printCarSortings();
    }

    @Test
    void printCarSortings(){
        for (int i = 0; i < carSortings.length; i++) {
            System.out.println(carSortings[i]);
        }
    }
}