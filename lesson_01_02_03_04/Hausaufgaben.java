public class Hausaufgaben {

    public static void main(String[] args) {

        double a = 500d;
        // call  method for area Square
        double area = areaOfSquare(a);
        System.out.println("Площадь квадрата со стороной " + a + " составляет " + area);

        double r = 200d;
        // call  method for area Circle
        double area2 = areaOfCircle(r);
        System.out.println("Площадь круга для R = " + r + " равна " + area2);

        double a1 = 1000d;
        double a2 = 2000d;
        // call  method for perimeter Rectange
        double perimeter = perimeterOfRectange(a1, a2);
        System.out.println("Периметр прямоугольника со сторонами " + a1 + " и " + a2 + " равен " + perimeter);

        double y1 = 80;
        double y2 = 30;
        double K = 180;
        // call  method for angle Triangle
        double angle = angleOfTriangle(y1, y2, K);
        System.out.println("Третий угол треугольника, два угла которого " +y1+ " и " +y2+ ", равен " + angle);

        double c = 60;
        double h = 80;
        // call  method for area Triangle
        double area3 = areaOfTriangle(c, h);
        System.out.println("Площадь треугольника c основанием " +c+" и высотой " +h+ " равна " + area3);

        double a3 = 70;
        double b3 = 40;
        // call  method for hipotenuse Triangle
        double hyp = hypOfTriangle(a3, b3);
        System.out.println("Гипотенуза треугольника с катетами " +a3+ " и " +b3+ " равна " + hyp);



    }//end of main

    // method for areaCircle

    public static double areaOfCircle(double r) {
        double res = Math.PI * r * r;
        return res;
    }

    // method for Square

    public static double areaOfSquare(double a) {
        double res = a * a;
        return res;

    }

    // method for Rectange

    public static double perimeterOfRectange(double a1, double a2) {
        double res = 2 * a1 + 2 * a2;
        return res;
    }

    // method for angle Triangle

    public static double angleOfTriangle(double y1, double y2, double K) {
        double res = K-y1-y2;
        return res;
    }

    // method for area Triangle

    public static double areaOfTriangle(double c, double h) {
        double res = c*h/2;
        return res;
    }

    // method for hipotenuse Triangle

    public static double hypOfTriangle(double a3, double b3) {
        double res = Math.sqrt(a3*a3+b3*b3);
        return res;
    }

}//end of class