package array;

import java.util.Arrays;

public class ArrayTest1 {
    public static void main(String[] args) {
//        int[] n = new int[3];
//        n[0] = 100;
//        n[1] = 200;
//        n[2] = 300;

        int[] n = {100, 200, 300};
//        for (int i = 0; i < n.length; i++) {
//            System.out.println(n[i]);
//        }
//        System.out.println(Arrays.toString(n));

        for (int i : n) {
            System.out.println(i);
        }
    }
}