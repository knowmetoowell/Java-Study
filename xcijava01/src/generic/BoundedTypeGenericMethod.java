package generic;

class Aa {
    public <T extends Number> void method1(T t) {
        System.out.println(t.intValue());
    }
}

interface MyInterface {
    public void print();
}

class Bb {
    public <T extends MyInterface> void method1(T t) {
        t.print();
    }
}

public class BoundedTypeGenericMethod {
    public static void main(String[] args) {
        Aa a = new Aa();
        a.method1(5.8);

        Bb b = new Bb();
        b.method1(new MyInterface() {
            @Override
            public void print() {
                System.out.println("print 구현");
            }
        });
    }
}
