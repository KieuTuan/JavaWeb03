/*
 * Viết chương trình nhập vào số nguyên có 3 chữ số. In ra cách đọc của số đó.
 */
package lap2;

import java.util.Scanner;

public class Main
{
    public static String readNumberA(int b)
    {
        String str = "";
        switch (b)
        {
            case 1: str = "một"; break;
            case 2: str = "hai"; break;
            case 3: str = "ba"; break;
            case 4: str = "bốn"; break;
            case 5: str = "năm"; break;
            case 6: str = "sáu"; break;
            case 7: str = "bảy"; break;
            case 8: str = "tám"; break;
            case 9: str = "chín"; break;
        }
        return str+" trăm ";
    }
    
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
        int a = n/100;
        int b = (n-a*100)/10;
        int c = n%10;
        String strA = readNumberA(a);
        String strBC = "";
        if ( b == 0)
        {
            if ( c != 0)
            {
                if ( c == 1)
                    strBC = "linh một";
                else if ( c == 5)
                    strBC = "linh năm";
                else
                    strBC = "linh "+readNumberB(c);
            }
        }
        else if ( b == 1)
        {
            if ( c == 0)
                strBC = "mười";
            else if ( c == 1)
                strBC = "mười một";
            else if ( c == 4)
                strBC = "mười bốn";
            else
                strBC = "mười "+ readNumberB(c);
        }
        else
        {
            String strB, strC;
            if ( b == 4)
                strB = "bốn";
            else if ( b == 5)
                strB = "năm";
            else
                strB = readNumberB(b);
            strC = readNumberB(c);
            strBC = strB +" mươi "+ strC;
        }
        return strA + strBC;
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số có ba chữ số: ");
        int n = input.nextInt();
        System.out.println(readNumber(n));
    }
}
