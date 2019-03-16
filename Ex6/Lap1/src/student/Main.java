package student;

import java.util.Scanner;

public class Main {
    private static int menu(Scanner input) {
        System.out.println("---MENU---");
        System.out.println("1. List");
        System.out.println("2. Search");
        System.out.println("3. Add");
        System.out.println("4. Exit\n");
        System.out.print("Nhập lựa chọn của bạn: ");
        int choose = Integer.parseInt(input.nextLine());
        return choose;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentManager stm = new StudentManager();
        while (true) {            
            int choose = menu(input);
            if(choose < 1 || choose >3)
                break;
            if(choose == 1)
                stm.list();
            else if(choose == 2) {
                System.out.print("Nhập tên sinh viên muốn tìm kiếm: ");
                stm.search(input.nextLine());
            }
            else {
                Student st = new Student();
                System.out.print("Nhập tên: ");
                st.setName(input.nextLine());
                System.out.print("Nhập email: ");
                st.setEmail(input.nextLine());
                System.out.print("Nhập tuổi: ");
                st.setAge(Integer.parseInt(input.nextLine()));
                stm.add(st);
            }
        }
    }
}
