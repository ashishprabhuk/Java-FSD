package OOPS.Polymorphism;

//# Method Overloading
class MathUtils {
    // Method with two int parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with three double parameters
    double add(double a, double b, double c) {
        return a + b + c;
    }

    // Method with two String parameters
    String add(String a, String b) {
        return a + b;
    }
}


public class MethodOverLoading {
    public static void main(String[] args) {
        //# Method Overloading
        MathUtils math = new MathUtils();
        System.out.println(math.add(1, 2)); // Calls the method with two int parameters
        System.out.println(math.add(1.1, 2.2, 3.3)); // Calls the method with three double parameters
        System.out.println(math.add("Ashish", "Prabhu")); // Calls the method with two String parameters
    }
}



/*

$ Polymorphism:
    @ Polymorphism means "many forms".
    @ Polymorphism allows us to perform a single action in different ways.

$ Compile-Time Polymorphism (Method Overloading):
    @ Method overloading occurs when multiple methods in the same class have the 
        same name but different parameters (different type, number, or both).

$ Run-Time Polymorphism (Method Overriding):
    @ Method overriding occurs when a subclass has a method with the 
        same name, return type, and parameters as a method in its superclass. 
    @ The method in the subclass is said to override the method in the superclass.

$Note:
    @ JVM decides which method to call when a method is invoked on an object.
    @ The access modifies of the method in the subclass cannot be more restrictive 
        than the access modifies of method in parent class.
    @ Eg -> if the method in parent class is public, 
        the method in the subclass must also be public.
    @ Subclass method cannot throw checked exception which is not thrown by parent class method.

*/