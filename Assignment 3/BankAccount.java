public class BankAccount {
    private static int totalAccounts = 0;
    private int accountNumber;
    private String name;
    private double balance;

    public BankAccount(String name, double balance) {
        this.accountNumber = ++totalAccounts;
        this.name = name;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void depositMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    public void withdrawMoney(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount for withdrawal.");
        }
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static void displayTotalAccounts() {
        System.out.println("Total accounts: " + totalAccounts);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("John", 1000);
        BankAccount account2 = new BankAccount("Alice", 2000);

        System.out.println("Initial account details:");
        displayAccountDetails(account1);
        displayAccountDetails(account2);
        System.out.println();

        account1.depositMoney(500);
        account2.withdrawMoney(100);
        System.out.println();

        System.out.println("Updated account details:");
        displayAccountDetails(account1);
        displayAccountDetails(account2);

        displayTotalAccounts();
    }

    public static void displayAccountDetails(BankAccount account) {
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Name: " + account.getName());
        System.out.println("Balance: $" + account.getBalance());
        System.out.println();
    }
}
