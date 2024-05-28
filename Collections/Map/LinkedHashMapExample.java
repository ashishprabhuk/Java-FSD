package Collections.Map;
import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Insertion
        linkedHashMap.put("Alice", 25);
        linkedHashMap.put("Bob", 30);
        linkedHashMap.put("Charlie", 28);

        // Retrieval
        System.out.println("Age of Charlie: " + linkedHashMap.get("Charlie"));

        // Deletion
        linkedHashMap.remove("Charlie");

        // ContainsKey
        if (linkedHashMap.containsKey("Alice")) {
            System.out.println("Alice is in the map.");
        }
    }
}
