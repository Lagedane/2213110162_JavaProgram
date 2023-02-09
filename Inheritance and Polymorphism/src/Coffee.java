public class Coffee extends Drink {
	private int typeCoffee;
	private char sizeCoffee;
	private Barista barista;
	
	public Coffee(int type, char sizeCoffee, int typeCoffee, Barista barista) {
		super(type, ' ');
		this.sizeCoffee = sizeCoffee;
		this.typeCoffee = typeCoffee;
		this.barista    = barista;
	}
	
	public Coffee(int type, int typeCoffee) {
		super(type, ' ');
		this.typeCoffee = typeCoffee;
	}
	
	// Getters
	public Barista getBarista() {
		return barista;
	}
	
	@Override
	public String getTypeName() {
		return (typeCoffee == 1) ? "Americano"  :
			   (typeCoffee == 2) ? "Espresso"   :
			   (typeCoffee == 3) ? "Cappuccino" : "";
	}
	
	@Override
	public int getTypePrice() {
		return (typeCoffee == 1) ? 50 :
			   (typeCoffee == 2) ? 55 :
			   (typeCoffee == 3) ? 65 : 0;
	}
	
	@Override
	public String getSizeName() {
		return (sizeCoffee == 'S') ? "Small"  :
			   (sizeCoffee == 'T') ? "Tall"   :
			   (sizeCoffee == 'G') ? "Grande"   :
			   (sizeCoffee == 'V') ? "Venti" : "";
	}
	
	@Override
	public int getSizePrice() {
		return (sizeCoffee == 'S') ? 100 :
			   (sizeCoffee == 'T') ? 150 :
			   (sizeCoffee == 'G') ? 200 :
			   (sizeCoffee == 'V') ? 250 : 0;
	}
	
	@Override
	public int getTotalPrice() {
		return super.getTypePrice() + this.getTypePrice() + this.getSizePrice();
	}
	
	//toString()
	public String toString() {
		return super.getTypeName() + " " + this.getTypeName() + " (" + this.getSizeName() + 
			   ") is " + this.getTotalPrice() + " baht.";
	}
	
} //end of class
