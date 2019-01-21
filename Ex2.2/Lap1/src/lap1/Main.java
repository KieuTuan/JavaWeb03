/*
 * Viết chương trình nhập vào số nguyên có 2 chữ số. In ra cách đọc của số đó.
 */
package lap1;

import java.util.Scanner;

public class Main
{
    public static String readNumberB(int b)
    {
        String str = "";
        switch (b)
        {
            case 0: str = ""; break;
            case 1: str = "mốt"; break;
            case 2: str = "hai"; break;
            case 3: str = "ba"; break;
            case 4: str = "tư"; break;
            case 5: str = "lăm"; break;
            case 6: str = "sáu"; break;
            case 7: str = "bảy"; break;
            case 8: str = "tám"; break;
            case 9: str = "chín"; break;
        }
        return str;
    }
    
    public static String readNumber(int n)
    {
        int a = n/10;
        int b = n%10;
        String str = "";
        if ( a == 1)
        {
            if ( b == 1)
                str = "mười một";
            else if ( b == 4)
                str = "mười bốn";
            else
                str = "mười "+ readNumberB(b);
        }
        else
        {
            String strA, strB;
            if ( a == 4)
                strA = "bốn";
            else if ( a == 5)
                strA = "năm";
            else
                strA = readNumberB(a);
            strB = readNumberB(b);
            str = strA +" mươi "+ strB;
        }
        return str;
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số có hai chữ số: ");
        int n = input.nextInt();
        System.out.println(readNumber(n));
    }
}
