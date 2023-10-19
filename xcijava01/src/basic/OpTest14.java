package basic;

import java.io.IOException;
import java.util.Random;

public class OpTest14 {
    public static void main(String[] args) {
//        double n = 10;  // 묵시적 형변환(자동 형변환)
//        System.out.println(n);
//
//        int p = (int) 3.14; // 명시적 형변환(강제 형변환)
//        System.out.println(p);



        //System.out.println((int) (Math.random() * 6) + 1);

//        for (int i = 0; i < 10; i++) {
//            int dice = (int)((Math.random()*6)+1); //0 ~ 9.9999999999999999
//            System.out.println(dice);
//
//        }

        // 4 ~ 15 사이의 정수 난수 발생
        //int random1 =  (int)((Math.random()*12)+4);

        for (int i = 0; i < 1000; i++) {
            int random1 = (int)((Math.random()*12)+4);
            //System.out.println(random1);
            if (random1 < 4 || random1 > 15) {
                throw new RuntimeException("범위 이외의 숫자가 발생했습니다.");
            }

        }

        // 반드시 아래 숫자로만 난수 발생
        // 600, 700, 800, 900, 1000, 1100, 1200, 1300~2300

        for (int i = 0; i < 10; i++) {
            int random2 = (int)(Math.random()*18+6)*1000;
            //System.out.println(random2);
            if (random2 < 600 || random2 > 2300 || random2 % 100 != 0) {
                throw new RuntimeException("범위 이외의 숫자가 발생했습니다.");
            }
        }
    }
}
