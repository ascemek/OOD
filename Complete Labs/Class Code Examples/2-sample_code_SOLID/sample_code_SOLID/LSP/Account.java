
public class Account {

	private String accNo;
	private double amount;
	public Account(String accNo, double amount)
	{
		this.accNo = accNo;
		this.amount = amount;
	}
	
	public void deposit(double dep) { if (dep > 0.00) this.amount += dep; }
	
	public void setAmount(double amt) { this.amount = amt;}
	public double getAmount() { return this.amount;}
	
}

class WithdrawableAccount extends Account{

	public WithdrawableAccount(String accNo, double amount) {
		super(accNo, amount);
	
	}
	public void withdraw(double draw) {
		double amt = super.getAmount();
		if (amt >= draw)  
			  super.setAmount(amt-draw);}
	
}

class SavingsAccount extends WithdrawableAccount {
	public SavingsAccount(String accNo, double amount) { super(accNo, amount);}
	public double interest() {return this.getAmount() * 0.1; }
	
}

class CheckingAccount extends WithdrawableAccount {
	public CheckingAccount(String accNo, double amount) { super(accNo, amount);}
	
}

class FixedTermDepositAccount extends Account {

	public FixedTermDepositAccount(String accNo, double amount) {
		super(accNo, amount);
	}
	
}
