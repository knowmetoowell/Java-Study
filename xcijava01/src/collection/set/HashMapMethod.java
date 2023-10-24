package collection.set;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMethod {
    public static void main(String[] args) {
        Map<Integer, String> hMap1 = new HashMap<>();
        // 1. put
        hMap1.put(2, "나다라");
        hMap1.put(1, "가나다");
        hMap1.put(3, "다라마");
        System.out.println("hMap1 = " + hMap1);

        // 2. putAll
        Map<Integer, String> hMap2 = new HashMap<>();
        hMap2.putAll(hMap1);
        System.out.println("hMap2 = " + hMap2);

        // 3. replace
        hMap2.replace(1, "가가가");
        hMap2.replace(4, "wefkm"); // 동작x
        System.out.println("hMap2 = " + hMap2);

        //5. get
        System.out.println("hMap2.get(1) = " + hMap2.get(1));
        System.out.println("hMap2.get(2) = " + hMap2.get(2));
        System.out.println("hMap2.get(3) = " + hMap2.get(3));

        // 6. containKey
        System.out.println("hMap2.containsKey(1) = " + hMap2.containsKey(1));
        System.out.println("hMap2.containsKey(5) = " + hMap2.containsKey(5));

        // 7. containValue
        System.out.println("hMap2.containsValue(가가가) = " + hMap2.containsValue("가가가"));
        System.out.println("hMap2.containsValue(다다다) = " + hMap2.containsValue("다다다"));

        // 8. keySet
        Set<Integer> keySet = hMap2.keySet();
        System.out.println("keySet = " + keySet);
        //9. entrySet
        System.out.println("hMap2.entrySet() = " + hMap2.entrySet());

        //10. size
        System.out.println("hMap2.size() = " + hMap2.size());

        // 11. remove
        hMap2.remove(1);
        hMap2.remove(4);
        System.out.println("hMap2 = " + hMap2);

        // 12. clear
        hMap2.clear();
        System.out.println("hMap2(cleared) = " + hMap2);
    }
}
