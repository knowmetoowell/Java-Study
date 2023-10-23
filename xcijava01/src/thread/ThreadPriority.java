package thread;


class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 1000000000; i++) {

        }

        System.out.println(getName() + " 우선순위: " + getPriority());
    }
}


public class ThreadPriority {
    public static void main(String[] args) {
        System.out.println("코어 수: " + Runtime.getRuntime().availableProcessors());

        for (int i = 0; i < 3; i++) {
            Thread thread = new MyThread3();
            thread.start();

        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e.getMessage());
        }
        for (int i = 0; i < 10; i++) {
            Thread thread = new MyThread3();
            thread.setName(i + "번째 쓰레드");

            if (i == 9) {
                thread.setPriority(10);
            }
            thread.start();

        }


    }
}
