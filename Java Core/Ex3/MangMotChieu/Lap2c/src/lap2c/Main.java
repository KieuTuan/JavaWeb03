package lap2c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int []a = new int[5];
        System.out.print("Nhập vào 5 số: ");
        for (int i = 0; i < 5; i++)
            a[i] = input.nextInt();
        for (int i = 1; i < 5; i++) {
            if (a[i] % 3 == 0)
                System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
