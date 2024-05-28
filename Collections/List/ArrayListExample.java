package Collections.List;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Initial List: " + fruits);

        // Accessing elements
        String fruit = fruits.get(1);
        System.out.println("Element at index 1: " + fruit);

        // Updating elements
        fruits.set(1, "Blueberry");
        System.out.println("Updated List: " + fruits);

        // Removing elements
        fruits.remove("Cherry");
        System.out.println("After Removal: " + fruits);

        // List size
        System.out.println("List Size: " + fruits.size());
    }
}

/*
$ ArrayList:
    @ Performance:
        -> ArrayList provides fast random read access but slower insertions and 
        deletions in the middle.
        -> LinkedList provides faster insertions and deletions but slower random read access.
 */