package person;

import java.util.Scanner;

public class Employee extends Person{
    private double salary;

    public Employee() {
    }

    public Employee(double salary) {
        this.salary = salary;
    }

    public Employee(double salary, String id, String name) {
        super(id, name);
        this.salary = salary;
    }
    
    @Override
    public void input(Scanner input) {
        super.input(input);
        System.out.print("Salary: ");
        salary = Double.parseDouble(input.nextLine());
    }
    
    @Override
    public String toString() {
        return "Employee: " +super.toString()+ ", salary = " + salary;
    }
}
