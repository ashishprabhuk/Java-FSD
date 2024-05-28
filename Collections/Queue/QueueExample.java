package Collections.Queue;

import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the Queue
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Orange");

        System.out.println("Queue: " + queue);

        // Removing elements from the Queue
        String removedElement = queue.remove();
        System.out.println("Removed Element: " + removedElement);
        System.out.println("Queue after removal: " + queue);

        // Peeking the head of the Queue
        String peekedElement = queue.peek();
        System.out.println("Peeked Element: " + peekedElement);
        System.out.println("Queue after peek: " + queue);
    }
}
