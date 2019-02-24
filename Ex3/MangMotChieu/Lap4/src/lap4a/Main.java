package lap4a;

import java.util.Arrays;
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
        Arrays.parallelSort(a);
        for (int i = 0; i < 15; i++)
            System.out.print(a[i]+" ");
        System.out.println("");
    }
}
