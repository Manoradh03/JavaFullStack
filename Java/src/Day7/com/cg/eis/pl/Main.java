package Day7.com.cg.eis.pl;

import java.util.Scanner;
import Day7.com.cg.eis.bean.Employee;
import Day7.com.cg.eis.service.EmployeeServiceImpl;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();

        System.out.println("Enter ID:");
        e.id = sc.nextInt();

        System.out.println("Enter Name:");
        e.name = sc.next();

        System.out.println("Enter Salary:");
        e.salary = sc.nextDouble();

        System.out.println("Enter Designation:");
        e.designation = sc.next();

        EmployeeServiceImpl service = new EmployeeServiceImpl();

        service.findInsuranceScheme(e);
        service.displayEmployeeDetails(e);
    }
}