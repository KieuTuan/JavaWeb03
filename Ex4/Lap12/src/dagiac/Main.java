package dagiac;

public class Main {
    public static void main(String[] args) {
        Polygon rec = new Rectangle(4, 3);
        System.out.println(rec.perimeter());
        System.out.println(rec.acreage());
        Polygon sqr = new Square(5);
        System.out.println(sqr.perimeter());
        System.out.println(sqr.acreage());
    }
}
