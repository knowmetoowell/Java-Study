package inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "이상원";
        h.age = 28;
        h.eat();
        h.sleep();

        Student s = new Student();
        s.name = "이상투";
        s.age = 55;
        s.stdId = 1424;
        s.eat(); s.sleep();
        s.goToSchool();

        Worker w = new Worker();
        w.name = "이상쓰리";
        w.age = 134;
        w.sleep(); w.eat();
        w.goToWork();


    }
}

class Human {
    String name;
    int age;

    void eat() {

    }

    void sleep() {
    }
}

class Student extends Human {
    int stdId;

    void goToSchool() {
    }

}

class Worker extends Human {
    int workerId;

    void goToWork() {
    }
}