// Superclass: BankAccount
class BankAccount {
    // Common attributes for all accounts
    protected String accountNumber;
    protected double balance;

    // Constructor for BankAccount
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display common account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    // Additional attribute for SavingsAccount
    private double interestRate;

    // Constructor for SavingsAccount
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // Call superclass constructor
        this.interestRate = interestRate;
    }

    // Method to display the account type
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass: CheckingAccount
class CheckingAccount extends BankAccount {
    // Additional attribute for CheckingAccount
    private double withdrawalLimit;

    // Constructor for CheckingAccount
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance); // Call superclass constructor
        this.withdrawalLimit = withdrawalLimit;
    }

    // Method to display the account type
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}

// Subclass: FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    // Additional attribute for FixedDepositAccount
    private int duration; // Duration in months

    // Constructor for FixedDepositAccount
    public FixedDepositAccount(String accountNumber, double balance, int duration) {
        super(accountNumber, balance); // Call superclass constructor
        this.duration = duration;
    }

    // Method to display the account type
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Duration: " + duration + " months");
    }
}

// Main class to test the implementation
public class BankSystem {
    public static void main(String[] args) {
        // Create instances of different account types
        SavingsAccount savings = new SavingsAccount("SA123", 1000.50, 2.5);
        CheckingAccount checking = new CheckingAccount("CA456", 500.00, 3000.00);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD789", 10000.00, 12);

        // Display details of each account
        savings.displayAccountDetails();
        savings.displayAccountType();
        System.out.println();

        checking.displayAccountDetails();
        checking.displayAccountType();
        System.out.println();

        fixedDeposit.displayAccountDetails();
        fixedDeposit.displayAccountType();
    }
}
