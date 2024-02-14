package AbstractClass3;

public class main {

	public static void main(String[] args) {
		double ibal,damt,wamt;
		ibal=1000.00;
		
		SavingsAccount savingAccount=new SavingsAccount("ABC", ibal);
		System.out.println("Savings A/c : Initial Balance $"+ ibal);
		damt=500.00;
		savingAccount.deposit(damt);
		wamt=250.00;
		savingAccount.withdraw(wamt);
		wamt=1600;
		System.out.println("\nTry to withdraw: $"+wamt);
		savingAccount.withdraw(wamt);
		
		System.out.println();
		ibal=5000.00;
		CurrentAccount currentAccount=new CurrentAccount("XYZ", ibal);
		damt=2500.00;
		currentAccount.deposit(damt);
		wamt=1250.00;
		currentAccount.withdraw(wamt);
		wamt=6000.00;
		System.out.println("\nTry to withdraw: $"+wamt);
		savingAccount.withdraw(wamt);
		

	}

}
