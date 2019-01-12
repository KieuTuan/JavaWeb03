package bai5;

import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap a > ");
        float a = input.nextFloat();
        System.out.print("Nhap b > ");
        float b = input.nextFloat();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Ket qua:");
        System.out.printf("a = %.1f, b = %.1f\n", a, b);
    }   
}
