package thread.state;

class MyThread4 extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(" -- sleep() 진행 중 Interrupt() 발생");
            for (int i = 0; i < 1000000000; i++) {
                 

            }
        }
    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {

        for (int i = 0; i < 1000000000; i++) {
        }
    }
}

class MyThread2 extends Thread {
    MyThread1 myThread1;

    public MyThread2(MyThread1 myThread1) {
        this.myThread1 = myThread1;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(" -- join(...) 진행 중 Interrupt() 발생");
            for (int i = 0; i < 1000000000; i++) {


            }
        }
    }
}



public class ThreadStateTimeWaiting {
    public static void main(String[] args) {
        MyThread4 myThread = new MyThread4();
        myThread.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            
        }
        System.out.println("myThread.getState() = " + myThread.getState());
        myThread.interrupt();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
        System.out.println("myThread.getState() = " + myThread.getState());

        System.out.println("---------------------------------------------------------------------------");
        //------------------------------------------------- join
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2(myThread1);
        myThread1.start();
        myThread2.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        System.out.println("myThread1.getState() = " + myThread1.getState());
        System.out.println("myThread2.getState() = " + myThread2.getState());

        myThread2.interrupt(); // TimeWaiting -> Runnable
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        System.out.println("myThread1.getState() = " + myThread1.getState());
        System.out.println("myThread2.getState() = " + myThread2.getState());

    }
}
