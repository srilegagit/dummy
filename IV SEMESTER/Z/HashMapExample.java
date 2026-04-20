package DataStructures;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        // 1. Creating HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // 2. put() – Insert key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");
        map.put(4, "Mango");

        System.out.println("Initial HashMap: " + map);

        // 3. get() – Retrieve value using key
        System.out.println("Value for key 2: " + map.get(2));

        // 4. containsKey() – Check if key exists
        System.out.println("Contains key 3? " + map.containsKey(3));

        // 5. containsValue() – Check if value exists
        System.out.println("Contains value 'Apple'? " + map.containsValue("Apple"));

        // 6. size() – Number of entries
        System.out.println("Size: " + map.size());

        // 7. remove() – Remove element using key
        map.remove(2);
        System.out.println("After removing key 2: " + map);

        // 8. replace() – Replace value of a key
        map.replace(3, "Pineapple");
        System.out.println("After replace: " + map);

        // 9. Iterating using entrySet()
        System.out.println("Iterating using entrySet:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 10. keySet() – Get all keys
        System.out.println("Keys: " + map.keySet());

        // 11. values() – Get all values
        System.out.println("Values: " + map.values());

        // 12. putIfAbsent() – Add only if key not present
        map.putIfAbsent(5, "Grapes");
        System.out.println("After putIfAbsent: " + map);

        // 13. clear() – Remove all entries
        map.clear();
        System.out.println("After clear(): " + map);

        // 14. isEmpty()
        System.out.println("Is map empty? " + map.isEmpty());
    }
}