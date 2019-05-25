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
            if(conn.getConnect() != null) {
                log.LogInDB(input, conn.getConnect());
                System.out.println("Login successfull!!!");
                System.out.println("======================================");
            }
            int a = ques.getQuestion(conn.getConnect(), input);
            System.out.println("Congratulation!");
            System.out.printf("Your result: %d/10", a);
            System.out.println();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}