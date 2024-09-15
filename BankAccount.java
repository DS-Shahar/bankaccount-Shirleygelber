class BankAccount {
    private int balance;
    private int minBalance;

    public BankAccount(int initialBalance, int minBalance) {
        this.balance = initialBalance;
        this.minBalance = minBalance;
    }

    public int getBalance() {
        return balance;
    }

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

