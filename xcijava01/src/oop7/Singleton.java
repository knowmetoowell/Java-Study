package oop7;

public class Singleton {

    // 2. 자기자신을 참조하는 변수를 static으로 선언
    public static Singleton singleton;
    int score;

    // 1. 생성자를 프라이빗으로 만들어버리기~
    private Singleton() {

    }
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
