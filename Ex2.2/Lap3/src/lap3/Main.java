/*
 * Viết chương trình in ra tất cả các cách đổi 3.000.000
 * ra thành các tiền có mệnh giá 100.000, 200.000, 500.000
 */
package lap3;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int a;
        for (int i = 0; i <= 6; i++) 
        {
            for (int j = 0; j <= 15; j++)
            {
                a = 30-5*i-2*j;
                if ( a >= 0)
                    System.out.printf("%4dx100.000 %4dx200.000 %4dx500.000%n", a, j, i);
            }
        }
    }
}
