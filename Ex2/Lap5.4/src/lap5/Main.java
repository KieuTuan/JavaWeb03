/*
 * S(n) = 1/2 + 1/4 + 1/6 + 1/8 + ... + 1/2n
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
        for(int i = 2; i <= 2*n; i+=2)
            s += 1.0/i;
        System.out.println("S = "+s);
    }   
}
