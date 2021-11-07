/**
 * BankAccount
 */
public class BankAccount {
    public double checkingBalance;
    private double savingsBalance;
    public static int numberOfAccounts = 0;
    public static double sum = 0;

    public BankAccount(int checkingBalanceParam, int savingsBalanceParam){
        checkingBalance = checkingBalanceParam;
        savingsBalance = savingsBalanceParam;
        numberOfAccounts++;
        sum = checkingBalance + savingsBalance;
    }
    // getters

    // setters
}