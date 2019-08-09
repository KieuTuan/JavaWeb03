package phanso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Fraction f = new Fraction();
//        f.scanFraction(input);
//        f.printFraction();
//        f = f.compactFraction();
//        f.printFraction();
//        f.flipFraction();
//        System.out.println();
        
        Fraction f1 = new Fraction(3, 5);
        Fraction f2 = new Fraction(2, 5);
        f = f.addFraction(f1, f2);
        f.printFraction();
        f = f.subFraction(f1, f2);
        f.printFraction();
        f = f.mulFraction(f1, f2);
        f.printFraction();
        f = f.divFraction(f1, f2);
        f.printFraction();
    }
}
