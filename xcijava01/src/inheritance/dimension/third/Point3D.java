package inheritance.dimension.third;

public class Point3D extends Point2D {
    int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
        System.out.println("(x,y,z)실행");
    }

    public Point3D() {
        this(10, 20, 30);
        System.out.println("()실행");
    }
}
