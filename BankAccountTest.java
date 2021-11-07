public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.deposit(400, "checking");
        acc1.withdraw(120, "checking");
        System.out.println(acc1.getChecking());
        BankAccount acc2 = new BankAccount();
        acc2.deposit(500, "savings");
        acc2.deposit(120, "checking");
        System.out.println(acc2.totalCash());
        System.out.println(BankAccount.numberOfAccounts);
    }
}
