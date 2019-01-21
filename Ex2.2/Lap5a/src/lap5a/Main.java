package lap5a;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập m, n: ");
        int m = input.nextInt();
        int n = input.nextInt();
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
                System.out.print("*");
            System.out.println();
        }

    }
}
