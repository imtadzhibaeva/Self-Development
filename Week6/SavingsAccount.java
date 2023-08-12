package Week6;

public class SavingsAccount {
    int balance;

    public SavingsAccount(int initialBalance){

        balance = initialBalance;
    }

    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(2000);
    
    // check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is " + savings.balance);

  int afterWithdraw = savings.balance - 300;
    savings.balance = afterWithdraw;
    System.out.println("You just withdrew " + 300);

    // check balance
    System.out.println("Hello");
    System.out.println("Your balance is " + savings.balance);

    // Deposit
    int afterDeposit = savings.balance + 600;
    savings.balance = afterDeposit;
    System.out.println("You just deposited " + 600);

    // Check balance
    System.out.println("Hello");
    System.out.println("Your balance is " + savings.balance);
    
    }

    public void checkBalance() {
        System.out.println("Hello");
        System.out.println("Your balance is " + balance);
    }

    public void deposit(int amountToDeposit) {
        balance = amountToDeposit + balance;
        System.out.println("You just deposited " + amountToDeposit);
        
    }

}
