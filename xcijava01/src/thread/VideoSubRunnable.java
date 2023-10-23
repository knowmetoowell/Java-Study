package thread;


class SMIFileRunnable implements Runnable {
    @Override
    public void run() {
        String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
        try {
            Thread.sleep(100);
        } catch (Exception e) {

        }

        for (int i = 0; i < strArray.length; i++) {
            System.out.println("- (자막 번호) " + strArray[i]);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                //throw new RuntimeException(e);
            }

        }
    }
}

class VideoFileRunnable implements Runnable {
    @Override
    public void run() {
        int[] intArr = {1, 2, 3, 4, 5};

        for (int i = 0; i < intArr.length; i++) {
            System.out.print("(비디오 프레임) " + intArr[i]);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                //throw new RuntimeException(e);
            }

        }
    }
}


public class VideoSubRunnable {
    public static void main(String[] args) {
        Runnable smiFile = new SMIFileRunnable();
        Thread tr1 = new Thread(smiFile);
        tr1.start();

        Runnable videoFile = new VideoFileRunnable();
        Thread tr2 = new Thread(videoFile);
        tr2.start();
    }
}
