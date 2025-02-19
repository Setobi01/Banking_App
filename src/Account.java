/**
 * Represents a bank account with basic functionalities such as deposit, withdrawal,
 * and balance inquiry. Each account is uniquely identified by an ID.
 *
 * @author Confidence Affang,Sean Tobin
 * @version 1.00
 * @see <a href="https://github.com/Setobi01/Banking_App.git">GitHub Repository</a>
 */
public class Account {
    /**
     * this is used to track the last assigned account ID to ensure uniqueness.
     */
    private static int lastId = 0;

    /**
     * this is the unique identifier for each account.
     */
    private final int id;

    /**
     * this hold the first name of the account holder.
     */
    private String firstName;

    /**
     * this is the last name of the account holder.
     */
    private String lastName;

    /**
     * this is the current balance of the account.
     */
    private double balance;

    /**
     * this is the default constructor that initializes the account with a unique ID and balance.
     */
    public Account() {
        this.id = ++lastId;
        this.balance = 0.0;
    }

    /**
     * this is the overloaded constructor that initializes the account with the provided
     * first name and last name while calling the default constructor.
     *
     * @param firstName The first name of the account holder.
     * @param lastName  The last name of the account holder.
     */
    public Account(String firstName, String lastName) {
        this(); // Calls the default constructor to set ID and balance
        setFirstName(firstName);
        setLastName(lastName);
    }

    /**
     * retrieves and returns the current balance of the account.
     *
     * @return The current balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * sets the first name of the account holder after validation.
     *
     * @param firstName The first name of the account holder.
     * @throws IllegalArgumentException if the user doesn't input anything for the firstname
     */
    public void setFirstName(String firstName) {
        if (firstName == null || firstName.isEmpty()) {
            throw new IllegalArgumentException("Invalid first name. It cannot be blank for ID: " + id);
        } else {
            this.firstName = firstName;
        }
    }

    /**
     * sets the last name of the account holder after validation.
     *
     * @param lastName The last name of the account holder.
     * @throws IllegalArgumentException if the user doesn't input anything for the lastname
     */
    public void setLastName(String lastName) {
        if (lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException("Invalid last name. It cannot be blank for ID: " + id);
        } else {
            this.lastName = lastName;
        }
    }

    /**
     * deposits a specified amount into the account. The amount must be greater than zero.
     *
     * @param amount The amount to deposit.
     * @throws IllegalArgumentException if the deposit amount is less than or equal to zero.
     */
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid deposit amount. It must be greater than 0.");
        } else {
            balance += amount;
        }
    }

    /**
     * Withdraws a specified amount from the account after validation.
     * The amount must be greater than zero and not exceed the current balance.
     *
     * @param amount The amount to withdraw.
     * @throws IllegalArgumentException if the amount is greater than the balance or less than or equal to zero.
     */
    public void withdrawal(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid withdrawal amount. It must be greater than 0.");
        } else if (amount > balance) {
            throw new IllegalArgumentException("Cannot withdraw amount [" + amount + "]. Insufficient funds. Current balance: [" + balance + "].");
        } else {
            balance -= amount;
        }
    }

    /**
     * returns a string containing the account details including ID, name
     *
     * @return A string representation of the account.
     */
    @Override
    public String toString() {
        return "ID #" + id + ": " + firstName + " " + lastName;
    }
}
