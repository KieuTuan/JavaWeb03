package lap4a;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập h: ");
        int h = input.nextInt();
        for (int i = 0; i < h; i++)
        {
            for (int j = 0; j < h-i; j++)
                System.out.print(" ");
            for (int j = 0; j < 2*i+1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
