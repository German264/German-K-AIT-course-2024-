package Hausaufgaben_17.Cube;

import Hausaufgaben_17.Cube.model.Cube;

import java.util.Scanner;

public class CubeAppl {
    public static void main(String[] args) {

        Cube cube1 = new Cube(3); // Сторона 3
        Cube cube2 = new Cube(5); // Сторона 5
        Cube cube3 = new Cube(7); // Сторона 7

        // Выводим информацию о каждом кубе
        cube1.display();
        System.out.println("Периметр: " + cube1.perimeter());
        System.out.println("Площадь: " + cube1.area());
        System.out.println("Объем: " + cube1.volume());
        System.out.println();

        cube2.display();
        System.out.println("Периметр: " + cube2.perimeter());
        System.out.println("Площадь: " + cube2.area());
        System.out.println("Объем: " + cube2.volume());
        System.out.println();

        cube3.display();
        System.out.println("Периметр: " + cube3.perimeter());
        System.out.println("Площадь: " + cube3.area());
        System.out.println("Объем: " + cube3.volume());
    }
}
