package classwork_28.car_garage.ait.cars.test;

import classwork_28.car_garage.ait.cars.dao.Garage;
import classwork_28.car_garage.ait.cars.dao.GarageImpl;
import classwork_28.car_garage.ait.cars.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
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
    }

    @Test
    void testRemoveCarTest() {
    }

    @Test
    void testFindCarByRegNumberTest() {
    }

    @Test
    void testFindCarsByModelTest() {
        Car[] expected = {cars[0], cars[2]};
        Car[] actual = garage.findCarsByModel("Model1");
        assertArrayEquals(expected, actual);
    }

    @Test
    void testFindCarsByCompanyTest() {
    }

    @Test
    void testFindCarsByEngineTest() {
    }

    @Test
    void testFindCarsByColorTest() {
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