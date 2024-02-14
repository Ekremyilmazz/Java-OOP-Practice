package I_2;

import java.util.ArrayList;
import java.util.List;

public class Bank {

	// Declare a private list to store accounts
	private List<Account> accounts;
	// Constructor for initializing the list of accounts
	public Bank() {
		accounts=new ArrayList<>();
	}
	
	public void addAccount(Account account) {
		accounts.add(account);
	}
	
	public void removeAccount(Account account, double amount) {
		account.deposit(amount);
	}
	
	public void deposit(Account account,double amount) {
		account.deposit(amount);
	}

	
	public void withdraw(Account account, double amount) {
		account.withdraw(amount);	
	}


	public void printAccountBalances() {
		for(Account account : accounts) {
			System.out.println("Account balance: " + account.getBalance());
		}
	}

	

}
