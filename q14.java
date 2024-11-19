import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    double basicSalary, grossSalary;

    void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        empId = scanner.nextInt();
        System.out.print("Enter Employee Name: ");
        empName = scanner.next();
        System.out.print("Enter Basic Salary: ");
        basicSalary = scanner.nextDouble();
        scanner.close();
    }

    void calculateGrossSalary() {
        double hra = 0.2 * basicSalary; 
        double da = 0.8 * basicSalary; 
        grossSalary = basicSalary + hra + da;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Gross Salary: " + grossSalary);
    }
}

public class q14 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.inputDetails();
        emp.calculateGrossSalary();
        emp.displayDetails();
    }
}

