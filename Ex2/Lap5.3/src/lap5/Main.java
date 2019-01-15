/*
 * S(n) = 1^2 + 2^2 + … + n^2
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
        for(int i = 1; i <= n; i++)
            s += Math.pow(i, 2);
        System.out.println("S = "+s);
    }   
}
