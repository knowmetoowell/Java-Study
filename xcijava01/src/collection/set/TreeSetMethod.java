package collection.set;

import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetMethod {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 50; i > 0; i-=2) {
            treeSet.add(i);
        }
        System.out.println("treeSet = " + treeSet);
        // 1. first
        System.out.println("treeSet.first() = " + treeSet.first());
        // 2. last
        System.out.println("treeSet.last() = " + treeSet.last());
        // 3. lower
        System.out.println("treeSet.lower(26) = " + treeSet.lower(26));
        // 4. higher
        System.out.println("treeSet.higher(26) = " + treeSet.higher(26));
        // 5. floor
        System.out.println("treeSet.floor(25) = " + treeSet.floor(25));
        System.out.println("treeSet.floor(26) = " + treeSet.floor(26));
        // 6. ceiling
        System.out.println("treeSet.ceiling(25) = " + treeSet.ceiling(25));
        System.out.println("treeSet.ceiling(26) = " + treeSet.ceiling(26));
        System.out.println();

        //7. pollFirst
        int treeSetSize = treeSet.size();
        System.out.println("treeSetSize = " + treeSetSize);
        for (int i = 0; i < treeSetSize; i++) {
            System.out.print(treeSet.pollFirst() + " ");
        }

        System.out.println();
        System.out.println("treeSet.size() = " + treeSet.size());

        // 8. pollLast
        for (int i = 50; i > 0; i-=2) {
            treeSet.add(i);
        }
        treeSetSize = treeSet.size();
        for (int i = 0; i < treeSetSize; i++) {
            System.out.print(treeSet.pollLast() + " ");
        }
        System.out.println();
        System.out.println("treeSet.size() = " + treeSet.size());

        // 9. SortedSet<E> headSet
        for (int i = 50; i > 0; i-=2) {
            treeSet.add(i);
        }
        SortedSet<Integer> sSet = treeSet.headSet(20);
        System.out.println("sSet = " + sSet);

        // 10. NavigableSet<E> headSet
        NavigableSet<Integer> nSet = treeSet.headSet(20, true);
        System.out.println("nSet = " + nSet);

        nSet = treeSet.headSet(20, false);
        System.out.println("nSet = " + nSet);

        // 11. SortedSet<E> tailSet
        sSet = treeSet.tailSet(20);
        System.out.println("sSet = " + sSet);

        // 12. NavigableSet<E> tailSet
        nSet = treeSet.tailSet(20, true);
        System.out.println("nSet = " + nSet);
        nSet = treeSet.tailSet(20, false);
        System.out.println("nSet = " + nSet);


    }
}
