/**
 * This is the wrapper class for the account where all the field and methods are listen in
 */
public class Account {
    private static int lastId = 0;
    private final int id;
    private String firstName;
    private String lastName;
    private double balance;

    /**
     * this method sets the curent id to the last id incremented by 1
     */
    public Account() {
        this.id = ++lastId;


    }

    /**
     * this method sets the firstname and also the id and the balance too
     *
     * @param firstName this is the firstname of the user
     * @param lastName  this is the lastname of the user
     */
    public Account(String firstName, String lastName) {
        this.id = ++lastId;
        setFirstName(firstName);
        setLastName(lastName);
        this.balance = 0.0;
    }

    /**
     * @return this method returns the current balance to the user
     */
    public double getBalance() {

        return balance;
    }

    /**
     * this method is used to check for errors if the user doesn't enter any character when asked for their first name and sets the firstname if they user inputted thier name
     *
     * @param firstName this is the firstname of the user
     */
    public void setFirstName(String firstName) {
        if (firstName == null || firstName.isEmpty()) {
            throw new IllegalArgumentException("Invalid first name can't be blank for id" + id);
        } else {
            this.firstName = firstName;
        }
    }

    /**
     * this method is used to check for errors if the user doesn't enter any character when asked for their last name and sets the lastname if they user inputted thier name
     *
     * @param lastName this is thelastname of the user
     */
    public void setLastName(String lastName) {
        if (lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException("Invalid last name can't be blank for id" + id);
        } else {
            this.lastName = lastName;
        }
    }

    /**
     * this method is used to validate that the amount to be deposited is greated than 0 and the add it to the balance
     *
     * @param amount this is the amount the user wants to deposit in the account
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Invalid amount. Must be greater than 0 ");
        }

    }

    /**
     * this method is used to validate that the amount to be withdrawn is not greater than the current account balance and also greater than 0 and then subtracts it from the bank balance
     *
     * @param amount this is the amount to be withdrawn from the account
     */
    public void withdrawal(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Cannnot withdraw amount [" + amount + "]. Greater than the account balance [" + balance + "].");
        } else if (amount <= 0) {
            throw new IllegalArgumentException("Invalid amount." + amount + " Must be greater than 0");
        } else {
            balance -= amount;
        }
    }

    /**
     * this overides the output from the Account method called and returns the string below
     *
     * @return the string of the id and the name
     */
    @Override
    public String toString() {
        return "ID #" + id + ": " + firstName + " " + lastName;
    }
}
