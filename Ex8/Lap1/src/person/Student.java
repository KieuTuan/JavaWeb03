package person;

import java.util.Scanner;

public class Student extends Person{
    private String email;
    
    public void input(Scanner input) {
        super.input(input);
        System.out.print("Email: ");
        email = input. nextLine();
    }

    @Override
    public String toString() {
        return "Student: " +super.toString()+ ", email = " + email;
    }
}
