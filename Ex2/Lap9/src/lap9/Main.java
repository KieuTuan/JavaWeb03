/*
 * Lập chương trình tính cos(x) với độ chính xác 0.0001 theo công thức:
 * cos(x)= 1 – x^2/2! + x^4/4! – …+(-1)^n.x^(2n)/(2n)!
 * x nhập vào từ bàn phím. 
 */
package lap9;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập x (radian): ");
        double x = input.nextFloat();
        double doa = 0.0001;     // degree of accuracy
        int sign = -1;
        double num = x*x, deno = 2;
        double unit = sign*num/deno;
        double s = 1+unit;
        int i = 3;
        while(Math.abs(unit) > doa)
        {
            sign *= -1;
            num  *= x*x;
            deno *= i*(i+1);
            unit  = sign*num/deno;
            s += unit;
            i += 2;
        }
        System.out.println("cos(x) = "+s);
    }
}
