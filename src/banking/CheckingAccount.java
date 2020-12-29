package banking;

public class CheckingAccount extends Account{
	double overdraftProtection;
	
	public CheckingAccount(double balance) {
		super(balance);
	}
	
	public CheckingAccount(double balance,double protect) {
		super(balance);
		overdraftProtection = protect;
	}
	
	public boolean withdraw(double amt) {
		if(amt<=balance) {
			balance -= amt;
			return true;
		}
		else if(amt<=balance+overdraftProtection) {
			balance -= amt;
			overdraftProtection = overdraftProtection - (amt - balance);
			return true;
		}
		else {
			return false;
		}
	}
}
