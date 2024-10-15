
public class Circle {
    //    3. Вычислить длину окружности по ее радиусу.
//    Задайте радиус окружности как переменную типа double.
//    Реализуйте метод, который вернет тип double и вычислит длину окружности по ее радиусу.
//
    public static void main(String[] args) {

    double PI = 3.14159;
    double r = 100;

    double lenghtOfCircle = 2 * PI * r;
        System.out.println(lenghtOfCircle);


        // solution with method

    double l = lenghtOfCircleMethod(r);
        System.out.println("Leght of circle with radius "+ r + " = " + l);

    }//end of main

    private static double lenghtOfCircleMethod(double r) {
        return 2 * Math.PI * r;
    }

}//end of class
