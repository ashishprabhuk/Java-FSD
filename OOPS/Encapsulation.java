package OOPS;

class Person {
    // Private fields
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public getter for name
    public String getName() {
        return name;
    }

    // Public setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter for age
    public int getAge() {
        return age;
    }

    // Public setter for age with validation
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    // Method to display person details
    public void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        // Creating an instance of Person
        Person person = new Person("John Doe", 25);
        
        // Accessing and modifying the data using getters and setters
        System.out.println("Initial State:");
        person.displayPerson();

        // Modifying data
        person.setName("Jane Doe");
        person.setAge(30);

        System.out.println("Modified State:");
        person.displayPerson();

        // Attempting to set an invalid age
        person.setAge(-5); // This will not change the age and will print an error message
    }
}

/*

$Encapsulation:
    @ It is a process of wrapping code and data together into a single unit like capsule 
        to protect the data from unauthorized access.
    @ To make sure that "sensitive" data is hidden from users.

$ Data Hiding: 
    @ Encapsulation helps in hiding the internal state and behavior of an object. 
        Only the necessary aspects of an object are exposed to the outside world. 
        This is typically achieved using access modifiers.

$ Access Modifiers: 
    # Java provides four levels of access control for class members:
    @ private: The member is accessible only within the class it is declared.
    @ default (no modifier): The member is accessible only within the same package.
    @ protected: The member is accessible within the same package and by subclasses.
    @ public: The member is accessible from any other class.

$Getters and Setters: 
    @ To access and update private fields, public methods known as getters (for retrieving data)
        and setters (for modifying data) are used. 
        This allows for controlled access and validation before changing the state of an object.

 */