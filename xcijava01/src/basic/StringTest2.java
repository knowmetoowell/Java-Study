package basic;

import java.util.Arrays;

public class StringTest2 {
    public static void main(String[] args) {

        String str1 = "Hello world";
        String str2 = "안녕하세요 반갑습니다 ";
        System.out.println(str1.length());

        System.out.println(str1.charAt(1));
        System.out.println(str2.charAt(1));

        System.out.println(str1.indexOf('a'));
        System.out.println(str1.indexOf('d'));
        System.out.println(str1.lastIndexOf('d'));
        System.out.println(str1.indexOf("world"));
        System.out.println(str1.lastIndexOf("world"));

        byte[] array1 = str1.getBytes();
        System.out.println(Arrays.toString(array1));

    }




}
