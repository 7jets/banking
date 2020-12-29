package banking;

public class SavingAccount extends Account{
	double interestRate;
	
	public SavingAccount(double balance,double interest_rate) {
		super(balance);
		interestRate = interest_rate;
	}
}
