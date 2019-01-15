/*
 * Viết chương trình in ra tất cả dãy fibonaci < n, với n nhập vào từ bàn phím. 
 */
package lap7;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = input.nextInt();
        int a = 1, b = 1;
        System.out.println("Dãy " +n+ " số fibonaci đầu tiên là:");
        int i = 0;
        int temp;
        while(i < n)
        {
            System.out.print(a +" ");
            temp = b;
            b += a;
            a = temp;
            i++;
        }
        System.out.println("");
    }
}
