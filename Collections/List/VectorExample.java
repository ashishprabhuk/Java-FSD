package Collections.List;
import java.util.Vector;
import java.util.List;

public class VectorExample {
    public static void main(String[] args) {
        List<String> fruits = new Vector<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Initial Vector: " + fruits);

        // Accessing elements
        String fruit = fruits.get(1);
        System.out.println("Element at index 1: " + fruit);

        // Updating elements
        fruits.set(1, "Blueberry");
        System.out.println("Updated Vector: " + fruits);

        // Removing elements
        fruits.remove("Cherry");
        System.out.println("After Removal: " + fruits);

        // Vector size
        System.out.println("Vector Size: " + fruits.size());
    }
}


/*

$ Vector:
    @ Vector is similar to ArrayList but is synchronized. 
        This means that Vector is thread-safe, 
        but it also means that it has more overhead due to synchronization.

 */