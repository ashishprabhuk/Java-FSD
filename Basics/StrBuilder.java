package Basics;

public class StrBuilder {
    public static void main(String[] args) {
        // StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("StringBuilder: " + sb);

        // Append
        sb.append(" World");
        System.out.println("Append: " + sb);

        // Insert
        sb.insert(5, "Java ");
        System.out.println("Insert: " + sb);

        // Delete
        sb.delete(5, 10);
        System.out.println("Delete: " + sb);

        // Reverse
        sb.reverse();
        System.out.println("Reverse: " + sb);

        // Length
        System.out.println("Length: " + sb.length());

        // Capacity
        System.out.println("Capacity: " + sb.capacity());

        // Replace
        sb.replace(5, 10, "Java");
        System.out.println("Replace: " + sb);

        // Substring
        System.out.println("Substring: " + sb.substring(5, 9));

        // Trim
        StringBuilder sb2 = new StringBuilder("   Hello World   ");
        System.out.println("Trim: " + sb2.toString().trim());
    }
}
