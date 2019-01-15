/*
 * 1 + 1.2 + 1.2.3 + … + 1.2…n
 */
package lap5;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = input.nextInt();
        int s = 0;
        int temp = 1;
        for(int i = 1; i <= n; i++)
        {
            temp *= i;
            s += temp;
        }
        System.out.println("S = "+s);
    }
}
