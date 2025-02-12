import java.util.Scanner;



public class Account {
    private static int lastId;
    private final int id = 0;
    private String firstName ;
    private String lastName ;
    private double balance;
public Account(){
    this.lastId = lastId;


    }public Account(String firstName, String lastName){
    this.firstName = firstName;
    this.lastName = lastName;
    }
    public double getBalance(){
    return balance;
    }
    public void setFirstName(String firstName){

    }
}
