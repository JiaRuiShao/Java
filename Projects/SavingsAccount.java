public class SavingsAccount {
  // variables
  int balance;
  
  // constructor
  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }
  
  // check balance method
  public void checkBalance(){
    System.out.println("Hello!");
    System.out.println("Your balance is " + balance + ".");
  }
  
  // deposite method
  public void deposit(int amountToDeposit){
    int newBalance = balance + amountToDeposit;
    balance = newBalance;
    System.out.println("You just deposited " + amountToDeposit + ".");
  }
  
  // withdraw method
  public void withdraw(int amountToWithdraw){
    int newBalance = balance - amountToWithdraw;
    balance = newBalance;
    System.out.println("You just withdrew " + amountToWithdraw + ".");
  }
  
  // main method
  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);
    
    //Call check balance method:
    savings.checkBalance();
    
    //Withdrawing:
    savings.withdraw(233);

    //Deposit:
    savings.deposit(666);
    
    System.out.println(savings);
  }
  
  public String toString(){
    return("Your account balance now is " + balance + ".");
  }
}

// Output:
// Hello!
// Your balance is 2000.
// You just withdrew 233.
// You just deposited 666.
// Your account balance now is 2433.