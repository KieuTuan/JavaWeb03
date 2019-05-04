package com.java.lap1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    static Scanner input = new Scanner(System.in);
    static String path = "E:\\JavaWeb03\\Ex11\\cust.dat";
    static File file = new File(path);
    static CustomerManager cm = new CustomerManager();
    
    public static void main(String[] args) {
        while (true) {            
            int choice = menu(input);
            if(choice < 1 || choice > 4)
                return;
            if(choice == 1) {
                try {
                    cm.load(file);
                    System.out.println("File load successful");
                } catch (IOException | ClassNotFoundException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(choice == 2)
                cm.add(input);
            else if(choice == 3) {
                System.out.print("Id search: ");
                System.out.println(cm.search(Integer.parseInt(input.nextLine())));
            }
            else {
                try {
                    cm.save(file);
                    System.out.println("File save successful");
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    private static int menu(Scanner input) {
        System.out.println("---Menu------");
        System.out.println("1. Load data.");
        System.out.println("2. Add new.");
        System.out.println("3. Search.");
        System.out.println("4. Save.");
        System.out.println("Other...Exit.");
        System.out.print("You choice: ");
        return Integer.parseInt(input.nextLine());
    }
}
