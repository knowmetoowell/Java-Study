package lambdaexpression;

interface A_b {
    B_b abc();
}

class B_b {
    B_b() {
        System.out.println("첫번째 생성자");
    }

    B_b(int k) {
        System.out.println("두번쨰 생성자");
    }

}

public class RefOfClassConstructor {
    public static void main(String[] args) {
        A_b a1 = () -> new B_b();
        A_b a2 = B_b::new;
        A_b a3 = () -> new B_b(3);


        a1.abc();
        a2.abc();
        a3.abc();

    }


 }
