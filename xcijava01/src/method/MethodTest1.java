package method;

import java.util.Arrays;

public class MethodTest1 {

    public static void main(String[] args) {
        print();
        welcome("이상우니");
        System.out.println("종료");

    }

    private static void welcome(String name) {
        System.out.println("---------------------");
        System.out.println("안녕하세요~ " + name + "님~");
        System.out.println("---------------------");
    }

    private static void print() {
        System.out.println("---------------------");
        System.out.println("sangwon2");
        System.out.println("---------------------");
    }
}
