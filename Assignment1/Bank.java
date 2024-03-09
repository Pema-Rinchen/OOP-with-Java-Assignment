import java.util.ArrayList;
import java.util.List;

// Account class
class Account {
    private String accountId;
    private Customer customer;
    private double balance;
    
    public Account(String accountId, Customer customer) {
        this.accountId = accountId;
        this.customer = customer;
        this.balance = 0.0; // Initial balance is set to zero
    }
    
    // Getters and setters
    public String getAccountId() {
        return accountId;
    }
    
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    
    public Customer getCustomer() {
        return customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public double getBalance() {
        return balance;
    }
    
    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
    }
    
    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

// Customer class
class Customer {
    private String customerId;
    private String name;
    private String email;
    
    public Customer(String customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
    }
    
    // Getters and setters
    public String getCustomerId() {
        return customerId;
    }
    
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}

// Transaction class
class Transaction {
    private String transactionId;
    private String accountId;
    private double amount;
    private String type; // "deposit" or "withdraw"
    
    public Transaction(String transactionId, String accountId, double amount, String type) {
        this.transactionId = transactionId;
        this.accountId = accountId;
        this.amount = amount;
        this.type = type;
    }
    
    // Getters
    public String getTransactionId() {
        return transactionId;
    }
    
    public String getAccountId() {
        return accountId;
    }
    
    public double getAmount() {
        return amount;
    }
    
    public String getType() {
        return type;
    }
}

// Bank class
class Bank {
    private List<Account> accounts;
    private List<Transaction> transactions;
    
    public Bank() {
        accounts = new ArrayList<>();
        transactions = new ArrayList<>();
    }
    
    // Method to add an account to the bank
    public void addAccount(Account account) {
        accounts.add(account);
    }
    
    // Method to remove an account from the bank
    public void removeAccount(Account account) {
        accounts.remove(account);
    }
    
    // Method to deposit money into an account
    public void deposit(String accountId, double amount) {
        for (Account account : accounts) {
            if (account.getAccountId().equals(accountId)) {
                account.deposit(amount);
                transactions.add(new Transaction("T001", accountId, amount, "deposit"));
                break;
            }
        }
    }
    
    // Method to withdraw money from an account
    public void withdraw(String accountId, double amount) {
        for (Account account : accounts) {
            if (account.getAccountId().equals(accountId)) {
                account.withdraw(amount);
                transactions.add(new Transaction("T002", accountId, amount, "withdraw"));
                break;
            }
        }
    }
}
