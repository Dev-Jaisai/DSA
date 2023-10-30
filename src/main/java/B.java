

public class B extends A {
    void m1(double d) {
        System.out.println("m2-Q");
    }

    public static void main(String[] args) {
        B q = new B();
        q.m1(1);
        q.m1(null);
    }
}
