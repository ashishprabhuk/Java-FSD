package Collections.Map;
import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();

        // Insertion
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 28);

        // Retrieval
        System.out.println("Age of Alice: " + hashMap.get("Alice"));

        // Deletion
        hashMap.remove("Bob");

        // ContainsKey
        if (hashMap.containsKey("Charlie")) {
            System.out.println("Charlie is in the map.");
        }
    }
}
