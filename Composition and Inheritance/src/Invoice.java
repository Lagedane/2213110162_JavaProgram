
public class Invoice {
	private int id;
	Customer customer;
	double amount;
	
	public Invoice(int id, Customer customer, double amount) {
		this.id = id;
		this.customer = customer;
		this.amount = amount;
	}
	
	//Getters and Setters
	public int getID() {
		return this.id;
	}
	
	public Customer getCustomer() {
		return this.customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public double getAmount() {
		return this.amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public int getCustomerID() {
		return customer.getID();
	}
	
	public String getCustomerName() {
		return customer.getName();
	}
	
	public int getCustomerDiscount() {
		return customer.getDiscount();
	}
	
	public double getAmountAfterDiscount() {
		return amount - ((getCustomerDiscount()/100.0)*amount);
	}
	
	//toString()
	public String toString() {
		return "Invoice[id = " + getID() + ",customer=" + customer + ",amount = " + getAmountAfterDiscount() + "]";
	}
}
