package nhanVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employees epy = new Employees();
        epy.inputInfo(input);
        epy.printInfo();
        System.out.println("Bonus: "+epy.bonus());
    }
}
