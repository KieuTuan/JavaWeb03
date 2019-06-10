package com.java.quiz;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            Connect conn = new Connect();
            LogIn log = new LogIn();
            Question ques = new Question();
            int stId = 0;
            if(conn.getConnect() != null) {
                stId = log.LogInDB(input, conn.getConnect());
                System.out.println("Login successfull!!!");
                System.out.println("======================================");
            }
            int a = ques.getQuestion(conn.getConnect(), input, stId);
            System.out.println("Congratulation!");
            System.out.printf("Your result: %d/10", a);
            System.out.println();
            System.out.print("See Details (Y/N): ");
            String st = input.nextLine();
            if(st.equalsIgnoreCase("Y"))
                
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}