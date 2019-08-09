package hinhchunhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle r = new Rectangle();
        r.inputInfo(input);
        System.out.println("Chu vi: "+r.perimeter());
        System.out.println("Diện tích: "+r.area());
    }
}
