package songuyento;

public class Prime {
    private int a;

    public Prime() {
    }

    public Prime(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
        System.out.println("Lưu trữ thành công.");
    }
    
    public boolean isPrime(int x) {
        for (int i = 2; i <= Math.sqrt(x); i++)
            if(x%i == 0)
                return false;
        return true;
    }
    
    public int nextPrime() {
        boolean bl = false;
        do {
            a++;
            bl = isPrime(a);
        } while (bl == false);
        return a;
    }
}
