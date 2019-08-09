package lap4b;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rng = new Random();
        int []a = new int[15];
        for (int i = 0; i < 15; i++)
            a[i] = rng.nextInt(100);
        for (int i = 0; i < 15; i++)
            System.out.print(a[i]+" ");
        System.out.println("");
        
        for (int i = 0; i < 15; i++)
            for (int j = 0; j < 15; j++)
                if( a[i] > a[j]) {
                    a[i] = a[i] + a[j];
                    a[j] = a[i] - a[j];
                    a[i] = a[i] - a[j];
                }
        
        for (int i = 0; i < 15; i++)
            System.out.print(a[i]+" ");
        System.out.println("");
    }
}
