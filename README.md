Banking App
A simple Java-based banking application that allows users to create accounts, deposit and withdraw money, and manage their balance.

Features
1. Create and manage user accounts
2. Deposit and withdraw funds
3. Validate user input for secure transactions

Demo


Installation
Clone the repository:
1. git clone https://github.com/Setobi01/Banking_App.git
2. Open the project in IntelliJ IDEA, Eclipse, or VS Code.
3. Run the Account class to test the functionality.


Class & Method Descriptions
Account Class
The Account class represents a user account with basic banking operations.

Methods:
getBalance() – Returns the current balance of the account.
setFirstName(String firstName) – Sets the first name of the account holder. Throws an exception if the input is empty or null.
setLastName(String lastName) – Sets the last name of the account holder. Throws an exception if the input is empty or null.
deposit(double amount) – Adds a valid amount to the account balance. Throws an exception if the amount is zero or negative.
withdrawal(double amount) – Withdraws money from the account if there are sufficient funds. Throws an exception if the amount is invalid or exceeds the balance.
toString() – Returns a formatted string containing the account ID and account holder's name.
