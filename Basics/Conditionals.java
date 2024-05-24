package Basics;

public class Conditionals {
    public static void main(String[] args) {
        boolean isTrue = true;
        boolean isFalse = false;

        if (isTrue && !isFalse) {
            System.out.println("Both conditions are true.");
        }
        if (isTrue || isFalse) {
            System.out.println("At least one condition is true.");
        }

        // If-Else If-Else
        int a = 21, b = 2;
        if (a < b) {
            System.out.println("a is less than b");
        } else if (a == b) {
            System.out.println("a is equal to b");
        } else {
            System.out.println("a is greater than b");
        }

        // Ternary Operator
        String result = (a < b) ? "a is less than b" : "a is greater than or equal to b";
        System.out.println(result);

        // Switch-Case
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
