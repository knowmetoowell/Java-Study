package exception;


import java.io.InputStream;

class MyResource implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("자원반납");
    }
}
public class TryWithResource {

    public static void main(String[] args) {

        // 리소스 자동해제
        try (MyResource m = new MyResource()) {
            // AutoCloseable, closeable 을 구현하고있는 클래스를
            // try 괄호부분에 넣으면 try문이 끝나거나 예외가 발생하는 시점에 자동으로 자원 반납
            System.out.println("try 부분");
            if (true) throw new RuntimeException("강제 예외 발생");
            System.out.println("fff");
        } catch (Exception e) {
            System.out.println("catch 부분: " + e.getMessage());
        }
        System.out.println("종료");
        // -----------------------------------------------------------------
        // 리소스 수동해제
        MyResource mr = null;
        try {
            mr = new MyResource();
            if (true) throw new RuntimeException("강제 예외 발생");
            System.out.println("fff");
        } catch (Exception e) {
            System.out.println("catch 부분: " + e.getMessage());
        } finally {
            //리소스 해제
            if (mr != null) {
                try {
                    mr.close();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("종료");
        }

    }
}
