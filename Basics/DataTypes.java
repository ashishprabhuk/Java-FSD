package Basics;

public class DataTypes {
    public static void main(String[] args) {
        // Primitive Data Types
        byte b = 127; // 8-bit signed integer
        short s = 32767; // 16-bit signed integer
        int i = 2147483647; // 32-bit signed integer
        long l = 9223372036854775807L; // 64-bit signed integer
        float f = 3.4028235E38f; // 32-bit floating point
        double d = 1.7976931348623157E308; // 64-bit floating point
        char c = 'A'; // 16-bit Unicode character
        boolean bool = true; // true or false

        // Reference Data Types
        String str = "Hello World"; // sequence of characters
        int[] arr = {1, 2, 3, 4, 5}; // array of integers
        int[][] mat = {{1, 2}, {3, 4}}; // 2D array of integers

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
        System.out.println("String: " + str);
        System.out.println("Array: " + arr[0]);
        System.out.println("2D Array: " + mat[0][0]);
    }
}
