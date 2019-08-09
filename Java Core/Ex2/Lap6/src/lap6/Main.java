/*
 * 1. Nhập vào 2 số nguyên a, b từ bàn phím. Tìm ươc chung lớn nhất của 2 số.
 * 2. Nhập vào 2 số nguyên a, b từ bàn phím. Tím bối chung nhỏ nhất của 2 số. 
 */
package lap6;

import java.util.Scanner;

public class Main
{
    public static int menu(Scanner input)
    {
        int choose;
        System.out.println("1. Tìm ước chung lớn nhất hai số.");
        System.out.println("2. Tìm bội chung nhỏ nhất hai số.");
        System.out.print("Mời nhập lựa chọn: ");
        choose = input.nextInt();
        System.out.println("");
        return choose;
    }

    public static int greatestCommonDivisor(Scanner input, int a, int b)      //  ước chung lớn nhất
    {
        if (a==0 ||b==0)
            return a+b;
        while (a!=b)
        {
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        return a;
    }
    
    public static int lowestCommonMultiple(Scanner input, int a, int b)       //  Bội chung nhỏ nhất
    {
        return (a*b)/greatestCommonDivisor(input, a, b);  
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int choose;
        choose = menu(input);
        if(choose != 1 && choose != 2)
            return;
        System.out.print("Nhập a: ");
        int a = input.nextInt();
        System.out.print("Nhập b: ");
        int b = input.nextInt();
        if(choose == 1)
            System.out.println("Ước chung lớn nhất của "+a+ " và "+b+" là " +greatestCommonDivisor(input, a, b));
        else
            System.out.println("Bội chung nhỏ nhất của "+a+ " và "+b+" là " +lowestCommonMultiple(input, a, b));
    }    
}
