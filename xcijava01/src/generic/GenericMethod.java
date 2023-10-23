package generic;


class GenericMethods {
    public <T> T method(T t) {
        return t;
    }
}
public class GenericMethod {
    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        String str1 = gm.<String>method("안녕하시오");
        String str2 = gm.method("안녕하시오");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }

}
