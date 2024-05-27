package OOPS;

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }

    Animal() {
        System.out.println("Animal constructor called.");
    }
}

class Cat extends Animal {
    void eat() {
        super.eat(); // Calls the superclass method
        System.out.println("The dog eats dog food.");
    }
}

class Dog extends Animal {
    Dog() {
        super(); // Calls the superclass constructor
        System.out.println("Dog constructor called.");
    }
}

public class Super {
    public static void main(String[] args) {
        Dog d = new Dog(); // Prints both constructors messages
    }
}

/*
 $ Super Keyword:
    @ The super keyword in Java is used to refer to the immediate parent class object.
    @ Use super.methodName() to call a method from the superclass.
    @ Use super() to call the superclass constructor.
    @ The "super keyword to call constructors of the Superclass must be used 
        within the constructor of the subclass. It cannot be used outside of the constructor.
    @ It should be 1st statement in the subclass constructor.
    @ super cannot be used in static context.
    @ super is not required to call a superclass method, 
        while it is possible to use super keyword to call a method in parent class. 
        If a method is not overridden in the subclass, 
        then calling without super invoke the parent's class.
 */