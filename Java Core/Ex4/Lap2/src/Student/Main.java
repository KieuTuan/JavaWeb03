package Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student st = new Student();
        st.inputInfo(input);
        st.showInfo();
        if(st.scholarship())
            System.out.println("Được học bổng.");
        else
            System.out.println("Không được học bổng.");
    }
}
