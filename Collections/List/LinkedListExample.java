package Collections.List;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> fruits = new LinkedList<>();

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
