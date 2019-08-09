package sophuc;

import java.util.Scanner;

public class ComplexNumber {
    private double real;
    private double imagi;
    
    public void scanComplexNumber(Scanner input) {
        System.out.print("Nhập phần thực: ");
        real = input.nextInt();
        System.out.print("Nhập phần ảo: ");
        imagi = input.nextInt();
        System.out.println();
    }
    
    public String add(ComplexNumber a, ComplexNumber b) {
        return (a.real+b.real)+" + "+(a.imagi+b.imagi)+"i";
    }
}
