package generic;


import lombok.Getter;
import lombok.Setter;

class A {
}

class B extends A {

}

class C extends B {

}


class D<T extends B> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

public class BoundedTypeGenericClass {
    public static void main(String[] args) {
        //D<A> d1 = new D<A>(); // 불가능
        D<B> d2 = new D<>();
        D<C> d3 = new D<>();
        D d4 = new D(); // D<B> d2 = new D<>(); 이거랑 같음

        d2.setT(new B());
        d2.setT(new C());
        //d3.set(new B());// C로 하니까 B로는 몬만든당
        d3.setT(new C());
        d4.setT(new B());
        d4.setT(new C());
    }



}
