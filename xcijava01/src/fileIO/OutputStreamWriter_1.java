package fileIO;

import java.io.*;

public class OutputStreamWriter_1 {
    public static void main(String[] args) {
        File outputStreamWriter1 = new File("C:\\Users\\sangwon\\Desktop\\OutputStreamWriter1.txt");
        try (Writer writer = new FileWriter(outputStreamWriter1);) {
            writer.write("outputStreamWriter1 예제파일입니다.\n".toCharArray());
            writer.write("한글과 영문이 모두 포함되어 있습니다.");
            writer.write('\n');
            writer.write("Good Bye!!!\n\n");
            writer.flush();
        } catch (IOException e) {}

        File outputStreamWriter2 = new File("C:\\Users\\sangwon\\Desktop\\OutputStreamWriter2.txt");
        try (OutputStream os = new FileOutputStream(outputStreamWriter2, false);
             OutputStreamWriter osw = new OutputStreamWriter(os, "MS949");) {
            osw.write("outputStreamWriter2 예제파일입니다.\n".toCharArray());
            osw.write("한글과 영문이 모두 포함되어 있습니다.");
            osw.write('\n');
            osw.write("Good Bye!!!\n\n");
            osw.flush();
            System.out.println(osw.getEncoding());
        } catch (IOException e) {

        }
    }
}
