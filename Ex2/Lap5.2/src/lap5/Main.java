/*
 * S(n) = 1+2+3+4+ … +n
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
        for(int i = 0; i <= n; i++)
            s += i;
        System.out.println("S = "+s);
    }    
}
