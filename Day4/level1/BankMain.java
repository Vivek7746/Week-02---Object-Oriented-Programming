import java.util.*;
class Bank{

    // Attributes of Bank
    public String name;
    public ArrayList<Customer> customers = new ArrayList<>();

    // Method to open Account
    public void openAccount(Customer obj){
        this.customers.add(obj);
    }

    // Method to display all Customer's details
    public void displayCustomers(){

        System.out.println(name + "'s all Customers :-");

        // Looping through the ArrayList
        for(Customer c : customers){
            System.out.println("name : " + c.name + " acc. no. : " + c.accountNumber + " balance : " + c.balance);
        }
    }
}

class Customer{

    // Attributes
    public String name;
    public int accountNumber;
    public int balance;

    // Constructor to initialise
    Customer(String name, int accountNumber, int balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void viewBalance(){
        System.out.println(name + "'s current balance is " + balance);
    }
}

public class BankMain {
    public static void main(String[] args){

        Customer C1 = new Customer("vivek", 1234, 80000);
        Customer C2 = new Customer("vinay", 1235, 1000000);
        Customer C3 = new Customer("vishal", 1236, 50);

        Bank boi = new Bank();
        boi.name = "Bank of India";

        boi.openAccount(C1);
        boi.openAccount(C2);
        boi.openAccount(C3);

        C3.viewBalance();

        boi.displayCustomers();
    }
}