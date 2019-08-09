/*
 * S(n) = 1/2 + 3/4 + 5/6 +…+ (2n+1)/(2n+2)
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
            s += i/(i+1.0);
        System.out.println("S = "+s);
    }
}
