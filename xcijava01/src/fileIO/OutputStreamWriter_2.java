package fileIO;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriter_2 {
    public static void main(String[] args) {

        try {
            OutputStreamWriter osw = new OutputStreamWriter(System.out, "UTF-8");
            osw.write("outputStreamWriter를 이용한\n".toCharArray());
            osw.write("콘솔 출력 예제입니다. \n한글과 영문이 모두 포함되어 있습니다.");
            osw.write('\n');
            osw.write("Good Bye!!!\n\n");
            osw.flush();
            System.out.println(osw.getEncoding());
        } catch (IOException e) {

        }
        System.out.println();

        try {
            OutputStreamWriter osw = new OutputStreamWriter(System.out, "MS949");
            osw.write("outputStreamWriter를 이용한\n".toCharArray());
            osw.write("콘솔 출력 예제입니다. \n한글과 영문이 모두 포함되어 있습니다.");
            osw.write('\n');
            osw.write("Good Bye!!!\n\n");
            osw.flush();
            System.out.println(osw.getEncoding());
        } catch (IOException e) {

        }
        System.out.println();


    }
}
