package Week4;

public class SavingsAccount {
    int balance;

    public SavingsAccount(int initialBalance) {
        balance = initialBalance;
    }
    public static void main(String[] args){
        SavingsAccount savings = new SavingsAccount((2000));

        // check balance:
        System.out.println("Hello!");
        System.out.println("Your balance is " + savings.balance);

        // Withdrawing:
        int afterWithdraw = savings.balance - 300;
        savings.balance = afterWithdraw;
        System.out.println("You just withdrew " + 300);

        // check balance:
        System.out.println("Hello!");
        System.out.println("Your balance is " + savings.balance);
        
        // Deposit:
        int afterDeposit = savings.balance + 600;
        savings.balance = afterDeposit;
        System.out.println("You just deposited " +600);


        // check balance:
        System.out.println("Hello!");
        System.out.println("Your balance is " + savings.balance);


        // Deposit:
        int afterDeposit2 = savings.balance + 600;
        savings.balance = afterDeposit2;
        System.out.println("You just deposited " +600);


        // check balance:
        System.out.println("Hello!");
        System.out.println("Your balance is " + savings.balance);
    }
}