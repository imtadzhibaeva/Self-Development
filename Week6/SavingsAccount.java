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
    }
}
