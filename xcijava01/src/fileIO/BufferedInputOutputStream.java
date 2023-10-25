package fileIO;

import java.io.*;

public class BufferedInputOutputStream {
    public static void main(String[] args) {
        File orgFile = new File("C:\\Users\\sangwon\\Desktop\\바지.png");
        File copyFile1 = new File("C:\\Users\\sangwon\\Desktop\\바지1.png");
        File copyFile2 = new File("C:\\Users\\sangwon\\Desktop\\바지2.png");

        long start, end, time1, time2;
        start = System.nanoTime();
        try (InputStream is = new FileInputStream(orgFile);
             OutputStream os = new FileOutputStream(copyFile1)) {
            int data;
            while ((data = is.read()) != -1) {
                os.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        end = System.nanoTime();
        time1 = end - start;
        System.out.println("time1(noBuffered) = " + time1);

        start = System.nanoTime();

        try (InputStream is = new FileInputStream(orgFile);
             BufferedInputStream bis = new BufferedInputStream(is);
             OutputStream os = new FileOutputStream(copyFile1);
             BufferedOutputStream bos = new BufferedOutputStream(os)) {
            int data;
            while ((data = bis.read()) != -1) {
                os.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        end = System.nanoTime();
        time2 = end - start;
        System.out.println("time2(Buffered) = " + time2);



    }
}
