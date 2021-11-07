public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(100,250);
        BankAccount account2 = new BankAccount(120,75);
        System.out.println(BankAccount.numberOfAccounts);
        System.out.println(BankAccount.sum);
    }
}
