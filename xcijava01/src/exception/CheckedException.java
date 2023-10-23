package exception;

public class CheckedException {
    public static void main(String[] args) {


        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            throw new MyInterruptedException(e);
        }
//
//        Class cls = Class.forName("java.lang.Object");
//
//        InputStreamReader in = new InputStreamReader(System.in);
//        in.read();
//
//        FileInputStream fis = new FileInputStream("test.txt");
//
//        Human h = new Human();
//        Human h2 = (Human) h.clone(); //clone은 protected라 원래 Human에 못쓰긴함

    }
}
