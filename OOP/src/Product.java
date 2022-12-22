
public class Product {
	private String id;
	private int unit;
	private double price;
	
	public void setId(String ID) {
		ID = id;
	} // end setId
	
	public String getId() {
		return id;
	} // end getId
	
	public void setUnit(int UNIT) {
		UNIT = unit;
	} // end setUnit
	
	public int getUnit() {
		return unit;
	} // end getUnit
	
	public void setPrice(double PRICE) {
		PRICE = price;
	} // end setPrice
	
	public double getPrice() {
		return price;
	} // end get price
	
	public double calculate() {
		return unit * price;
	} // end calculate
}
