package com.java.library;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static int menu(Scanner input) {
        System.out.println("---Menu---- ----- ----- ----- ----- ----- ----- ----- -----");
        System.out.println("1. Tên, khoa của các độc giả và sắp xếp theo khoa");
        System.out.println("2. Tìm những đọc giả mượn sách ? vào ngày ?");
        System.out.println("3. Tên, số thẻ, tên sách đọc giả mượn sách trong tháng ?");
        System.out.println("4. Danh sách các sách không ai mượn.");
        System.out.println("5. Cho biết đọc giả tên ? mượn sách bao nhiêu lần.");
        System.out.println("6. Danh sách tên, số thẻ các độc giả chưa trả sách.");
        System.out.println("Other...Exit.");
        System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
        System.out.print("Bạn chọn: ");
        return Integer.parseInt(input.nextLine());
    }
    
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            Connect conn = new Connect();
            LibraryManage lbm = new LibraryManage();
            if (conn.getConnect() != null) {
                System.out.println("Kết nối thành công");
                System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
                while (true) {                    
                    int choice = menu(input);
                    switch (choice) {
                        case 1: lbm.func1(conn.getConnect());
                                break;
                        case 2: lbm.func2(input, conn.getConnect());
                                break;
                        case 3: lbm.func3(input, conn.getConnect());
                                break;
                        case 4: lbm.func4(conn.getConnect());
                                break;
                        case 5: lbm.func5(input, conn.getConnect());
                                break;
                        case 6: lbm.func6(conn.getConnect());
                                break;
                        default: System.exit(0);
                    }
                    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
