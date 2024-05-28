package OOPS;

// Define a class named BankAccount
class BankAccount {
    // Private instance variables (attributes)
    private String accountNumber; // Encapsulated account number
    private double balance;       // Encapsulated balance

    // Constructor to initialize the BankAccount object
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber; // Set the account number
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative.");
        }
    }

    // Public getter method to retrieve the account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Public getter method to retrieve the balance
    public double getBalance() {
        return balance;
    }

    // Public method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // Add the amount to the balance
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Public method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount; // Subtract the amount from the balance
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345", 1000);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(500.0);
        System.out.println("New Balance after Deposit: " + account.getBalance());

        account.withdraw(200.0);
        System.out.println("New Balance after Withdrawal: " + account.getBalance());
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