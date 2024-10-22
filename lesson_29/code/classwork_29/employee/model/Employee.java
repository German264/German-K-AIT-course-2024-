package classwork_29.employee.model;

import java.util.Objects;

public abstract class Employee {

    public static int normHours = 160;
    protected static double minSalare = 3500;
    protected static double maxSalare = 10000;
    protected static double minWage = 12.48;
    protected final int id;
    protected String name;
    protected String secondName;
    protected double hours;

    public static int getNormHours() {
        return normHours;
    }
    public static double getMinSalare() {
        return minSalare;
    }
    public static double getMaxSalare() {
        return maxSalare;
    }
    public static double getMinWage() {
        return minWage;
    }

    public static void setMinWage(double minWage) {
        if (minWage > Employee.minWage) {
            Employee.minWage = minWage;
        }
    }

    public Employee(int id, String name, String secondName, double hours) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
        this.hours = hours;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", secondName='").append(secondName).append('\'');
        sb.append(", hours=").append(hours);
        sb.append(", salary=").append(calcSalary()); // добавил зарплату в распечатку
        sb.append('}');
        return sb.toString();
    }

    // methods for salary
    public abstract double calcSalary();

    protected double ensureSalary(double salary){
        if(salary < hours * minWage){
            System.out.println("Set min salary");
            salary = hours * minWage;
        }
        return salary;
    }
}




