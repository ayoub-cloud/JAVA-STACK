public class BankAccount {
    private static int numAccounts = 0;
    private static double totalMoneyStored = 0;

    private double checkingBalance;
    private double savingsBalance;
    private String accountNumber;

    // Constructor
    public BankAccount() {
        numAccounts++;
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        this.accountNumber = generateAccountNumber();
    }

    // Getters
    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    // Method to deposit money into either checking or savings
    public void deposit(String accountType, double amount) {
        if (accountType.equalsIgnoreCase("checking")) {
            checkingBalance += amount;
        } else if (accountType.equalsIgnoreCase("savings")) {
            savingsBalance += amount;
        }
        totalMoneyStored += amount;
    }

    // Method to withdraw money from either checking or savings
    public void withdraw(String accountType, double amount) {
        if (accountType.equalsIgnoreCase("checking")) {
            if (checkingBalance >= amount) {
                checkingBalance -= amount;
                totalMoneyStored -= amount;
            } else {
                System.out.println("Insufficient funds in the checking account.");
            }
        } else if (accountType.equalsIgnoreCase("savings")) {
            if (savingsBalance >= amount) {
                savingsBalance -= amount;
                totalMoneyStored -= amount;
            } else {
                System.out.println("Insufficient funds in the savings account.");
            }
        }
    }

    // Method to see the total money from checking and savings
    public double getTotalMoney() {
        return checkingBalance + savingsBalance;
    }

    // Private method to generate a random ten-digit account number
    private String generateAccountNumber() {
        StringBuilder accountNum = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            accountNum.append((int) (Math.random() * 10));
        }
        return accountNum.toString();
    }

    // Getters for the static variables
    public static int getNumAccounts() {
        return numAccounts;
    }

    public static double getTotalMoneyStored() {
        return totalMoneyStored;
    }
}
