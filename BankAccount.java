/**
 * BankAccount
 */
public class BankAccount {
    public double checkingBalance;
    public double savingsBalance;
    public static int numberOfAccounts = 0;

    public BankAccount(int checkingBalanceParam, int savingsBalanceParam){
        checkingBalance = checkingBalanceParam;
        savingsBalance = savingsBalanceParam;
        numberOfAccounts++;
    }
}