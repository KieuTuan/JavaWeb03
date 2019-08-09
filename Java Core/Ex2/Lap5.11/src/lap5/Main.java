/*
 * S(x, n) = x + x^3 + x^5 +…+ x^(2n+1)
 */
package lap5;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap x: ");
        int x = input.nextInt();
        System.out.print("Nhap n: ");
        int n = input.nextInt();
        int s = 0;
        for(int i = 1; i <= 2*n+1; i+=2)
            s += Math.pow(x, i);
        System.out.println("S = "+s);
    }
}
