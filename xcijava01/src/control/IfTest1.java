package control;


import java.util.Scanner;

public class IfTest1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("0~100사이의 점수를 입력하시오: ");
        int score = sc.nextInt();
        String name = score >= 90 ? "우등생" : "일반인";
        System.out.println(name);
        if (score >= 90) {
            System.out.println("A");
        }
        else if (score >= 80) {
            System.out.println("B");
        }
        else if (score >= 70) {
            System.out.println("C");
        }
        else if (score >= 60) {
            System.out.println("D");
        }
        else System.out.println("F");



    }
}
