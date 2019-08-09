/*
 * S(x, n) = x^2 + x^4 + x^6 +…+ x^2n
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
        for(int i = 2; i <= 2*n; i+=2)
            s += Math.pow(x, i);
        System.out.println("S = "+s);
    }
}
