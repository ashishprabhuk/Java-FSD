package Collections.Set;
import java.util.Set;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<Character> set = new LinkedHashSet<>();

        // Adding elements
        set.add('a');
        set.add('b');
        set.add('c');
        set.add('a'); // Duplicate, won't be added

        // Removing element
        set.remove('b');

        // Checking if element exists
        if (set.contains('a')) {
            System.out.println("a is in the set");
        }

        // Iterating through the set
        for (Character item : set) {
            System.out.println(item);
        }
    }
}

