/*
 * Viết chương trình tính giai thừa của số Nguyên dương n, với n nhập vào từ bàn
 * phím. 
 */
package lap2;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap n > ");
        int n = input.nextInt();
        int fac = 1;        // factorial
        for(int i = 1; i <= n; i++)
            fac *= i;
        System.out.println(+n+"! = "+fac);
    }    
}
