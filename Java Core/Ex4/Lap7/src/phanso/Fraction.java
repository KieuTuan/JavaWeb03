package phanso;

import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        numerator = 0;
        denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    
    public void scanFraction(Scanner input) {
        System.out.print("Tử số: ");
        numerator = input.nextInt();
        System.out.print("Mẫu số: ");
        do {
            denominator = input.nextInt();
            if(denominator == 0)
                System.out.print("Mẫu số phải khác 0, yêu cầu nhập lại: ");
        } while (denominator == 0);
    }
    
    public void printFraction() {
        System.out.println(numerator+"/"+denominator);
    }
    
    private int greatestCommonDivisor(int a, int b) {
        a=Math.abs(a); 
        b=Math.abs(b);            
        if (a==0)
            return 0;
        while (a!=b)
        {
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        return a;
    }
    
    public Fraction compactFraction() {
        int gcd = greatestCommonDivisor(numerator, denominator);
        Fraction a = new Fraction();
        if(gcd != 0) {
            a.numerator = numerator/gcd;
            a.denominator = denominator/gcd;
        }
        return a;
    }
    
    public void flipFraction() {
        int a = numerator;
        int b = denominator;
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Phân số nghịch đảo: "+a+"/"+b);
    }
    
    public Fraction addFraction(Fraction a, Fraction b) {
        Fraction c = new Fraction();
        c.denominator = a.denominator*b.denominator;
        c.numerator = a.numerator*b.denominator+a.denominator*b.numerator;
        c = c.compactFraction();
        return c;
    }
    
    public Fraction subFraction(Fraction a, Fraction b) {
        Fraction c = new Fraction();
        c.denominator = a.denominator*b.denominator;
        c.numerator = a.numerator*b.denominator-a.denominator*b.numerator;
        c = c.compactFraction();
        return c;
    }
    
    public Fraction mulFraction(Fraction a, Fraction b) {
        Fraction c = new Fraction();
        c.numerator = a.numerator*b.numerator;
        c.denominator = a.denominator*b.denominator;
        c = c.compactFraction();
        return c;
    }
    
    public Fraction divFraction(Fraction a, Fraction b) {
        Fraction c = new Fraction();
        c.numerator = a.numerator*b.denominator;
        c.denominator = a.denominator*b.numerator;
        c = c.compactFraction();
        return c;
    }
}
