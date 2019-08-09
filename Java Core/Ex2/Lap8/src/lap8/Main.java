/*
 * Lập chương trình tính sin(x) với độ chính xác 0.0001 theo công thức:
 * sin(x) = x – x^3/3! + x^5/5! – …+(-1)^n.x^(2n+1)/(2n+1)!
 * x nhập vào từ bàn phím. 
 */
package lap8;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập x (radian): ");
        double x = input.nextFloat();
        double s = x;
        double doa = 0.0001;     // degree of accuracy
        double num = x, deno = 1;
        double unit = x;
        int i = 2;
        int sign = -1;
        while(Math.abs(unit) > doa)
        {
            num  *= x*x;
            deno *= i*(i+1);
            unit  = sign*num/deno;
            s += unit;
            i += 2;
            sign *= -1;
        }
        System.out.println("sin(x) = "+s);
    }
}
