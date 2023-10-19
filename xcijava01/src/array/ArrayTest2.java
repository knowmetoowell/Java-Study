package array;

import java.util.Arrays;

public class ArrayTest2 {
    public static void main(String[] args) {
        int[][] score = {
                {100, 90, 80, 70},
                {90, 80, 70, 60},
                {80, 70, 60, 50}
        };
        System.out.println("국어\t영어\t수학\t철학\t총점\t평균");
        for (int i = 0; i < score.length; i++) {
            int sum = 0;
            double avg = 0;
            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
                System.out.print(score[i][j]+"\t");
            }
            System.out.print(sum+"\t");
            avg = sum/score[i].length;
            System.out.print(avg);
            System.out.println();

        }

        for (int[] row : score) {
            int sum =0;
            double avg = 0;
            for (int val : row) {
                sum += val;
                System.out.print(val+"\t");
            }
            System.out.print(sum+"\t");
            avg = sum/row.length;
            System.out.print(avg);
            System.out.println();
        }



//
//        System.out.println(Arrays.toString(score));
//        System.out.println(Arrays.toString(score[0]));
//        System.out.println(Arrays.toString(score[1]));
//        System.out.println(Arrays.toString(score[2]));
    }
}
