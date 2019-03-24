package main;

import java.util.Scanner;

public class Menu{
    private Scanner input = new Scanner(System.in);
    
    public int display() {
        System.out.println("---Menu_Lv2--");
        System.out.println("1. Add.");
        System.out.println("2. Show.");
        System.out.println("3. Search.");
        System.out.println("Other...Exit.");
        System.out.print("Lựa chọn của bạn: ");
        int c = Integer.parseInt(input.nextLine());
        return c;
    }
    
    public int printMenu() {
        System.out.println("---Menu------");
        System.out.println("1. Student.");
        System.out.println("2. Employee.");
        System.out.println("Other...Exit.");
        System.out.print("Lựa chọn của bạn: ");
        int c = Integer.parseInt(input.nextLine());
        return c;
    }
}
