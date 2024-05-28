package Collections.Set;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        // Adding elements
        set.add(5);
        set.add(2);
        set.add(8);
        set.add(5); // Duplicate, won't be added

        // Removing element
        set.remove(2);

        // Checking if element exists
        if (set.contains(5)) {
            System.out.println("5 is in the set");
        }

        // Iterating through the set
        for (Integer item : set) {
            System.out.println(item);
        }
    }
}
