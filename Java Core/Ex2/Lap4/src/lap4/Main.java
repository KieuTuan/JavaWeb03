/*
 * 1. Viết chương trình cho phép người dùng nhập vào 1 số nguyên cho đến khi
 * người dùng nhập số 0 thì dừng lại và in ra số lớn nhất mà người dùng vừa nhập
 * 2. Viết chương trình cho phép người dùng nhập vào 1 số nguyên cho đến khi
 * người dùng nhập số 0 thì dừng lại và in ra số nhỏ nhất mà người dùng vừa nhập 
 */
package lap4;

import java.util.Scanner;

public class Main
{
    public static int menu(Scanner input)
    {
        int choose;
        System.out.println("1. Tìm max một dãy số.");
        System.out.println("2. Tìm min một dãy số.");
        System.out.print("Mời nhập lựa chọn: ");
        choose = input.nextInt();
        return choose;
    }

    public static int maxOfLine(Scanner input)
    {
        System.out.println("Nhập dãy số:");
        int max = input.nextInt();
        int i;
        do
        {
            i = input.nextInt();
            if(max < i)
                max = i;
        }
        while(i != 0);
        return max;
    }
    
    public static int minOfLine(Scanner input)
    {
        System.out.println("Nhập dãy số:");
        int min = input.nextInt();
        int i;
        do
        {
            i = input.nextInt();
            if(min > i)
                min = i;
        }
        while(i != 0);
        return min;
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int choose;
        choose = menu(input);
        if(choose != 1 && choose != 2)
            return;
        if(choose == 1)
            System.out.println(maxOfLine(input));
        else
            System.out.println(minOfLine(input));
    }    
}
