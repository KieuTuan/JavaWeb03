package lap4b;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập h: ");
        int h = input.nextInt();
        int a = h-1;
        for (int i = 0; i < h; i++)
        {
            for (int j = 0; j < 2*h-1; j++)
                if ( j == a+i || j == a-i || i == h-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println();
        }
    }
}
