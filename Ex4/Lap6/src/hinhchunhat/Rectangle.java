package hinhchunhat;

import java.util.Scanner;

public class Rectangle {
    private double a;
    private double b;

    public Rectangle() {
        a = 0;
        b = 0;
    }
    
    public void inputInfo(Scanner input) {
        System.out.println("Nhập vào chiều dài, chiều rộng:");
        a = input.nextInt();
        b = input.nextInt();
    }
    
    public double perimeter() {
        return 2*a+2*b;
    }
    
    public double area() {
        return a*b;
    }
}
