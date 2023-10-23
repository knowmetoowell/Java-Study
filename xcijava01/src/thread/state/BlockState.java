package thread.state;



class BlockStateTest {

    MyClass mc = new MyClass();
    Thread t1 = new Thread("thread1") {
        public void run() {
            mc.syncMethod();
        }
    };
    Thread t2 = new Thread("thread2") {
        public void run() {
            mc.syncMethod();
        }
    };
    Thread t3 = new Thread("thread3") {
        public void run() {
            mc.syncMethod();
        }
    };

    void startAll() {
        t1.start();
        t2.start();
        t3.start();
    }



    class MyClass {
        synchronized void syncMethod() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }

            System.out.println("====" + Thread.currentThread().getName() + "====");
            System.out.println("thread1 -> " + t1.getState());
            System.out.println("thread2 -> " + t2.getState());
            System.out.println("thread3 -> " + t3.getState());
            for (int i = 0; i < 1000000000; i++) {
            }
        }
    }
}

public class BlockState {
    public static void main(String[] args) {
        BlockStateTest bst = new BlockStateTest();
        bst.startAll();
    }
}
