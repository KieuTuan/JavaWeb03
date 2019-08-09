package lap3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int []b = new int[5];
        
        System.out.print("Nhập vào 5 số: ");
        for (int i = 0; i < 5; i++)
            b[i] = input.nextInt();
        System.out.print("Nhập vào số a: ");
        int a = input.nextInt();
        int index = -1;
        for (int i = 1; i < 5; i++) {
            if ( b[i] == a) {
                System.out.print(i+" ");
                index = i;
            }
        }
        System.out.println();
        if ( index == -1)
            System.out.println("Mảng không có số nào bằng "+a);
    }
}
