package OOPS;

public class StaticKeyWord {
    public static int count = 0;

    public void increment() {
        count++;
    }
}

class Test {
    public static void main(String[] args) {
        StaticKeyWord obj1 = new StaticKeyWord();
        StaticKeyWord obj2 = new StaticKeyWord();
        
        obj1.increment();
        System.out.println(StaticKeyWord.count); // Output: 1
        
        obj2.increment();
        System.out.println(StaticKeyWord.count); // Output: 2
    }
}

/*
$ Static:
    @ The static keyword in Java is a fundamental part of the language, 
        providing a way to define class-level data and methods. 
    @ When a member (field or method) is declared static,
        it belongs to the class rather than instances of the class.
    @ Constants: Static fields are often used to define constants. 
        They are typically public static final.
    @ Singleton Pattern: Static fields can be used to implement the Singleton pattern.

    @ If we use "this" inside "static" members, then we get compile-time errors,
        because the compiler knows that "this" cannot be referenced to an instance
        that doesn't exist in a "static" context".
~       public class MyClass{
~           int value;
~           public static void method(){
~               int x =this.value; //! Compile-Time Error   
~           }
~       }        
*/