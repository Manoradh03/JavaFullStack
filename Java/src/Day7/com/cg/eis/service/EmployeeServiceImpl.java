package Day7.com.cg.eis.service;

import Day7.com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {

    public void findInsuranceScheme(Employee e) {

        if (e.salary > 50000 && e.designation.equalsIgnoreCase("Manager")) {
            e.insuranceScheme = "Scheme A";
        } 
        else if (e.salary > 20000 && e.salary <= 50000 && e.designation.equalsIgnoreCase("Programmer")) {
            e.insuranceScheme = "Scheme B";
        } 
        else if (e.salary <= 20000 && e.designation.equalsIgnoreCase("Clerk")) {
            e.insuranceScheme = "Scheme C";
        } 
        else {
            e.insuranceScheme = "No Scheme";
        }
    }

    public void displayEmployeeDetails(Employee e) {
        System.out.println("ID: " + e.id);
        System.out.println("Name: " + e.name);
        System.out.println("Salary: " + e.salary);
        System.out.println("Designation: " + e.designation);
        System.out.println("Insurance Scheme: " + e.insuranceScheme);
    }
}