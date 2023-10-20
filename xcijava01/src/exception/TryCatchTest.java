package exception;

public class TryCatchTest {
    public static void main(String[] args) {
        try {
            System.out.println(3 / 0);

        } catch (Exception e) {
            System.out.println("숫자는 0으로 못나눠~");
        }finally {
            System.out.println("프로그램 종료");
        }

        try {
            System.out.println(3 / 0);
            int num = Integer.parseInt("10aa");
        }
//        catch (Exception e) { Exception은 최상위 클래스임 멀티캐치에서 이걸 앞에써버리면 뒤에 캐치문으로 못들어가서 신택스에러~
//            System.out.println("0으로 못나눠~");
//        }
        catch (NumberFormatException e) {
            System.out.println("숫자로 바꿀수 없어용");
        } catch (Exception e) {
            System.out.println("0으로 못나눠~");
        } finally {
            System.out.println("프로그램 종료");
        }
    }

}

