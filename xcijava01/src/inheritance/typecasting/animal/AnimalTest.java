package inheritance.typecasting.animal;

public class AnimalTest {
    public static void main(String[] args) {
//        Animal a = new Bird(); // 새를 보고 동물이다!
//        System.out.println(a);
//        Bird b = (Bird) a; // 동물중에서 새야~
//        System.out.println(b);
//        Condor c = (Condor) b; // 새를 보고 콘도르다! 라고 하면 아닐수도 있음(컴파일 오류는 안나고 실행시 ClassCastException 발생)
//        System.out.println(c);

//        Animal a = new Condor(); // 콘도르를 보고 동물이다!
//        System.out.println(a);
//        Bird b = (Bird) a; // 동물중에서 새야~
//        System.out.println(b);
//        Condor c = (Condor) b; // 새를 보고 콘도르다!
//        System.out.println(c);
//        //BlackVulture d = (BlackVulture) c; // 콘도르를 보고 블랙벌쳐다! 라고 하면 안된다~
//        if (c instanceof BlackVulture) { // 형변환 되는지 본다
//            BlackVulture d = (BlackVulture) c;
//            System.out.println(d);
//        } else { // 안되네
//            System.out.println("downcasting 불가");
//        }


        Cat c = new Cat();
        System.out.println(c);

        Animal a = c;
        System.out.println(a);


        Bird b = (Bird) a;
        System.out.println(b);

    }
}
