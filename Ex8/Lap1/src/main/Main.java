package main;

import java.util.Scanner;
import manager.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();
        StudentManager stm = new StudentManager();
        EmployeeManager epm = new EmployeeManager();
        int c1, c2;
        while(true) {
            c1 = menu.printMenu();
            if(c1 < 1 || c1 > 2)
                return;
            c2 = menu.display();
            if(c2 < 1 || c2 > 3)
                return;
            if(c1 == 1) {
                if(c2 == 1)
                    stm.add();
                else if(c2 == 2)
                    stm.show();
                else {
                    System.out.print("Search Name: ");
                    stm.search(input.nextLine());
                }
            }
            else {
                if(c2 == 1)
                    epm.add();
                else if(c2 == 2)
                    epm.show();
                else {
                    System.out.print("Search Name: ");
                    epm.search(input.nextLine());
                }
            }
        }
    }
}
