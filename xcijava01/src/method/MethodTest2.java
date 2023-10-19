package method;

import java.util.Scanner;

public class MethodTest2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 2개를 입력 > ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + "+"+b +"=" + add(a, b) );

        System.out.println("주사위 값은 " + dice());
    }

    private static int dice() {
        return (int)(Math.random() * 6)+1;
    }

    private static int add(int a, int b) {
        return a+b;
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
