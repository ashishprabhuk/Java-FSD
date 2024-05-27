package OOPS.Abstractions;

abstract class Animal {
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Abstract method (no implementation)
    abstract void makeSound();

    // Concrete method
    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // Implementation of the abstract method
    void makeSound() {
        System.out.println(name + " says: Woof Woof");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.makeSound(); // Output: Buddy says: Woof Woof
        dog.sleep();     // Output: Buddy is sleeping.
    }
}


/*

$Abstraction:
    @ It is a process of hiding the implementation details and 
        showing only functionality to the user. 
    @ Abstraction allows you to focus on what the object does instead of how it does it.

$Abstract Class:
    @ An abstract class in Java is a class that cannot be initiated by itself 
        and is meant to be subclassed by another classes to use its props. 
    @It can contain both abstract methods (methods without implementation) and 
        concrete methods (methods with implementation). 
        
    #Here are some key points:
    @ Abstract Methods: Methods that are declared without an implementation. 
        Subclasses are required to provide implementations for these methods.
    @ Concrete Methods: Methods that are declared with an implementation. 
        Subclasses can inherit or override these methods.
    @ Constructors: Abstract classes can have constructors, 
        which are called when a concrete subclass is instantiated.
    @ Instance Variables and Constants: Abstract classes can have fields 
        (both instance variables and constants).

$Note:
    @ A final method cannot be abstract itself.
    @ An abstract class can be created without any abstract methods.
    @ An instance of an abstract class cannot be created.
    @ Constructors are allowed.
    @ We can define static methods in abstract class.
    @ Constructors in abstract class can be used only by concrete subclass
        when they are initialed.
    @ abstract class provides data hiding in Java.
    @ abstract class is faster than interfaces.
    @ A subclass must override all abstract methods of an abstract class. 
        However, if the subclass is declared abstract, it's not mandatory 
        to override abstract method.

 */