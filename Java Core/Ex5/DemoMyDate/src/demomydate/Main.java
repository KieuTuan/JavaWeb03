package demomydate;

public class Main {
    public static void main(String[] args) {
        MyDate md = new MyDate(26, 12, 2019);
        System.out.println(md.printShort());
        System.out.println(md.printLong());
        System.out.println(md.addDay(100));
        System.out.println(md.subDay(100));
        System.out.println(md.compareDate(4, 6, 2019));
    }
}
