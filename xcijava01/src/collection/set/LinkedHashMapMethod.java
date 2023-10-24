package collection.set;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapMethod {
    public static void main(String[] args) {
        Map<Integer, String> linkedHashMap1 = new LinkedHashMap<>();
        // 1. put
        linkedHashMap1.put(2, "나다라");
        linkedHashMap1.put(1, "가나다");
        linkedHashMap1.put(3, "다라마");
        System.out.println("linkedHashMap1 = " + linkedHashMap1);

        // 2. putAll
        Map<Integer, String> linkedHashMap2 = new LinkedHashMap<>();
        linkedHashMap2.putAll(linkedHashMap1);
        System.out.println("linkedHashMap2 = " + linkedHashMap2);

        // 3. replace
        linkedHashMap2.replace(1, "가가가");
        linkedHashMap2.replace(4, "wefkm"); // 동작x
        System.out.println("linkedHashMap2 = " + linkedHashMap2);

        //5. get
        System.out.println("linkedHashMap2.get(1) = " + linkedHashMap2.get(1));
        System.out.println("linkedHashMap2.get(2) = " + linkedHashMap2.get(2));
        System.out.println("linkedHashMap2.get(3) = " + linkedHashMap2.get(3));

        // 6. containKey
        System.out.println("linkedHashMap2.containsKey(1) = " + linkedHashMap2.containsKey(1));
        System.out.println("linkedHashMap2.containsKey(5) = " + linkedHashMap2.containsKey(5));

        // 7. containValue
        System.out.println("linkedHashMap2.containsValue(가가가) = " + linkedHashMap2.containsValue("가가가"));
        System.out.println("linkedHashMap2.containsValue(다다다) = " + linkedHashMap2.containsValue("다다다"));

        // 8. keySet
        Set<Integer> keySet = linkedHashMap2.keySet();
        System.out.println("keySet = " + keySet);
        //9. entrySet
        System.out.println("linkedHashMap2.entrySet() = " + linkedHashMap2.entrySet());

        //10. size
        System.out.println("linkedHashMap2.size() = " + linkedHashMap2.size());

        // 11. remove
        linkedHashMap2.remove(1);
        linkedHashMap2.remove(4);
        System.out.println("linkedHashMap2 = " + linkedHashMap2);

        // 12. clear
        linkedHashMap2.clear();
        System.out.println("linkedHashMap2(cleared) = " + linkedHashMap2);
    }
}
