package person;

import java.util.Scanner;

public class Employee extends Person{
    private double salary;
    
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
