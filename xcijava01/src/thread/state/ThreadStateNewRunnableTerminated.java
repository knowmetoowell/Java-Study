package thread.state;

public class ThreadStateNewRunnableTerminated {
    public static void main(String[] args) {
        Thread.State state;

        Thread myThread = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000000000; i++) {
                }
            }
        };
        state = myThread.getState();
        System.out.println("my thread state = " + state);

        myThread.start();
        state = myThread.getState();
        System.out.println("my thread state = " + state);

        try {
            myThread.join();
        } catch (InterruptedException e) {

        }
        state = myThread.getState();
        System.out.println("my thread state = " + state);
    }
}
