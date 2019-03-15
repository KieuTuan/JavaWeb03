package sophuc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ComplexNumber a = new ComplexNumber();
        System.out.println("Nhập số thứ nhất:");
        a.scanComplexNumber(input);
        ComplexNumber b = new ComplexNumber();
        System.out.println("Nhập số thứ hai:");
        b.scanComplexNumber(input);
        System.out.println(a.add(a, b));
    }
}
