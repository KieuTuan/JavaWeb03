package lap5b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vector a: ");
        int[] a = new int[3];
        for (int i = 0; i < 3; i++)
            a[i] = input.nextInt();
        System.out.print("Nhập vector b: ");
        int[] b = new int[3];
        for (int i = 0; i < 3; i++)
            b[i] = input.nextInt();
        int s = 0;
        for (int i = 0; i < 3; i++)
            s += a[i]*b[i];
        System.out.println(s);
    }
}
