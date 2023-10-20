package interface_;

interface A {
    int a =3;

    void abc();
}

public class CreateObjOfInterface {
    public static void main(String[] args) {
        A a1 = new A() {
            @Override
            public void abc() {
                System.out.println("방법2. 익명 이너클래스를 이용한 객체 생성");

            }
        };

        A a2 = new A() {
            @Override
            public void abc() {
                System.out.println("방법2. 익명 이너클래스를 이용한 객체 생성");

            }
        };

        a1.abc();
        a2.abc();
    }
}
