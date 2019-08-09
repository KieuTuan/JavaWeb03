package songuyento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Prime pr = new Prime();
        boolean bl = false;
        int x;
        do {
            x = input.nextInt();
            bl = pr.isPrime(x);
            if(bl == false)
                System.out.println("x không phải là số nguyên tố, không lưu trữ. ");
            else
                pr.setA(x);
        } while (bl == false);
        System.out.print("Số nguyên tố tiếp theo: "+pr.nextPrime()+"\n");
    }
}
