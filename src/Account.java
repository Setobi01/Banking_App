import java.util.Scanner;

/**
 *
 */
public class Account {
    private static int lastId;
    private final int id = 1;
    private String firstName;
    private String lastName;
    private double balance;

    public Account() {
        this.lastId = lastId;


    }

    /**
     *
     * @param firstName
     * @param lastName
     */
    public Account(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.isEmpty()) {
            throw new IllegalArgumentException("Invalid first name can't be blank for id" + id);
        } else {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException("Invalid last name can't be blank for id" + id);
        } else {
            this.lastName = lastName;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Invalid amount. Must be greater than 0 ");
        }

    }

    public void withdrawal(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Cannnot withdraw amount [" + amount + "]. Greater than the account balance ["+ balance+ "].");
        } else if (amount <= 0) {
            throw new IllegalArgumentException("Invalid amount." + amount +" Must be greater than 0");
        } else {
            balance -= amount;
        }
    }

    public String toString() {
        return id + " " + firstName + " " + lastName;
    }
}
