package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(a.length);
        a[1] = null;
        a[2] = null;
        System.out.println(a.length);
        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));
        System.out.println();

        List<Integer> al = new ArrayList<>();
        System.out.println(al.size());
        for (int i = 0; i < a.length; i++) {
            Integer integer = a[i];
            al.add(integer);

        }
        System.out.println(al.size());
        al.remove(1);
        al.remove(5);
        System.out.println(al.size());
        System.out.println(al);
    }
}
