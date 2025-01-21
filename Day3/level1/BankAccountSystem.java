 class BankAccount{

  private static String bankName = "SBI";

  private static String accountHolder;
  private final long accountNumber;
  private static int totalAccounts = 0;

  BankAccount(String accountHolder,long accountNumber){
      this.accountNumber = accountNumber;
      this.accountHolder = accountHolder;
      totalAccounts++;
  }

  public static int getTotalAccount(){
      return totalAccounts;
  }

  public void displayInstanceOf(){
      if (this instanceof BankAccount) {
          System.out.println("Bank Name: " + bankName);
          System.out.println("Account Holder Name: " + accountHolder);
          System.out.println("Account Number: " + accountNumber);
      } else {
          System.out.println("This object is not an instance of BankAccountSystem.");
      }
  }
}

public class BankAccountSystem {
  public static void main(String[] args) {
      BankAccount user1 = new BankAccount("vivek" , 3432342);
      user1.displayInstanceOf();
      System.out.println("Total number of accounts is : " + user1.getTotalAccount());

      BankAccount user2 = new BankAccount("vinay" , 50701001);
      user2.displayInstanceOf();
      System.out.println("Total number of accounts is : " + user2.getTotalAccount());


      BankAccount user3 = new BankAccount("ritik" , 50701002);
      user3.displayInstanceOf();
      System.out.println("Total number of accounts is : " + user1.getTotalAccount());

  }
}