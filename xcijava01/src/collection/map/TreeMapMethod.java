package collection.map;

import java.util.TreeMap;

public class TreeMapMethod {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        for (int i = 20; i > 0; i -=2) {
            treeMap.put(i, i + "번째 데이터");
        }
        System.out.println("treeMap = " + treeMap);

        // 1. firstKey
        System.out.println("treeMap.firstKey() = " + treeMap.firstKey());
        //2. firstEntry
        System.out.println("treeMap.firstEntry() = " + treeMap.firstEntry());
        //3. lastKey
        System.out.println("treeMap.lastKey() = " + treeMap.lastKey());
        //4. lastEntry
        System.out.println("treeMap.lastEntry() = " + treeMap.lastEntry());
        //5. lowerKey
        System.out.println("treeMap.lowerKey(11) = " + treeMap.lowerKey(11));
        System.out.println("treeMap.lowerKey(10) = " + treeMap.lowerKey(10));

        //6. higherKey
        System.out.println("treeMap.higherKey(11) = " + treeMap.higherKey(11));
        System.out.println("treeMap.higherKey(10) = " + treeMap.higherKey(10));

        //7. pollFirstEntry
        System.out.println("treeMap.pollFirstEntry() = " + treeMap.pollFirstEntry());
        System.out.println("treeMap = " + treeMap);

        //8. pollLastEntry
        System.out.println("treeMap.pollLastEntry() = " + treeMap.pollLastEntry());
        System.out.println("treeMap = " + treeMap);
        //9. headMap
        System.out.println("treeMap.headMap() = " + treeMap.headMap(8));
        //10. tailMap
        System.out.println("treeMap.tailMap(8) = " + treeMap.tailMap(8));
        //11. subMap
        System.out.println("treeMap.subMap(6,10) = " + treeMap.subMap(6, 10));
        //12. descendingKeySet
        System.out.println("treeMap.descendingKeySet() = " + treeMap.descendingKeySet());
        System.out.println("treeMap.descendingKeySet().descendingSet() = " + treeMap.descendingKeySet().descendingSet());
        System.out.println("treeMap.descendingMap() = " + treeMap.descendingMap());
    }
}
