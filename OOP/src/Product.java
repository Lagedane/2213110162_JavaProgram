   
public class Product {
	private String id;
	private int unit;
	private double price;
	
	public void setId(String ID) {
		id = ID;
	} // end setId
	
	public String getId() {
		return id;
	} // end getId
	
	public void setUnit(int UNIT) {
		unit = UNIT;
	} // end setUnit
	
	public int getUnit() {
		return unit;
	} // end getUnit
	
	public void setPrice(double PRICE) {
		price = PRICE;
	} // end setPrice
	
	public double getPrice() {
		return price;
	} // end get price
	
	public double calculate() {
		return unit * price;
	} // end calculate
	
	public String checkProduct(int unit) {
		return (unit < 5) ? "LOW" : (unit >= 5 && unit < 50) ? "NORMAL" : "HIGH";
	} // end checkProduct
	
	public void listStatus() {
		System.out.println(">> " + getId() + " has " + getUnit() + " units");
	} //end listStatus
	
}
