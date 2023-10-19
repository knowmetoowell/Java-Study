package inheritance.dimension.third;

public class Point2D {
    int x;
    int y;

    public Point2D() {
        this(1, 2); // 생성자에서 생성자 호출, 가장 첫줄에 와야함
        System.out.println("()실행");
    }

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("(x,y)실행");
    }
}
