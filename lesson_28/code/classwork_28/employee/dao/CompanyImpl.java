package classwork_28.employee.dao;


import classwork_28.employee.model.Employee;
import classwork_28.employee.model.SalesManager;

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
        if (employees == null) {
            return 0;
        }
        double Salary = totalSalary();//???
            return totalSalary() / size;
    }

    @Override
    public Employee[] findEmployeeHoursGreaterThan(int hours) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getHours() > normHours) { ///????
                count++;
            }
        }
        Employee[] result = new Employee[count];     ///????
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getHours() > normHours) {
                result[index++] = employees[i];
            }
        }
        return result;
    }

    @Override
    public Employee[] findEmployeeSalaryRange(double minSalare, double maxSalare) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            double salary = employees[i].calcSalary();
            if (salary >= minSalare && salary <= maxSalare) {
                count++;
            }
        }
        Employee[] result = new Employee[count];
        int index = 0;
        for (int i = 0; i < size; i++) {
            double salary = employees[i].calcSalary();
            if (salary >= minSalare && salary <= maxSalare) {   ///????
                result[index++] = employees[i];
            }
        }
        return result;
    }
}
