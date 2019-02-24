package lap1b;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rng = new Random();
        int m = 3, n = 3;
        int a[][] = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = rng.nextInt(20);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
        System.out.println();
        int s = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                s += a[j][i];
            System.out.print(s+" ");
            s = 0;
        }
    }
}
