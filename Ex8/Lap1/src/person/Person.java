package person;

import java.util.Scanner;

public class Person {
    private String id;
    private String name;
    
    public void input(Scanner input) {
        System.out.print("ID: ");
        id = input. nextLine();
        System.out.print("Name: ");
        name = input. nextLine();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "id = " + id + ", name = " + name;
    }
}
