package Basics;

public class Strings {
    public static void main(String[] args) {
        // String
        String str = "Hello World";
        System.out.println("String: " + str);

        // String Concatenation
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        // String Length
        System.out.println("Length: " + str.length());

        // String Comparison
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "World";
        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equals str3: " + str1.equals(str3));
        System.out.println("str1 equalsIgnoreCase str3: " + str1.equalsIgnoreCase(str3));

        // String Substring
        System.out.println("Substring: " + str.substring(6));

        // String Replace
        System.out.println("Replace: " + str.replace("World", "Java"));

        // String Uppercase and Lowercase
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        // String Trim
        String str4 = "   Hello World   ";
        System.out.println("Trim: " + str4.trim());

        // String Split
        String str5 = "Ashish Prabhu";
        String[] arr = str5.split(" ");
        for (String s : arr) {
            System.out.println("Split: " + s);
        }

        // String Format
        String str6 = "Ashish";
        String str7 = "Prabhu";
        System.out.println(String.format("%s %s", str6, str7));
    }
}
