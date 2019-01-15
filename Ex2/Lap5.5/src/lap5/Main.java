/*
 * S(n) = 1 + 1/3 + 1/5 + ... + 1/(2n+1)
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
        float s = 0;
        for(int i = 1; i <= 2*n+1; i+=2)
            s += 1.0/i;
        System.out.println("S = "+s);
    }
}
