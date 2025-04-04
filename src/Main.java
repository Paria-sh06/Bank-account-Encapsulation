public class Main {
    public static void main(String[] args) {
        BankCustomers bank = new BankCustomers();

        SavingAccount save1 = new SavingAccount("12345", "Alice", 1000);
        SavingAccount save2 = new SavingAccount("67890", "Bob", 2000);
        SavingAccount save3 = new SavingAccount("11121", "Charlie", 3000);

        TransactionAccount trans1 = new TransactionAccount("22222", "David", 500);
        TransactionAccount trans2 = new TransactionAccount("33333", "Eve", 1000);
        TransactionAccount trans3 = new TransactionAccount("44444", "Frank", 1500);

        bank.addAccount(save1);
        bank.addAccount(save2);
        bank.addAccount(save3);
        bank.addAccount(trans1);
        bank.addAccount(trans2);
        bank.addAccount(trans3);

        bank.findAccount("12345");
        bank.findAccount("99999");

        System.out.println("Balance of Alice's Account:");
        System.out.println("\tAccount Number: " + save1.getAccountNumber());
        System.out.println("\tInitial Balance: " + save1.getBalance());
        System.out.println("----------------------------------------------------------");

        save1.deposit(500);

        System.out.println("Balance of Alice's Account:");
        System.out.println("\tAccount Number: " + save1.getAccountNumber());
        System.out.println("\tBalance after deposit: " + save1.getBalance());
        System.out.println("----------------------------------------------------------");

        save2.deposit(-50);

        save3.calculateInterest();
        trans1.calculateInterest();

        System.out.println("----------------------------------------------------------");
        System.out.println("Balance of Charlie's Account:");
        System.out.println("\tAccount Number: " + save3.getAccountNumber());
        System.out.println("\tBalance after interest: " + save3.getBalance());
        System.out.println("----------------------------------------------------------");

        System.out.println("Balance of David's Account:");
        System.out.println("\tAccount Number: " + trans1.getAccountNumber());
        System.out.println("\tBalance after interest: " + trans1.getBalance());
        System.out.println("----------------------------------------------------------");

        save1.withdraw(200);
        save2.withdraw(-50);
        save3.withdraw(800);
        trans1.withdraw(200);
        trans2.withdraw(-50);
        trans3.withdraw(3000);
        System.out.println("----------------------------------------------------------");

        System.out.println("Final Balances:");
        bank.showAllBalances();
    }
}
