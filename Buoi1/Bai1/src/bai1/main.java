package bai1;

import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap So > ");
        float a = input.nextFloat();
        System.out.println("Ket qua");
        System.out.println(Math.pow(a, 2));
    }    
}
