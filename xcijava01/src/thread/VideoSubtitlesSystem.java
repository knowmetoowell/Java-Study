package thread;

class SMIFileThread extends Thread {
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

class VideoFileThread extends Thread {
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



public class VideoSubtitlesSystem {
    public static void main(String[] args) {
        Thread th = new SMIFileThread();
        th.start();

        Thread th2 = new VideoFileThread();
        th2.start();


    }
}
