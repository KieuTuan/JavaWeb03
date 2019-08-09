package lap5a;

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
        int[] c = new int[3];
        for (int i = 0; i < 3; i++)
            c[i] = a[i]+b[i];
        System.out.println("c = { "+c[0]+", "+c[1]+", "+c[2]+"}");
    }
}
