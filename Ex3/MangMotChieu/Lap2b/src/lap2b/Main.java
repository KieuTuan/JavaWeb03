package lap2b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int []a = new int[5];
        System.out.print("Nhập vào 5 số: ");
        for (int i = 0; i < 5; i++)
            a[i] = input.nextInt();
        int min = a[0];
        for (int i = 1; i < 5; i++) {
            if ( min > a[i])
                min = a[i];
        }
        System.out.println("Phần tử nhỏ nhất trong mảng: "+min);
    }
}
