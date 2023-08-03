public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        account1.deposit("checking", 1000);
        account1.deposit("savings", 500);

        account2.deposit("checking", 1500);
        account2.deposit("savings", 800);

        System.out.println("Account 1 Checking Balance: " + account1.getCheckingBalance());
        System.out.println("Account 1 Savings Balance: " + account1.getSavingsBalance());
        System.out.println("Account 2 Checking Balance: " + account2.getCheckingBalance());
        System.out.println("Account 2 Savings Balance: " + account2.getSavingsBalance());

        account1.withdraw("checking", 200);
        account2.withdraw("savings", 100);

        System.out.println("Account 1 Total Money: " + account1.getTotalMoney());
        System.out.println("Account 2 Total Money: " + account2.getTotalMoney());

        System.out.println("Number of Accounts Created: " + BankAccount.getNumAccounts());
        System.out.println("Total Money Stored in All Accounts: " + BankAccount.getTotalMoneyStored());
    }
}
