package dagiac;

public class Rectangle extends Parallelogram {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double perimeter() {
        return 2*a+2*b;
    }
    @Override
    public double acreage() {
        return a*b;
    }
}
