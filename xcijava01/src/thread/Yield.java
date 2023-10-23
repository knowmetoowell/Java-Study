package thread;


class MyThread3 extends Thread {
    boolean yieldFlag;

    @Override
    public void run() {
        while (true) {
            if (yieldFlag) {
                Thread.yield();
            } else {
                System.out.println(getName() + " 실행");
                for (long i = 0; i < 1000000000L; i++) {

                }
            }
        }

    }
}
public class Yield {
    public static void main(String[] args) {
        MyThread3 thread1 = new MyThread3();
        thread1.setName("thread1");
        thread1.yieldFlag = false;
        thread1.setDaemon(true);
        thread1.start();

        MyThread3 thread2 = new MyThread3();
        thread2.setName("thread2");
        thread2.yieldFlag = true;
        thread2.setDaemon(true);
        thread2.start();

        for (int i = 0; i < 6; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            thread1.yieldFlag = !thread1.yieldFlag;
            thread2.yieldFlag = !thread2.yieldFlag;
        }
    }
}
