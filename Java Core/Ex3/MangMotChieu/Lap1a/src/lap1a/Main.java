package lap1a;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int []a = new int[5];
        int s = 0;
        System.out.print("Nhập vào 5 số: ");
        for (int i = 0; i < 5; i++)
            a[i] = input.nextInt();
        for (int i = 0; i < 5; i++)
        {
            System.out.print(a[i]+" ");
            s += a[i];
        }
        System.out.println();
        System.out.println("Tổng 5 phần tử của mảng: "+s);
    }
}
