class BankAccount {
    private int balance;
    private int minBalance;

    // Constructor for setting initial balance and min balance
    public BankAccount(int initialBalance, int minBalance) {
        this.balance = initialBalance;
        this.minBalance = minBalance;
    }

    // Method to get the balance
    public int getBalance() {
        return balance;
    }

    // Method to transfer money between accounts
    public void transfer(BankAccount otherAccount, int amount) {
        if (this.balance - amount >= minBalance) {
            this.balance -= amount;
            otherAccount.balance += amount;
            System.out.println("Transfer of " + amount + " was successful.");
        } else {
            System.out.println("Transfer failed: Insufficient funds. Transfer would exceed overdraft limit.");
        }
    }
}

