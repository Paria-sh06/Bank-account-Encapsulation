public abstract class BankAccount {
    private final String accountNumber; // final means it can only be set once, in the constructor
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        setAccountHolderName(accountHolderName);
        this.balance = balance;
    }

    public void setAccountHolderName(String accountHolderName) {
        if (accountHolderName == null || accountHolderName.isEmpty()) {
            System.out.println("Invalid account holder name!");
        } else {
            this.accountHolderName = accountHolderName;
        }
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Balance cannot be negative!");
        } else {
            this.balance = balance;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void calculateInterest();

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully. New balance for  account with number " + accountNumber + " is: " + balance);
            System.out.println();
        } else {
            System.out.println("Invalid deposit amount!");
            System.out.println();
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully from account with number " + accountNumber + ". New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}
