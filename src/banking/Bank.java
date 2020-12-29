package banking;

public class Bank {
	private Customer[] customers;
	int numberOfCustomer;
	
	public Bank() {
		customers = new Customer[10];
		numberOfCustomer = 0;
	}
	
	public void addCustomer(String f,String l) {
		customers[numberOfCustomer] = new Customer(f, l);
		numberOfCustomer++;
	}
	
	public int getNumberOfCustomers() {
		return numberOfCustomer;
	}
	public Customer getCustomer(int index) {
		return customers[index];
	}
}
