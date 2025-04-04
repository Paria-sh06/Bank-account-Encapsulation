public class SavingAccount extends BankAccount {
    private final double interestRate = 0.03;

    public SavingAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);

    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
        System.out.println("Interest of $" + interest + " added to the account with number " + getAccountNumber() + ". New balance: $" + getBalance());
        System.out.println();
    }


}
