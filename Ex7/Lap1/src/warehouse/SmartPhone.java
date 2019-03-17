package warehouse;

import java.util.Scanner;

public class SmartPhone extends Product{
    private boolean hasCamera;
    private int sim;

    public SmartPhone() {
    }

    public SmartPhone(boolean hasCamera, int sim, int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.hasCamera = hasCamera;
        this.sim = sim;
    }

    public boolean isHasCamera() {
        return hasCamera;
    }

    public void setHasCamera(boolean hasCamera) {
        this.hasCamera = hasCamera;
    }

    public int getSim() {
        return sim;
    }

    public void setSim(int sim) {
        this.sim = sim;
    }
    
    @Override
    public void addNew(Scanner input) {
        super.addNew(input);
        System.out.print("Has Camera: ");
        hasCamera = Boolean.parseBoolean(input.nextLine());
        System.out.print("Sim: ");
        sim = Integer.parseInt(input.nextLine());
    }

    @Override
    public String toString() {
        return "SmartPhone " + super.toString() + hasCamera + " " + sim;
    }
}
