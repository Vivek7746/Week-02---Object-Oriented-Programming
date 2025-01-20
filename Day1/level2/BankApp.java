import java.util.*;

class BankAccount {

    // Attributes
    String accountHolder;
    String accountNumber;
    static double balance;

    // Constructor to assign values
    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". Current balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". Current balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Current balance: " + balance);
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to display the current balance
    void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
}

class BankApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter account holder's name: ");
        String accountHolder = input.nextLine();
        System.out.print("Enter account number: ");
        String accountNumber = input.nextLine();
        System.out.print("Enter initial balance: ");
        double balance = input.nextDouble();

        // Creating a BankAccount object
        BankAccount account = new BankAccount(accountHolder, accountNumber, balance);

        // Infinite loop for menu-driven interaction
        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount to deposit: ");
                double depositAmount = input.nextDouble();
                account.deposit(depositAmount);
            } else if (choice == 2) {
                System.out.print("Enter amount to withdraw: ");
                double withdrawAmount = input.nextDouble();
                account.withdraw(withdrawAmount);
            } else if (choice == 3) {
                account.displayBalance();
            } else if (choice == 4) {
                System.out.println("Program has been successfully executed");
                break; // Exit the loop
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        input.close();
    }
}
