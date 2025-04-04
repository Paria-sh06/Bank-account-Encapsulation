import java.util.ArrayList;

public class BankCustomers {
    private ArrayList<BankAccount> accountsList;

    public BankCustomers() {
        this.accountsList = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accountsList.add(account);
    }

    public void showAllBalances() {
        for (BankAccount account : accountsList) {
            System.out.println("Account Holder: " + account.getAccountHolderName());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("------------------------------");
        }
    }

    public BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accountsList) {
            if (account.getAccountNumber().equals(accountNumber)) {
                System.out.println("Account Found:");
                System.out.println("\tAccount Holder: " + account.getAccountHolderName());
                System.out.println("\tAccount Number: " + account.getAccountNumber());
                System.out.println("\tBalance: " + account.getBalance());
                System.out.println("----------------------------------------------------------");
                return account;
            }
        }
        System.out.println("Error: Account with number " + accountNumber + " not found.");
        System.out.println("----------------------------------------------------------");
        return null;
    }
}
