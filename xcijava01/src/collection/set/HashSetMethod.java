package collection.set;

import java.util.*;

public class HashSetMethod {
    public static void main(String[] args) {
        Set<Integer> hSet1 = new HashSet<>();
        // 1. add(E element)
        hSet1.add(3);
        hSet1.add(4);
        hSet1.add(5);
        System.out.println("hSet1 = " + hSet1);
        // 2. addAll(다른 셋)
        Set<Integer> hSet2 = new HashSet<>();
        hSet2.add(2);
        hSet2.add(5);
        hSet2.addAll(hSet1);
        System.out.println("hSet2 = " + hSet2);

        // 4. addAll(int index, 다른 리스트)
        Set<Integer> hSet3 = new HashSet<>();
        hSet3.add(1);
        hSet3.add(2);
        // 6. remove(int index)
        hSet3.remove(1);
        System.out.println("hSet3 = " + hSet3);
        // 7. contains
        System.out.println("hSet3.contains(1) = " + hSet3.contains(2));
        System.out.println("hSet3.contains(19) = " + hSet3.contains(19));
        // 8 . clear
        hSet3.clear();
        System.out.println("hSet3(cleared) = " + hSet3);
        // 9. isEmpty
        System.out.println("hSet3.isEmpty() = " + hSet3.isEmpty());
        // 10. size
        System.out.println("hSet3.size() = " + hSet3.size());
        // iterator
        hSet3.add(1);
        hSet3.add(2);
        Iterator<Integer> iterator = hSet3.iterator();
        while (iterator.hasNext()) {
            System.out.println("iterator.next() = " + iterator.next());
        }
        //12. toArray  List -> Array

        Object[] o = hSet3.toArray();
        System.out.println("Arrays.toString(o) = " + Arrays.toString(o));

    }
}
