/*
 * Viết chương trình giải phương trình bậc 2 dạng ax^2 + bx + c = 0.
 * Với a,b,c là 3 số thực nhập vào từ bàn phím. 
 */
package lap1;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap a > ");
        double a = input.nextDouble();
        System.out.print("Nhap b > ");
        double b = input.nextDouble();
        System.out.print("Nhap c > ");
        double c = input.nextDouble();
        
        if(a == 0)
        {
            if(b == 0)
            {
                if(c == 0)
                    System.out.println("Phuong trinh vo so nghiem.");
                else
                    System.out.println("Phuong trinh vo nghiem.");
            }
            else
                System.out.printf("Phuong trinh co nghiem duy nhat x = %f.%n", -c/b);
        }
        else
        {
            double delta = b*b-4*a*c;
            if(delta < 0)
                System.out.println("Phuong trinh vo nghiem.");
            else if(delta == 0)
                System.out.printf("Phuong trinh co nghiem kep: x1 = x2 = %f", -b/(2*a));
            else
            {
                System.out.println("Phuong trinh co hai nghiem phan biet:");
                System.out.println("x1 = " +(-b+Math.sqrt(delta))/(2*a));
                System.out.println("x2 = " +(-b-Math.sqrt(delta))/(2*a));
            }
        }
    }    
}
