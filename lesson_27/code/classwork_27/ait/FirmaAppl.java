package classwork_27.ait;

import classwork_27.ait.employee.dao.Company;
import classwork_27.ait.employee.dao.CompanyImpl;
import classwork_27.ait.employee.model.Employee;
import classwork_27.ait.employee.model.Manager;
import classwork_27.ait.employee.model.SalesManager;
import classwork_27.ait.employee.model.Worker;

public class FirmaAppl {
    public static void main(String[] args) {

        Company company = new CompanyImpl(6);
        Employee[] emp;
        emp = new Employee[4];

        emp[0] = new Manager(1, "N1", "L1", 170, 5000, 25);
        emp[1] = new SalesManager(2, "N2", "L2", 160, 50000, 0.1);
        emp[2] = new SalesManager(3, "N3", "L3", 180, 80000, 0.15);
        emp[3] = new Worker(4, "N4", "L4", 160, 20);



    }
}
