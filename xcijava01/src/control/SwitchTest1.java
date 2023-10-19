package control;

public class SwitchTest1 {
    public static void main(String[] args) {
        int n = 3;
        switch (n) {
            case 1, 3:
                System.out.println("남");
                break;
            case 2, 4:
                System.out.println("여");
                break;
            default:
                throw new RuntimeException("에러~");
        }
    }


}
