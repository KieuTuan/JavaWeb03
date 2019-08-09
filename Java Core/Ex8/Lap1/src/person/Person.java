package person;

import java.util.Scanner;

public class Person {
    private String id;
    private String name;

    public Person() {
    }

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void input(Scanner input) {
        System.out.print("ID: ");
        id = input. nextLine();
        System.out.print("Name: ");
        name = input. nextLine();
    }

    @Override
    public String toString() {
        return "id = " + id + ", name = " + name;
    }
}
