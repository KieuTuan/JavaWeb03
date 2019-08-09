package tamgiac;

import java.util.Scanner;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle() {
        a = 0;
        b = 0;
        c = 0;
    }
    
    private boolean isTriangle() {
        if(a+b<=c || a+c<=b || b+c<=a)
            return false;
        return true;
    }
    
    public void inputInfo(Scanner input) {
        boolean bl;
        do {
            System.out.println("Nhập vào 3 cạnh tam giác.");
            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();
            bl = isTriangle();
            if(bl == false)
                System.out.println("a, b, c không phải 3 cạnh của 1 tam giác, mời nhập lại.");
        } while (bl == false);
        System.out.println("Nhập thành công.");
    }
    
    public String typeOfTriangle() {
        if(a == b && b == c)
            return "Đây là tam giác đều.";
        else if(a*a==b*b+c*c || b*b==a*a+c*c || c*c==a*a+b*b) {
            if(a==b || b==c || c==a)
                return "Đây là tam giác vuông cân.";
            return "Đây là tam giác vuông";
        }
        else if(a==b || b==c || c==a)
            return "Đây là tam giác cân.";
        return "Đây là tam giác thường.";
    }
    
    public double perimeter() {
        return a+b+c;
    }
    
    public double area() {
        double p = perimeter()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
