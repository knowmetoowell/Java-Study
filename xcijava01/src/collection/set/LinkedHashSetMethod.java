package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetMethod {
    public static void main(String[] args) {
        Set<String> linkedSet1 = new LinkedHashSet<>();
        linkedSet1.add("가");
        linkedSet1.add("나");
        linkedSet1.add("다");
        System.out.println("linkedSet1 = " + linkedSet1);

        Set<String> linkedSet2 = new LinkedHashSet<>();
        linkedSet2.add("나");
        linkedSet2.add("다");
        linkedSet2.addAll(linkedSet1);
        System.out.println("linkedSet2 = " + linkedSet2);

        linkedSet2.remove("나");
        System.out.println("linkedSet2 = " + linkedSet2);

        linkedSet2.clear();
        System.out.println("linkedSet2(cleared) = " + linkedSet2);

        System.out.println("linkedSet2.isEmpty() = " + linkedSet2.isEmpty());

        Set<String> linkedSet3 = new LinkedHashSet<>();
        linkedSet3.add("가");
        linkedSet3.add("나");
        linkedSet3.add("다");

        System.out.println("linkedSet3.contains(\"\") = " + linkedSet3.contains("가"));
        System.out.println("linkedSet3.contains(\"\") = " + linkedSet3.contains("라"));
        System.out.println("linkedSet3.size() = " + linkedSet3.size());

        Iterator<String> iterator = linkedSet3.iterator();
        while (iterator.hasNext()) {
            System.out.println("iterator.next() = " + iterator.next());
        }


    }
}
