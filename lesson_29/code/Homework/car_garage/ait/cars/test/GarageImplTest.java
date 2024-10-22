package Homework.car_garage.ait.cars.test;

import Homework.car_garage.ait.cars.dao.Garage;
import Homework.car_garage.ait.cars.dao.GarageImpl;
import Homework.car_garage.ait.cars.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

class GarageImplTest {

    private Garage garage;
    private Car[] cars;


    @BeforeEach
    void setUp() {
        garage = new GarageImpl(5);
        cars = new Car[4];
        cars[0] = new Car("Number1", "Model1", "Company1", 1.5, "Red");
        cars[1] = new Car("Number2", "Model2", "Company1", 2.5, "Green");
        cars[2] = new Car("Number3", "Model1", "Company2", 1.5, "Red");
        cars[3] = new Car("Number4", "Model4", "Company2", 2.0, "Green");

        // TODO add cars to garage
        for (int i = 0; i < 4; i++) {
            garage.addCar(cars[i]);
        }
    }

    @Test
    void testAddCarTest() {
        assertFalse(garage.addCar(null)); // Не добавлять null
        assertFalse(garage.addCar(cars[2])); // Не добавлять дубликат
        Car newCar = new Car("Number5", "Model5", "Company3", 1.8, "Blue");
        assertTrue(garage.addCar(newCar));
        assertEquals(5, garage.size());
        // Не добавлять сверх capacity
        Car oneMoreCar = new Car("Number6", "Model6", "Company4", 3.0, "Black");
        assertFalse(garage.addCar(oneMoreCar));

    }

    @Test
    void testRemoveCarTest() {
        // remove existed car
        assertEquals(cars[0], garage.removeCar("Number1"));
        assertEquals( 3, garage.size());
        // remove absent car
        assertNull(garage.removeCar("Number6"));
    }

    @Test
    void testFindCarByRegNumberTest() {
        // find existed
        assertEquals( cars[2], garage.findCarByRegNumber("Number3"));
        // find absent
        assertNull(garage.findCarByRegNumber("Number8"));
    }

    @Test
    void testFindCarsByModelTest() {
        // find existed
        Car[] expected = {cars[0], cars[2]}; // Ожидаем массив машин с моделью "Model1"
        assertArrayEquals(expected, garage.findCarsByModel("Model1"));
        // find absent
        assertArrayEquals(new Car[0], garage.findCarsByModel("Model6"));
    }

    @Test
    void testFindCarsByCompanyTest() {
        // find existed
        Car[] expected = {cars[2], cars[3]}; // Ожидаем массив машин от "Company2"
        assertArrayEquals(expected, garage.findCarsByCompany("Company2"));
        // find absent
        assertArrayEquals(new Car[0], garage.findCarsByCompany("Company5"));
    }

    @Test
    void testFindCarsByEngineTest() {
        Car[] expected = {cars[0], cars[2], cars[3]}; // Автомобили с объемом двигателя 1.5 - 2.0
        assertArrayEquals(expected, garage.findCarsByEngine(1.5, 2.0));
        assertArrayEquals(new Car[0], garage.findCarsByEngine(3, 4)); // Диапазон двигателя не найден
    }

    @Test
    void testFindCarsByColorTest() {
        Car[] expected = {cars[0], cars[2]}; // Автомобили красного цвета
        assertArrayEquals(expected, garage.findCarsByColor("Red"));
        assertArrayEquals(new Car[0], garage.findCarsByColor("White")); // Цвет не найден
    }

    @Test
    void testSizeTest() {
        assertEquals(4, garage.size());
    }

    @Test
    void testPrintCarsTest() {
        garage.printCars();
    }
}