package com.java.lap2;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        File file = new File("cust.dat");
        StudentManager stm = new StudentManager();
        Menu menu;
        while (true) {            
            menu = new Menu();
            System.out.print("You choice: ");
            int c = Integer.parseInt(input.nextLine());
            for (int i = 0; i < 50; i++)
                System.out.println();
            switch(c) {
                case 1: stm.add();
                        break;
                case 2: System.out.print("Search name: ");
                        Student st = stm.searchName(input.nextLine());
                        if(st != null)
                            System.out.println(st.toString());
                        break;
                case 3: System.out.print("Id update: ");
                        stm.update(input.nextLine());
                        break;
                case 4: System.out.print("Id delete: ");
                        stm.delete(input.nextLine());
                        break;
                case 5: stm.save(file);
                        break;
                case 6: stm.read(file);
                        break;
                default: return;
            }
        }
    }
}
