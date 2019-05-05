package com.java.lap2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentManager {
    private Scanner input = new Scanner(System.in);
    private Student st;
    private List<Student> list;
    
    public StudentManager() {
        this.list = new ArrayList<>();
    }
    
    private Date birthday() {
        int d, m, y;
        System.out.print("Date of birth: ");
        d = Integer.parseInt(input.nextLine());
        System.out.print("Month of birth: ");
        m = Integer.parseInt(input.nextLine());
        System.out.print("Year of birth: ");
        y = Integer.parseInt(input.nextLine());
        Date date = new Date(y, m, d);
        return date;
    }
    
    public void add() {
        st = new Student();
        System.out.print("Id: ");
        st.setId(input.nextLine());
        System.out.print("Name: ");
        st.setName(input.nextLine());
        st.setDob(birthday());
        System.out.print("Email: ");
        st.setEmail(input.nextLine());
        list.add(st);
    }
    
    public Student searchName(String name) {
        for (Student st : list)
            if(st.getName().equals(name))
                return st;
        System.out.println("Name not found.");
        return null;
    }
    
    private int searchId(String id) {
        for (int i = 0; i < list.size(); i++)
            if(list.get(i).getId().equals(id))
                return i;
        return -1;
    }
    
    public void update(String id) {
        int i = searchId(id);
        if(i == -1)
            System.out.println("Id not found.");
        else {
            st = list.get(i);
            System.out.print("New Name: ");
            st.setName(input.nextLine());
            st.setDob(birthday());
            System.out.print("New Email: ");
            st.setEmail(input.nextLine());
            list.set(i, st);
        }
            
    }
    
    public void delete(String id) {
        int i = searchId(id);
        if(i > -1) {
            list.remove(i);
            System.out.println("Delete successfull.");
        }
        else
            System.out.println("Id not found.");
    }
    
    public void save(File file) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(list);
            System.out.println("File save successfull.");
            oos.flush();
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void read(File file) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            this.list = (ArrayList<Student>) ois.readObject();
            System.out.println("File load successfull.");
            ois.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
