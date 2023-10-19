package basic;

public class OpTest11 {
    public static void main(String[] args) {
        int n = -12341;

        System.out.println(
                n == 1 || n ==3 ? "남자" :
                n == 2 || n ==4 ? "여자" : "에러");
        System.out.println(
                n < 0 ? "음수" :
                n > 0 ? "양수" : "양수도 음수도 아님");

        System.out.println(n % 2 == 0 ? "짝수" : "홀수");


    }
}
