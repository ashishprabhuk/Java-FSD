package OOPS;

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // method inherited from Animal
        d.bark(); // method of Dog class
    }
}



/*
$Inheritance:
    @ Inheritance is a fundamental concept in object-oriented programming (OOP). 
        It allows a class (subclass or derived class) 
        to inherit properties and behaviors (fields and methods) 
        from another class (superclass or base class).

$ Superclasses and Subclasses:
    @ Superclass: The class whose properties and methods are inherited.
    @ Subclass: The class that inherits properties and methods from another class.
        The subclass inherits all the non-private fields and methods of the superclass.
        But cannot access private members of the superclass directly in the subclass.

$Types of Inheritance:
    @ Single Inheritance: A class inherits from one superclass.
    @ Multilevel Inheritance: A class is derived from a class which is also derived from another class.
    @ Hierarchical Inheritance: Multiple classes inherit from one superclass.
    @ Hybrid Inheritance: A combination of two or more types of inheritance. 
        However, Java does not support multiple inheritance 
        (a class cannot inherit from more than one class directly) 
        to avoid complexity and ambiguity. 
        This can be achieved using interfaces.

$ Super Keyword:
*/