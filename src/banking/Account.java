package banking;

public class Account {
	protected double balance;
	
	public Account(double d){
		balance = d;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public boolean deposit(double amt) {
		balance += amt;
		return true;
	}
	
	public boolean withdraw(double amt) {
		if(amt<=balance) {
			balance -=amt;
			return true;		
		}
		else {
			return false;
		}
	}
}
