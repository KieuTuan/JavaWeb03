package com.java.lap1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Language(EN/VI): ");
        Menu menu = new Menu(input.nextLine());
        menu.printMenu();
    }
}
