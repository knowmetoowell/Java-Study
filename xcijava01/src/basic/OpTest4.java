package basic;

public class OpTest4 {
    public static void main(String[] args) {

        int a = 10, b = 4;

        System.out.println(a & b);

        int i = 10;
        int j = 5;
        int temp;
        System.out.println(i + " , " +j);
        temp = i;
        i = j;
        j = temp;

        System.out.println(i + " , " +j);
        i ^= j;
        j ^= i;
        i ^= j;
        System.out.println(i + " , " +j);

        int n = 10;
        System.out.println(n>>2);
        System.out.println(n>>>2);
        System.out.println(n<<2);

    }
}
