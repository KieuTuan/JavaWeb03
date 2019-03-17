package warehouse;

import java.util.Scanner;

public class Camera extends Product{
    private boolean hasWifi;

    public Camera() {
    }

    public Camera(boolean hasWifi, int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.hasWifi = hasWifi;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }
    
    @Override
    public void addNew(Scanner input) {
        super.addNew(input);
        System.out.print("Has Wifi: ");
        hasWifi = Boolean.parseBoolean(input.nextLine());
    }

    @Override
    public String toString() {
        return "Camera " + super.toString() + hasWifi;
    }
    
    
}
