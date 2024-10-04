package Hausaufgaben_17.Cube.model;

//Задача 2. Создать класс Cube, описывающий куб cо стороной a.
// Реализовать в нем методы определения периметра p (сумма длин всех ребер), площади s (сумма площадей всех граней) и объема v.
// Создать приложение CubeAppl, в котором создать несколько экземпляров класса Cube. Для каждого экземпляра вызвать методы класса Cube и рассчитать p, s и v.

import java.util.Scanner;

public class Cube {

    private double a;

    public Cube(double a) {
        this.a = a;
    }

    // Метод для вывода информации о стороне куба
    public void display() {
        System.out.println("Сторона куба: " + a);
    }

    // Вычисляем периметр p (сумма длин всех ребер)
    public double perimeter() {
        return a * 12;
    }

    // Вычисляем площадь s (сумма площадей всех граней)
    public double area() {
        return a * a * 6;
    }

    // Вычисляем объем v
    public double volume() {
        return a * a * a;
    }

}
