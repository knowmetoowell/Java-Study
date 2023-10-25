package lambdaexpression;


interface Aa {
    int abc(String str);
}

interface Aaa {
    void abc(Bb b, int k);
}
class Bb {
    void bcd(int k) {
        System.out.println("k = " + k);
    }
}


public class RefOfInstanceMethod {
    public static void main(String[] args) {
        Aa a1 = new Aa() {
            @Override
            public int abc(String str) {
                return str.length();
            }
        };

        Aa a2 = (String str) -> str.length();
        Aa a3 = String::length;
        System.out.println(a1.abc("하이"));
        System.out.println(a2.abc("하이"));
        System.out.println(a3.abc("하이"));
//----------------------------------------------------------
        Aaa aa1 = (Bb bb, int k) -> bb.bcd(k);
        Aaa aa2 = Bb::bcd;
        aa1.abc(new Bb(), 3);
        aa2.abc(new Bb(), 3);
    }
}
