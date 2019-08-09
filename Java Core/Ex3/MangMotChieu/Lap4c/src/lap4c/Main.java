package lap4c;

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
        int n = 0;
        for (int i = 0; i < 15; i++)
            if (a[i]%2==0)
                n++;
        System.out.println(n);
    }
}
