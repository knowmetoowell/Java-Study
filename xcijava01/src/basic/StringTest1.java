package basic;

public class StringTest1 {
    public static void main(String[] args) {

        String str = "z"; // String은 immutable



        StringBuffer sb = new StringBuffer("실수란 "); //버퍼는 동기화를 보장하여 멀티쓰레드에 ㄱㄱ
        System.out.println(sb.length() + " : " + sb.capacity());
        sb.append("신을 용서하는 ");
        System.out.println(sb.length() + " : " + sb.capacity());
        sb.append("인간의 행위이다");
        System.out.println(sb.length() + " : " + sb.capacity());
        sb.append("~!");
        System.out.println(sb.length() + " : " + sb.capacity());

        StringBuilder sb2 = new StringBuilder("실수란 "); //빌더는 동기화를 보장하지 않아 멀티쓰레드에 적합하지 않으나 더 빠름
        System.out.println(sb2.length() + " : " + sb2.capacity());
        sb2.append("신을 용서하는 ");
        System.out.println(sb2.length() + " : " + sb2.capacity());
        sb2.append("인간의 행위이다");
        System.out.println(sb2.length() + " : " + sb2.capacity());
        sb2.append("~!");
        System.out.println(sb2.length() + " : " + sb2.capacity());

        String str1 = "안녕" + "하세요" + "!!";
        System.out.println(str1);

        String str2 = "반갑";
        str2 += "습니다";
        str2 += "!";
        System.out.println(str2);

        String str3 = "안녕" + 1;
        String str4 = "안녕" + String.valueOf(1);
        String str5 = "안녕" + "1";
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);

        System.out.println(1 + "ㅎㅇ");
        System.out.println(1 + "ㅎㅇ" + 2);
        System.out.println("안녕" + 1 + 2);
        System.out.println(1+2+"안녕");
    }




}
