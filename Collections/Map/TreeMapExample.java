package Collections.Map;
import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();

        // Insertion
        treeMap.put("Alice", 25);
        treeMap.put("Bob", 30);
        treeMap.put("Charlie", 28);

        // Retrieval
        System.out.println("Age of Bob: " + treeMap.get("Bob"));

        // Deletion
        treeMap.remove("Alice");

        // ContainsKey
        if (treeMap.containsKey("Charlie")) {
            System.out.println("Charlie is in the map.");
        }
    }
}
