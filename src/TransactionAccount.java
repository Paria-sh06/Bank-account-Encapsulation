public class TransactionAccount extends BankAccount {
    private static final double overDraftLimit = 500.0;

    public TransactionAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance + overDraftLimit) >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully from account with number " + getAccountNumber() +". New balance: " + balance);
        } else {
            System.out.println("Withdrawal denied.");
        }
    }

    @Override
    public void calculateInterest() {
        System.out.println("Transaction accounts have no interest.");
        System.out.println();
    }

    public double getOverdraftLimit() {
        return overDraftLimit;
    }
}
