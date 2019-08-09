package main;

import java.util.Scanner;
import store.Store;

public class Main {
    private static int menu(Scanner input) {
        System.out.println("---Menu-------");
        System.out.println("1. Add Product");
        System.out.println("2. Search name");
        System.out.println("3. Print list");
        System.out.println("Other...: Exit");
        System.out.println("--------------");
        System.out.print("You choose: ");
        int choose = Integer.parseInt(input.nextLine());
        return choose;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Store st = new Store();
        while (true) {            
            int choose = menu(input);
            if(choose > 3 || choose < 1)
                return;
            if(choose == 1)
                st.addProduct(input);
            else if(choose == 2) {
                System.out.print("Search name: ");
                st.search(input.nextLine());
            }
            else
                st.listProduct();
        }
    }
}
