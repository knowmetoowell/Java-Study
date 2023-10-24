package lambdaexpression;


interface AAA {
    void abc();
}

class BBB {
    static void bcd() {
        System.out.println("메서드");
    }
}

public class RefOfStaticMethod {
    public static void main(String[] args) {
        AAA a = new AAA() {
            @Override
            public void abc() {
                BBB.bcd();
            }
        };

        AAA a2 = () -> {
            BBB.bcd();
        };

        AAA a3 = BBB::bcd;
        a3.abc();
    }
}
