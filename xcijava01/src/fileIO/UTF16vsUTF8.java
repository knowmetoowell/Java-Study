package fileIO;

import java.io.UnsupportedEncodingException;

public class UTF16vsUTF8 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] b1 = "abc".getBytes("UTF-16");
        byte[] b2 = "abc".getBytes("UTF-8");
        System.out.println("b1.length = " + b1.length);
        System.out.println("b2.length = " + b2.length);
        for (byte b : b1) {

        }
    }
}
