package control;

public class ForTest2 {
    public static void main(String[] args) {

        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            cnt += i + 1;
        }
        System.out.println(cnt);

        int b = gauss(11);
        System.out.println(b);

        int cnt2 = 0;
//        for (int i = 1; i < 1001 u

        for (int i = 3; i < 1001; i+=3) {
            cnt2 += i;
        }
        System.out.println(cnt2);
    }

    public static int gauss(int a){

        int result; // 결과물을 담을 변수

        result = (1+a)*(a/2); // 맨앞과 맨끝 정수의 합을 구하는 식

        if(a%2!=0){ // 만약 정수의 개수가 홀수라면 남은 1개의 홀수를 더하는 선택문
            result += (a+1)/2;
        }

        return result;
    }
}
