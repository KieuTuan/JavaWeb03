package store;

import java.util.ArrayList;
import java.util.Scanner;
import warehouse.*;

public class Store {
    private ArrayList<Product> listProduct = new ArrayList();
    
    private int menuAdd(Scanner input) {
        System.out.println("---Menu_Add---");
        System.out.println("1. SmartPhone");
        System.out.println("2. Camera");
        System.out.println("Other...: Exit");
        System.out.println("--------------");
        System.out.print("You choose: ");
        int choose = Integer.parseInt(input.nextLine());
        return choose;
    }
    
    public void addProduct(Scanner input) {
        Product prd;
        int choose;
        while (true) {
            choose = menuAdd(input);
            if(choose > 2 || choose < 1)
                return;
            if(choose == 1) {
                prd = new SmartPhone();
                prd.addNew(input);
            }
            else {
                prd = new Camera();
                prd.addNew(input);
            }
            listProduct.add(prd);
        }
    }
    
    public void listProduct() {
        for (int i = 0; i < listProduct.size(); i++) {
            System.out.println(listProduct.get(i).toString());
        }
    }
    
    public void search(String name) {
        for (int i = 0; i < listProduct.size(); i++)
            if(listProduct.get(i).getName().equals(name)) {
                System.out.println(listProduct.get(i).toString());
                return;
            }
        System.out.println("The name does not exist.");
    }
}
