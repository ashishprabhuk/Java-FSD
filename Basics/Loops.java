package Basics;

public class Loops {
    public static void main(String[] args) {
        int[] arr = {2,1,4,3};

        // For Loop
        for (int i = 0; i < 4; i++) {
            System.out.println("For Loop: " + arr[i]);
        }

        // While Loop
        int j = 0;
        while (j < 4) {
            System.out.println("While Loop: " + arr[j]);
            j++;
        }

        // Do-While Loop
        int k = 0;
        do {
            System.out.println("Do-While Loop: " + arr[k]);
            k++;
        } while (k < 4);

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;  // Exit the loop
            }
            if (i % 2 == 0) {
                continue;  // Skip the current iteration
            }
            if (i == 3) {
                return;  // Exit from the method, terminating the loop and the method
            }
            System.out.println("i: " + i);
        }
        System.out.println("This line will not be printed if i == 3"); // This line will be printed only if the loop completes without hitting the return statement.
    
    }
}
