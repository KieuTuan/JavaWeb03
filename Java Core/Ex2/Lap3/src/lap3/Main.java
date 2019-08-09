/*
 * 1. Viết chương trình kiểm tra số n có phải là số nguyên tố.
 * 2. Viết chương trinh in ra n số nguyên tố đầu tiên. Với n nhập vào từ bàn phím.
 */
package lap3;

import java.util.Scanner;

public class Main
{
    public static int menu(Scanner input)
    {
        int choose;
        System.out.println("1. Kiểm tra một số có phải là số nguyên tố.");
        System.out.println("2. In ra n số nguyên tố đầu tiên.");
        System.out.print("Mời nhập lựa chọn: ");
        choose = input.nextInt();
        return choose;
    }
    
    public static boolean isPrimeNumber(int n)
    {
        if(n == 0 || n == 1)
            return false;
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n%i == 0)
                return false;
        return true;
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int choose = menu(input);
        if(choose != 1 && choose != 2)
            return;
        System.out.print("Nhập n > ");
        int n = input.nextInt();
        if(choose == 1)
        {
            if(isPrimeNumber(n))
                System.out.println(+n+" là số nguyên tố.");
            else
                System.out.println(+n+" không là số nguyên tố.");
        }
        else
        {
            System.out.println(+n+" số nguyên tố đầu tiên là:");
            int i = 2;
            int temp = 0;
            while(temp < n)
            {
                if(isPrimeNumber(i))
                {
                    System.out.print(+i+" ");
                    temp++;
                }
                i++;
            }
            System.out.println("");
        }
    }    
}
