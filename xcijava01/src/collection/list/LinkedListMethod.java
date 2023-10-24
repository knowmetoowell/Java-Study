package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMethod {
    public static void main(String[] args) {
        List<Integer> aList1 = new LinkedList<>();
        // 1. add(E element)
        aList1.add(3);
        aList1.add(4);
        aList1.add(5);
        System.out.println("aList1 = " + aList1);
        // 2. add(int index, E element)
        aList1.add(1, 6);
        System.out.println("aList1 = " + aList1);
        // 3. addAll(다른 리스트)
        List<Integer> aList2 = new LinkedList<>();
        aList2.add(2);
        aList2.add(5);
        aList2.addAll(aList1);
        System.out.println("aList2 = " + aList2);

        // 4. addAll(int index, 다른 리스트)
        List<Integer> aList3 = new LinkedList<>();
        aList3.add(1);
        aList3.add(2);
        aList3.addAll(1, aList1);
        System.out.println("aList3 = " + aList3);
        // 5. set(int index, E element)
        aList3.set(1, 5);
        aList3.set(3, 6);
        //aList3.set(7, 10); // IndexOutOfBoundsEx
        System.out.println("aList3 = " + aList3);
        // 6. remove(int index)
        aList3.remove(1);
        System.out.println("aList3 = " + aList3);
        // 7. remove(Object o)
        //aList3.remove(new Integer(2)); ??
        // 8 . clear
        aList3.clear();
        System.out.println("aList3 = " + aList3);
        // 9. isEmpty
        System.out.println("aList3.isEmpty() = " + aList3.isEmpty());
        // 10. size
        System.out.println("aList3.size() = " + aList3.size());
        // 11. get
        aList3.add(1);
        aList3.add(2);
        System.out.println("aList3.get(0) = " + aList3.get(0));
        System.out.println("aList3.get(1) = " + aList3.get(1));
        //12. toArray  List -> Array
        Object[] o = aList3.toArray();
        System.out.println("Arrays.toString(o) = " + Arrays.toString(o));

    }
}
