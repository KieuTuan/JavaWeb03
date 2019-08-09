package lap2b;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rng = new Random();
        
        int m = 2, n = 3, p = 2;
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
        
        int b[][] = new int[n][p];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < p; j++)
                b[i][j] = rng.nextInt(20);
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++)
                System.out.print(b[i][j]+" ");
            System.out.println();
        }
        System.out.println();
        
        
        int c[][] = new int[m][p];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < p; j++)
                c[i][j] = 0;
        
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                for (int k = 0; k < p; k++)
                    c[j][k] += a[j][i]*b[i][k];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++)
                System.out.print(c[i][j]+" ");
            System.out.println();
        }
    }
}