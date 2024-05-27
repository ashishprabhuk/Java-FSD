package OOPS.Polymorphism;

//# Method Overriding
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class MethodOverRiding {
    public static void main(String[] args) {
        //# Method Overriding
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myAnimal.makeSound(); // Calls Animal's makeSound method
        myDog.makeSound();    // Calls Dog's overridden makeSound method
        myCat.makeSound();    // Calls Cat's overridden makeSound method
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