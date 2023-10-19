package inheritance.typecasting;

class A {

}

class B extends A {

}

public class Typecasting {
    public static void main(String[] args) {
        A aa = new A();
        A ab = new B();

        System.out.println(aa instanceof A);
        System.out.println(ab instanceof A);
        System.out.println(aa instanceof B);
        System.out.println(ab instanceof B);

        if (aa instanceof B) {
            B b = (B) aa;
            System.out.println("aa를 B로 캐스팅");
        } else {
            System.out.println("aa를 B로 캐스팅 불가~");
        }

        if (ab instanceof B) {
            B b = (B) ab;
            System.out.println("ab를 B로 캐스팅");
        } else {
            System.out.println("ab를 B로 캐스팅 불가~");
        }

    }
}
