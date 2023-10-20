package innerclass;


class AA {
    int a = 3;
    static int b =4;

    void method1() {
        System.out.println("instance method");
    }

    static void method2() {
        System.out.println("static method");
    }

    static class B {

        void bcd() {
            //System.out.println(a);
            System.out.println(b);
            //method1();
            method2();
        }
    }
}

public class StaticInnerClass {

    public static void main(String[] args) {
        AA a = new AA();
        AA.B b = new AA.B();
        b.bcd();
    }
}
