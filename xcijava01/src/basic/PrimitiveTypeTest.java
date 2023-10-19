package basic;

import java.math.BigDecimal;


public class PrimitiveTypeTest {
    public static void main(String[] args) {
        boolean a = false;
        System.out.println(a);

        byte b = 127;
        char c = '뷄';
        System.out.println("c = " + c);
        System.out.println(b);

        short s = 32767;
        System.out.println(s);


        int i = 2147483647;
        System.out.println(i+1);
        System.out.println(i+2);

        Long i2 = 2147483648L;

        System.out.println(i2);

        double d = 3.1415926535;
        System.out.println("d = " + d);
        float d2 = 3.1415926535f;

        System.out.println("d2 = " + d2);

        System.out.println(2 - 1.1);
        BigDecimal b1 = new BigDecimal(2 - 1.1);
        System.out.println("b1 = " + b1);
        BigDecimal b2 = new BigDecimal("2");
        BigDecimal b3 = new BigDecimal("1.1");
        System.out.println(b2.subtract(b3));

        final double PI = Math.PI;

        System.out.println("PI = " + PI);
    }
}
