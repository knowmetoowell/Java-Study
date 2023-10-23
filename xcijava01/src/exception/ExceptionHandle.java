package exception;


class A {
    void abc() {
        bcd();
    }

    void bcd() {
        try {
            Class las = Class.forName("java.lang.Object");
            Thread.sleep(1000);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class B {
    void abc() {
        try {
            bcd();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    void bcd() throws ClassNotFoundException, InterruptedException {
        Class las = Class.forName("java.lang.Object");
        Thread.sleep(1000);
    }
}
public class ExceptionHandle {
}
