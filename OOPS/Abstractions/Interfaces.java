package OOPS.Abstractions;

// Interface 
interface Shape {
    // Abstract method (no implementation)
    double calculateArea();
    double calculatePerimeter();

    // Default method (with implementation)
    default void defaultMethod() {
        System.out.println("This is a default method in the Shape interface");
    }

    // Static method (with implementation)
    static void staticMethod() {
        System.out.println("This is a static method in the Shape interface");
    }

    int CONSTNUM = 21;
}

// Implement the interface in a class
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Implement the interface in another class
class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Use the classes implementing the interface
public class Interfaces {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());

        Shape rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());
    }
}


/*
$Interfaces:
    @ An interface is a blueprint of a class and it is a mechanism to achieve abstraction.
    @ It defines a set of abstract methods (without body).
    @ Interfaces cannot contain instance fields or constructors. 
    @ They are used to specify a set of methods that a class must implement

$Abstract Methods: 
    @ Methods in an interface are abstract by default, meaning they do not have a body 
        and must be implemented by a class that implements the interface.
    @ Default Methods: These are methods within the interface that have a default implementation.
        They allow interfaces to evolve without breaking existing code.
    @ Static Methods: These methods belong to the interface 
        and not to the instance of the implementing class. 
        They can be called directly on the interface.
    @ Constants: Fields in an interface are implicitly public, static, and final.
    @ Multiple Inheritance of Type: A class in Java can implement multiple interfaces,
        which allows for a form of multiple inheritance. 
        This is crucial for designing flexible and extensible systems.
 */
