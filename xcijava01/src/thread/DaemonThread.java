package thread;


class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println(getName() + " : " + (isDaemon()? "데몬 쓰레드" : "일반 쓰레드"));
        for (int i = 0; i < 6; i++) {

            System.out.println(getName() + " : " + i + "초");;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

public class DaemonThread {
    public static void main(String[] args) {
        Thread thread2 = new MyThread2();
        thread2.setDaemon(true);
        thread2.setName("thread2");
        thread2.start();

        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {

        }
        System.out.println("Main thraed 종료");
    }
}
