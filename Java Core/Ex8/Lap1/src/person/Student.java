package person;

import java.util.Scanner;

public class Student extends Person{
    private String email;

    public Student() {
    }

    public Student(String email) {
        this.email = email;
    }

    public Student(String email, String id, String name) {
        super(id, name);
        this.email = email;
    }
    
    @Override
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
