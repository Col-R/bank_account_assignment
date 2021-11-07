/**
 * BankAccount
 */
public class BankAccount {
    //static
    public static int numberOfAccounts = 0;
    public static double sum = 0;

    // objects
    public double checkingBalance;
    private double savingsBalance;


    public BankAccount(){
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        numberOfAccounts++;
    }
    // getters
    public double getChecking(){
        return this.checkingBalance;
    }
    public double getSavings(){
        return this.savingsBalance;
    }

    public double totalCash(){
        return (this.getChecking() + this.getSavings());
    }

    // setters
    public void deposit(double amount, String account){
        if(account.equals("savings"))
            this.savingsBalance += amount;
        else if(account.equals("checking"))
            this.checkingBalance += amount;
        BankAccount.sum += amount;
    }

    public void withdraw(double amount, String account){
        if (account.equals("savings")){
            if(this.savingsBalance - amount >= 0){
                this.savingsBalance -= amount;
                BankAccount.sum -= amount;
            }
        }
        else if(account.equals("checking")){
            if (this.checkingBalance - amount >=0){
                this.savingsBalance -= amount;
                BankAccount.sum -= amount;
            }
        }
    }
    public void showBalance(){
        System.out.println(String.format("Checking: %f, Savings: %f", this.checkingBalance, this.savingsBalance));
    }
}