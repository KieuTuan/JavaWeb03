package tamgiac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Triangle t = new Triangle();
        t.inputInfo(input);
        System.out.println(t.typeOfTriangle());
        System.out.println("Chu vi: "+t.perimeter());
        System.out.println("Diện tích: "+t.area());
    }
}
