package control;

public class WhileTest2 {
    public static void main(String[] args) {
//        int num = 2;
//        int sum = 0;
//        while (num < 1000) {
//            num += 1;
//            if (num % 3 == 0) {
//                sum += num;
//            }
//        }
//        System.out.println(sum);

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < 2) {
            i += 1;
            while (j < 9) {
                int c = 0;
                while (k < 4) {

                    if (i == 1) {
                        c = k+2;
                    }
                    else{
                        c = k+6;
                    }
                    System.out.print(c + "*"+ (j+1) + "=" + (c * (j+1)) + "\t");
                    k += 1;
                }
                System.out.println();
                j+=1;
                k = 0;
            }
            j =0;
            System.out.println();
        }

    }


}
