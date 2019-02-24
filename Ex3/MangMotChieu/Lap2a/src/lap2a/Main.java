package lap2a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int []a = new int[5];
        
        System.out.print("Nhập vào 5 số: ");
        for (int i = 0; i < 5; i++)
            a[i] = input.nextInt();
        int max = a[0];
        for (int i = 1; i < 5; i++) {
            if ( max < a[i])
                max = a[i];
        }
        System.out.println("Phần tử lớn nhất trong mảng: "+max);
    }
}
