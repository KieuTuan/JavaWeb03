package dagiac;

public class Square extends Rectangle {
    private double c;

    public Square(double c) {
        super(1, 1);
        this.c = c;
    }

    @Override
    public double perimeter() {
        return 4*c;
    }
    @Override
    public double acreage() {
        return c*c;
    }
}
