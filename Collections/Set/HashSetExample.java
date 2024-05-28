package Collections.Set;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // Adding elements
        set.add("apple");
        set.add("banana");
        set.add("apple"); // Duplicate, won't be added

        // Removing element
        set.remove("banana");

        // Checking if element exists
        if (set.contains("apple")) {
            System.out.println("Apple is in the set");
        }

        // Iterating through the set
        for (String item : set) {
            System.out.println(item);
        }
    }
}

