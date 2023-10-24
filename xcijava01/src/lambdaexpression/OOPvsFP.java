package lambdaexpression;


interface AA {
    void abc();
}

class BB implements AA {
    @Override
    public void abc() {
        System.out.println("메서드 내용 1");
    }
}
public class OOPvsFP {
    public static void main(String[] args) {
        AA a1 = new BB();
        a1.abc();
        AA a2 = new AA() {
            @Override
            public void abc() {
                System.out.println("메서드 내용 2");
            }
        };
        a2.abc();
        AA a3 = () -> {
            System.out.println("메서드 내용 3");
        };
        a3.abc();
    }
}
