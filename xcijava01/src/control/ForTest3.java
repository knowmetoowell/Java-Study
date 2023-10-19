package control;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ForTest3 {
    public static void main(String[] args) {

        String[][] a = new String[20][4];
        //for

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = "";
                if (i < 9) {
                    if(j == 0) {
                        a[i][j] += "2 * " + (i+1) + " = ";
                    }
                    else if(j == 1) {
                        a[i][j] += "3 * " + (i+1) + " = ";
                    }
                    else if(j == 2) {
                        a[i][j] += "4 * " + (i+1) + " = ";
                    }
                    else if(j == 3) {
                        a[i][j] += "5 * " + (i+1) + " = ";
                    }
                } else if (i > 10) {
                    if(j == 0) {
                        a[i][j] += "6 * " + (i-10) + " = ";
                    }
                    else if(j == 1) {
                        a[i][j] += "7 * " + (i-10) + " = ";
                    }
                    else if(j == 2) {
                        a[i][j] += "8 * " + (i-10) + " = ";
                    }
                    else if(j == 3) {
                        a[i][j] += "9 * " + (i-10) + " = ";
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(a));


//        for (int i = 2; i < 10; i++) {
//            Queue<Integer> que = que();
//            while (!que.isEmpty()){
//                int num = que.poll();
//                System.out.println(i + "*" + num + " = " + (i * num) + "\t");
//            }
//
//        }
    }

    public static Queue<Integer> que() {
        Queue<Integer> que = new LinkedList<>();
        for (int i = 1; i < 10; i++) {
            que.add(i);
        }
        return que;
    }
}
