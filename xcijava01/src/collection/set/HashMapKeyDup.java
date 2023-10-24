package collection.set;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class C {
    int data;

    public C(int data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(data);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof C) {
            this.data = ((C) obj).data;
            return true;
        }
        return false;
    }
}

public class HashMapKeyDup {
    public static void main(String[] args) {
        Map<C, String> hashMap = new HashMap<>();
        C c1 = new C(3);
        C c2 = new C(3);
        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));
        System.out.println(c1.hashCode() == c2.hashCode());
        hashMap.put(c1, "first");
        hashMap.put(c2, "second");
        System.out.println("hashMap.size() = " + hashMap.size());
    }
}
