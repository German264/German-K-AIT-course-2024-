package classwork.employee.model;

//- создадим класс Employee (работник):
//  - поля
//  - конструктор
//  - геттеры и сеттеры
//  - метод display
//- создадим класс FirmaAppl, в котором:
//  - создаем объекты типа Employee
//  - определим зарплату и вычислим ее общую сумму.

import javax.xml.namespace.QName;

public class Employee {

    //field
    private int id;
    private String name;
    private String lastName;
    private double salary;
    private boolean gender;

    //constructor
    public Employee(int id, String name, String lastName, double salary, boolean gender) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
        this.gender = gender;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public String displayEmployee() {
        return String.format("ID: %d, name: %s, lastname: %s, salary: %.2f, gender: %s", id, name, lastName, salary, gender);

    }

}
