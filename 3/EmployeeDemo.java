import java.util.Scanner;

// Abstract Base Class
abstract class Employee {
    String name;
    double sal;
    double grossSal;

    public Employee(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + sal);
        System.out.println("Gross Salary: " + grossSal);
    }

    // Abstract methods to be implemented by subclasses
    public abstract void calculate_gross_salary();
    public abstract void annual_increment();
}

// Concrete Subclass 1
class Manager extends Employee {
    double Hra;

    public Manager(String name, double sal, double Hra) {
        super(name, sal);
        this.Hra = Hra;
    }

    @Override
    public void calculate_gross_salary() {
        this.grossSal = this.sal + this.Hra;
    }

    @Override
    public void annual_increment() {
        // Example increment logic: 10% of basic salary
        this.sal += this.sal * 0.10;
        System.out.println("Salary incremented for Manager.");
    }
}

// Concrete Subclass 2
class SalesManager extends Manager {
    double commission;

    public SalesManager(String name, double sal, double Hra, double commission) {
        super(name, sal, Hra);
        this.commission = commission;
    }

    // Overriding the method from Manager
    @Override
    public void calculate_gross_salary() {
        this.grossSal = this.sal + this.Hra + this.commission;
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        // Creating a Manager object
        Manager mgr = new Manager("Anil Kumar", 80000, 15000);
        mgr.calculate_gross_salary();
        System.out.println("--- Manager Details ---");
        mgr.printDetails();

        System.out.println("\n--------------------------\n");

        // Creating a SalesManager object
        SalesManager smgr = new SalesManager("Sunita Sharma", 70000, 12000, 5000);
        smgr.calculate_gross_salary();
        System.out.println("--- Sales Manager Details ---");
        smgr.printDetails();
    }
}