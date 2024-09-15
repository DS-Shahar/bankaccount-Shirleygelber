

class Main {
    public static void main(String[] args) {
        // Create two accounts for Bob and Lisa
        BankAccount bobAccount = new BankAccount(1000, -1000);
        BankAccount lisaAccount = new BankAccount(1000, -1000);

        // Display initial balances
        System.out.println("Bob's balance: " + bobAccount.getBalance());
        System.out.println("Lisa's balance: " + lisaAccount.getBalance());

        // Try to transfer 1600 from Bob to Lisa
        bobAccount.transfer(lisaAccount, 1600);

        // Display balances after transfer attempt
        System.out.println("Bob's balance after transfer attempt: " + bobAccount.getBalance());
        System.out.println("Lisa's balance after transfer attempt: " + lisaAccount.getBalance());
    }