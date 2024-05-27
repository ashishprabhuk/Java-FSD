package OOPS;

public class Constructors {
    String fName;
    String lName;
    char gender;
    int age;

    // Constructors(){ //# default constructor
    //     fName="Ashish";
    //     lName="Prabhu";
    // }

    Constructors(int age){ //# Parameterized constructors
        this.age=age;
    }
    void getAge(){
        System.out.println("The Age is: " + this.age);
    }

//$ Constructor Overloading
    Constructors(String fName, String lName, char gender, int age ){
        //# constructors with all parameters passed
        this.fName = fName;
        this.lName = lName;
        this.gender = gender;
        this.age = age;
    }
    Constructors(String fName, String lName, char gender ){
        //# constructors with 3 parameters
        this(fName, lName, gender, 21); //* Constructor Calling -> call the 4 param constructor with age -> 21 */
    }
    Constructors(){ 
        //# constructor used when no params are specified
        fName = lName = "no-name";
        gender = 'O';
        age = 0; 
    }
    Constructors(char gender){ 
        //# constructor used when only one params specified
        this(); //* Constructor Calling -> calling default constructor from parameterized constructor  */
        this.gender = gender;
    }
    String getName(){
        return this.fName + " " + this.lName;
    }
    void getDetails(){
        System.out.println(this.fName + " " + this.lName + " " + this.gender + " " + this.age);
    }

}
class Construct{
    public static void main(String[] args) {
        Constructors c1 = new Constructors();
        Constructors c2 = new Constructors(21);
        Constructors c3 = new Constructors('M');
        Constructors c4 = new Constructors("Ashish","Prabhu",'M',21);

        System.out.println(c1.fName + " " + c1.lName);
        c2.getAge();
        System.out.println(c2.getName());
        c2.getDetails();
        c3.getDetails();
        c4.getDetails();
        c4.getAge();
        System.out.println(c4.getName());
    }
}

/*
$ Constructors:
    @ A constructor in Java is a special method that is used to initialize objects. 
    @ The constructor is called when a object of a class is created.
    @ A constructor will have the same name as the class they belong to.
    @ They don't have a return type (not even void ~ automatically called)

$ Constructor Overloading:
    @It allows to have multiple constructors in the same class with different parameters list.

$ this:
    @ It is a reference to the current instance of a class, 
    and its used to access instance variables  and methods within that class.

$ Note:
    @ Constructor Calling must be the 1st element of the constructor
~       Constructors(int age){
~           this.age = age;
~           this(); //! Error
~       }
*/


