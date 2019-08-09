package com.java.lap1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerManager{
    private Customer customer;
    private ArrayList<Customer> list;

    public CustomerManager() {
        this.list = new ArrayList<>();
    }
    
    public void load(File file) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        ArrayList data = (ArrayList) ois.readObject();
        this.list = data;
        ois.close();
    }
    
    public void add(Scanner input) {
        Customer c = new Customer();
        System.out.print("Id: ");
        c.setId(Integer.parseInt(input.nextLine()));
        System.out.print("Name: ");
        c.setName(input.nextLine());
        System.out.print("Address: ");
        c.setAddress(input.nextLine());
        System.out.print("Age: ");
        c.setAge(Integer.parseInt(input.nextLine()));
        list.add(c);
    }
    
    public String search(int id) {
        for (Customer customer : list) {
            if(customer.getId() == id)
                return customer.toString();
        }
        return "Id not found!";
    }
    
    public boolean save(File file) throws FileNotFoundException, IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(list);
        oos.flush();
        oos.close();
        return true;
    }
}
