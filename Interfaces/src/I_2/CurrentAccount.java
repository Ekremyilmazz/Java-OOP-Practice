package I_2;

public class CurrentAccount implements Account{

	private double balance;
	private double overdraftLimit;
	
	public CurrentAccount(double initialDeposit,double overdraftLimit) {
		this.balance=initialDeposit;
		this.overdraftLimit=overdraftLimit;
	}
	
	@Override
	public void deposit(double amount) {
		balance+=amount;
		
	}

	@Override
	public void withdraw(double amount) {
		if(balance+overdraftLimit >= amount) {
			balance-=amount;
		}
	}

	@Override
	public double getBalance() {
		return balance;
	}
    
	public void setOverdraftLimit(double overoverdraftLimitdraf) {
		this.overdraftLimit=overoverdraftLimitdraf;
	}


}
