package thread;


class MyData2 {
    synchronized void abc() {
        for (int i = 0; i < 3; i++) {
            System.out.println(i + "sec");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    synchronized void bcd() {
        for (int i = 0; i < 3; i++) {
            System.out.println(i + "초");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    void cde() {
        synchronized (this) {
            for (int i = 0; i < 3; i++) {
                System.out.println(i + "번쨰");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    void def() {
        synchronized (new Object()) {
            for (int i = 0; i < 3; i++) {
                System.out.println(i + "입니다");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

public class KeyObject {
    public static void main(String[] args) {
        MyData2 myData2 = new MyData2();
        new Thread() {
            public void run (){
                myData2.abc();
            };
        }.start();

        new Thread() {
            public void run (){
                myData2.bcd();
            };
        }.start();

        new Thread() {
            public void run (){
                myData2.cde();
            };
        }.start();

        new Thread() {
            public void run (){
                myData2.def();
            };
        }.start();
    }

}
