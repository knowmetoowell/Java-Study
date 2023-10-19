package method;

import java.util.Scanner;

public class MethodTest3 {

    public static void main(String[] args) {
        print(1);
        print(2, 3);
        print(4, 5, 6);
        print(123,535,25,3,45,1314,13445,6,4,25235,6,76746,446,2,23,4,5,6235,235,46,1);
    }

    private static void print(int... i) {
        for (int j = 0; j < i.length; j++) {
            //System.out.print(i[j]);
        }
        for (int j : i) {
            System.out.print(j+" ");
        }
        System.out.println();
    }
/*
    private static void print(int i, int j) {
        System.out.println(i + ", " + j);
    }
    private static void print(int i, int j, int k) {
        System.out.println(i + ", " + j + ", " + k);
    }

    private static void print(int i) {
        System.out.println(i);
    }

 */
}
