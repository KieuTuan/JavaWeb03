/*
 * nhập vào số nguyên n
 * kiểm tra số đó có phải là số đối xứng hay không.
 */
package lap10;

import java.util.Scanner;

public class Main
{
    public static boolean isPalindrome(int i, int n)
    {
        int a, b;
        for(int j = 1; j <= i/2; j+=2)
        {
            a = (int) (n/Math.pow(10, i-j));
            b = (int) (n%10);
            if(a != b)
                return false;
            n -= a*Math.pow(10, i-j);
            n /= 10;
        }
        return true;
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = input.nextInt();
        int temp = n;
        int i = 0;
        while(temp!=0)
        {
            temp /= 10;
            i++;
        }
        if(isPalindrome(i, n))
            System.out.println(n+" là số đối xứng.");
        else
            System.out.println(n+" không là số đối xứng.");
    }
}
