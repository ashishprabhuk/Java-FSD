package Collections.List;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        System.out.println("Initial Stack: " + stack);

        // Popping elements from the stack
        String element = stack.pop();
        System.out.println("Popped Element: " + element);
        System.out.println("Stack After Pop: " + stack);

        // Peeking the top element
        String topElement = stack.peek();
        System.out.println("Top Element: " + topElement);

        // Checking if stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is Stack Empty? " + isEmpty);

        // Stack size
        System.out.println("Stack Size: " + stack.size());
    }
}

/*

$ Stack:
    @ Extends Vector to implement a LIFO (last-in, first-out) stack.

 */