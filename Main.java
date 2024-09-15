

class Main {
    public static void main(String[] args) {
        BankAccount bobAccount = new BankAccount(1000, -1000);
        BankAccount lisaAccount = new BankAccount(1000, -1000);

        System.out.println("Bob's balance: " + bobAccount.getBalance());
        System.out.println("Lisa's balance: " + lisaAccount.getBalance());

        bobAccount.transfer(lisaAccount, 1600);

        System.out.println("Bob's balance after transfer attempt: " + bobAccount.getBalance());
        System.out.println("Lisa's balance after transfer attempt: " + lisaAccount.getBalance());
    }
