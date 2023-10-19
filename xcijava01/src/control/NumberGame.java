package control;

import java.util.Scanner;

public class NumberGame {
    // 0~9 까지의 숫자 3개 맞추기
    // a b c
    // strike
    // ball
    // 0S, 0B
    // 3 7 1 : 0S 0B
    // 4 8 2 : 1S 0B
    // 4 5 9 : 0S 1B
    // 9 7 2 : 2S 0B
    // 9 6 2 : 2S 0B
    // 9 0 2 : 3S 0B

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s, b, count = 0;
        int c1, c2, c3;
        int h1, h2, h3;


        c1 = (int) (Math.random() * 10);
        do {
            c2 = (int) (Math.random() * 10);
        } while (c2 == c1);
        do {
            c3 = (int) (Math.random() * 10);
        } while (c3 == c1 || c3 == c2);


        do {
            System.out.print("0~9 사이의 중복되지 않은 숫자 3개 입력 (ex. 3 7 0) >> ");
            s = b = 0;
            h1 = sc.nextInt();
            h2 = sc.nextInt();
            h3 = sc.nextInt();

            if (h1 == c1) s++;
            else if (h1 == c2 || h1 == c3) b++;

            if (h2 == c2) s++;
            else if (h2 == c1 || h2 ==c3) b++;

            if (h3 == c3) s++;
            else if (h3 == c1 || h3 == c2) b++;

            System.out.println("[" + s +"S " + b + "B]");
            count++;
        } while (s !=3);
        System.out.println("축하합니다. " + count +"번 만에 맞추셨습니다.");
    }

}
