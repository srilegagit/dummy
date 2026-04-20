package DataStructures;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {

        // 1. Creating HashSet
        HashSet<String> set = new HashSet<>();

        // 2. add() – Add elements
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Mango");
        set.add("Apple"); // Duplicate (will not be added)

        System.out.println("Initial HashSet: " + set);

        // 3. size() – Number of elements
        System.out.println("Size: " + set.size());

        // 4. contains() – Check if element exists
        System.out.println("Contains Mango? " + set.contains("Mango"));

        // 5. remove() – Remove element
        set.remove("Banana");
        System.out.println("After removing Banana: " + set);

        // 6. isEmpty() – Check if set is empty
        System.out.println("Is set empty? " + set.isEmpty());

        // 7. Iterating using for-each
        System.out.println("Using for-each loop:");
        for(String fruit : set){
            System.out.println(fruit);
        }

        // 8. Iterating using Iterator
        System.out.println("Using Iterator:");
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // 9. addAll() – Add another collection
        HashSet<String> newSet = new HashSet<>();
        newSet.add("Grapes");
        newSet.add("Pineapple");

        set.addAll(newSet);
        System.out.println("After addAll(): " + set);

        // 10. removeAll() – Remove multiple elements
        set.removeAll(newSet);
        System.out.println("After removeAll(): " + set);

        // 11. clear() – Remove all elements
        set.clear();
        System.out.println("After clear(): " + set);

        // 12. isEmpty() again
        System.out.println("Is set empty now? " + set.isEmpty());
    }
}