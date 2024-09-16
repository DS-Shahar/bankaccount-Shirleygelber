package bankAccount;

public class BankAccount {
	    private int balance;
	    private int minBalance;
	    private String owner; 
	    public BankAccount(int initialBalance, int minBalance, String owner) {
	        this.balance = initialBalance;
	        this.minBalance = minBalance;
	        this.owner= owner;
	    }
	    public int getBalance() {
	        return balance;
	    }
	    public int getMinBalance() {
	        return minBalance;
	    }
	    public String getOwner() {
	        return owner;
	    }
	    public void setOwner(String owner) {
	    	this.owner= owner; 
	    }
	    public void setBalance(int newBalance) {
	        if (newBalance >= minBalance) {
	            this.balance = newBalance;
	            System.out.println("new balance= " + newBalance);
	        }
	        else {
	            System.out.println("Cannot set balance below minimum balance of " + minBalance);
	        }
	    }
	    public void deposit(int amount) {
	        balance = balance + amount;
	    }
	    public void transfer(BankAccount otherAccount, int amount) {
	        if (this.balance - amount >= minBalance) {
	            this.balance -= amount;
	            otherAccount.balance += amount;
	            System.out.println("Transfer of " + amount + " was successful.");
	        } else {
	            System.out.println("Transfer failed");
	        }
	    }
	    public String toString() {
	        return "owner:" + owner + "balance: " + balance ;
	    }
	}

