/*
 * S = 1 + 1/2 + 1/3 + 1/4 +… 1/n
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
        for(int i = 1; i <= n; i++)
            s += 1.0/i;
        System.out.println("S = "+s);
    }    
}
