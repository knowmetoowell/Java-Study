package innerclass;


class A {
    public int a = 3;
    protected int b =4;
    int c = 5;
    private int d = 6;

    void abc() {
        System.out.println("A 클래스 메서드 abc()");
    }

    class B {

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        void abc() {
            System.out.println("B 클래스 메서드 abc()");
        }
        void bcd() {
            abc();
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println("---------------------");
            A.this.abc();
            System.out.println(A.this.a);
            System.out.println(A.this.b);
            System.out.println(A.this.c);
            System.out.println(A.this.d);


        }
    }
}

public class InnerClassTest {

    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        b.bcd();
    }
}
