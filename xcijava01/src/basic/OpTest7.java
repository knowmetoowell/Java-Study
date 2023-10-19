package basic;

public class OpTest7 {
    public static void main(String[] args) {
        int a = 7;
        int t = ++a;
        //int tt = a++;
        System.out.println(a + ", " + t);
        //System.out.println(a + ", " + tt);

        int aa = 7;
        int tt = a++;
        System.out.println(aa + ", " + tt);

        int aaa = 7;
        int ttt = 4;
        ttt += aaa + 3;
        System.out.println(ttt);
    }
}
