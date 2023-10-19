package CodingTestPrac;

public class SequenceSum {
    public static void main(String[] args) {

    }

    public static int[] solution(int[] sequence, int k) {
        int[] answer = {};
        int start = 0;
        int temp= 0;
        for (int i = sequence.length-1; i >= 0; i--) {
            //start += 1;
            temp += sequence[i];
        }


        for (int i = 0; i < sequence.length; i++) {
            int i1 = sequence[i];

        }

        return answer;
    }
}
