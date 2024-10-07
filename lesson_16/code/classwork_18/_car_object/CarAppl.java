package classwork_18._car_object;

import classwork_18._car_object.model.Car;

public class CarAppl {
    public static void main(String[] args) {

        Car myCar = new Car("VW", 2014, 15000, "silver", false);//create object
        System.out.println(myCar.display());

        myCar.move();
        myCar.stop();

    }
}
