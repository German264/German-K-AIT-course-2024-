package classwork_29.employee.dao;


import classwork_29.employee.model.Employee;
import classwork_29.employee.model.SalesManager;

import static classwork_27.ait.employee.model.Employee.normHours;

public class CompanyImpl implements Company {

    private Employee[] employees;
    private int size;

    // capacity - возможное кол-во сотрудников
    public CompanyImpl(int capacity) {
        this.employees = new Employee[capacity];
        this.size = size;
    }


    @Override
    public boolean addEmployee(Employee employee) {
        // bad cases
        if(employee == null){
            return false;
        }
        if(size == employees.length){
            return false;
        }
        if(findEmployee(employee.getId()) != null) {
            return false;
        }
        // good case
        employees[size] = employee; // put in array
        size++;
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if(employees[i].getId() == id){
                Employee victim = employees[i];
                employees[i] = employees[size - 1]; // на место жертвы ставим (копируем) последний элемент массива
                employees[size - 1] = null; // последний элемент затрем с помощью null
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if(employees[i].getId() == id){
                return employees[i];
            }
        }
        return null;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public void printEmployee() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    @Override
    public double totalSalary() {
        double totalSalary = 0;
        for (int i = 0; i < size; i++) {
            totalSalary += employees[i].calcSalary();
        }
        return totalSalary;
    }

    @Override
    public double totalSales() {
        double totalSales = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i] instanceof SalesManager) { //проверка перед кастингом
               SalesManager sm = (SalesManager) employees[i];
               totalSales += sm.getSalesValue();
            }
        }
        return totalSales;
    }

    @Override
    public double averageSalary() {
        return totalSalary()/size;
    }

    @Override
    public Employee[] findEmployeeHoursGreaterThan(int hours) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(employees[i].getHours() > hours){ // criteria
                count++;
            }
        }
        Employee[] res = new Employee[count]; // new array for results
        // читаем массив и перекладываем рез-ты в новый
        for (int i = 0, j = 0 ; j < res.length; i++) {
            if(employees[i].getHours() > hours){ // criteria
                res[j++] = employees[i];
            }
        }
        return res;
    }

    @Override
    public Employee[] findEmployeeSalaryRange(double minSalare, double maxSalare) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(employees[i].calcSalary() > minSalare && employees[i].calcSalary() < maxSalare ){ // criteria
                count++;
            }
        }
        Employee[] res = new Employee[count];
        // читаем массив и перекладываем рез-ты в новый
        for (int i = 0, j = 0 ; j < res.length; i++) {
            if(employees[i].calcSalary() > minSalare && employees[i].calcSalary() < maxSalare){ // criteria
                res[j++] = employees[i];
            }
        }
        return res;
    }
}
