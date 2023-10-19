package oop2;

public class PointTest {
    public static void main(String[] args) {
        Point2D pt = new Point3D(); // upcasting : 자동형변환 (묵시적형변환)
        pt.x = 100;
        pt.y = 200;
//        pt.z = 300; // 서브클래스에서 만든 것들에는 접근 x
        Point3D pt2 = (Point3D) pt; //downcasting : 강제형변환(명시적형변환)
        pt2.z = 300;

        System.out.println(pt2.x);
        System.out.println(pt2.y);
        System.out.println(pt2.z);
    }
}
