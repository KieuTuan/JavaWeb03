package warehouse;

import java.util.Scanner;

public class Product {
    private int id;
    private String name;
    private double price;       // giá bán
    private int quantity;       // số lượng

    public Product() {
    }

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public void addNew(Scanner input) {
        System.out.print("ID: ");
        id = Integer.parseInt(input.nextLine());
        System.out.print("Name: ");
        name = input.nextLine();
        System.out.print("Price: ");
        price = Double.parseDouble(input.nextLine());
        System.out.print("Quantity: ");
        quantity = Integer.parseInt(input.nextLine());
    }

    @Override
    public String toString() {
        return id + " " + name + " " + price + " " + quantity + " ";
    }
}
