package collection.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableMethod {
    public static void main(String[] args) {
        Map<Integer, String> hTable1 = new Hashtable<>();
        // 1. put
        hTable1.put(2, "나다라");
        hTable1.put(1, "가나다");
        hTable1.put(3, "다라마");
        System.out.println("hTable1 = " + hTable1);

        // 2. putAll
        Map<Integer, String> hTable2 = new Hashtable<>();
        hTable2.putAll(hTable1);
        System.out.println("hTable2 = " + hTable2);

        // 3. replace
        hTable2.replace(1, "가가가");
        hTable2.replace(4, "wefkm"); // 동작x
        System.out.println("hTable2 = " + hTable2);

        //5. get
        System.out.println("hTable2.get(1) = " + hTable2.get(1));
        System.out.println("hTable2.get(2) = " + hTable2.get(2));
        System.out.println("hTable2.get(3) = " + hTable2.get(3));

        // 6. containKey
        System.out.println("hTable2.containsKey(1) = " + hTable2.containsKey(1));
        System.out.println("hTable2.containsKey(5) = " + hTable2.containsKey(5));

        // 7. containValue
        System.out.println("hTable2.containsValue(가가가) = " + hTable2.containsValue("가가가"));
        System.out.println("hTable2.containsValue(다다다) = " + hTable2.containsValue("다다다"));

        // 8. keySet
        Set<Integer> keySet = hTable2.keySet();
        System.out.println("keySet = " + keySet);
        //9. entrySet
        System.out.println("hTable2.entrySet() = " + hTable2.entrySet());

        //10. size
        System.out.println("hTable2.size() = " + hTable2.size());

        // 11. remove
        hTable2.remove(1);
        hTable2.remove(4);
        System.out.println("hTable2 = " + hTable2);

        // 12. clear
        hTable2.clear();
        System.out.println("hTable2(cleared) = " + hTable2);
    }
}
