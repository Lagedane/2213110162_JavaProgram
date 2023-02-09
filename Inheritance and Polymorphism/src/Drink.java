
public class Drink {
	private int type;
	private char size;
	
	public Drink(int type, char size) {
		this.type = type;
		this.size = size;
	}
	public Drink() {
		this.type = 0;
		this.size = ' ';
	}
	//Getters
	public String getTypeName() {
		return (type == 1) ? "Hot" : 
			   (type == 2) ? "Cold" : "";
	}
	public int getTypePrice() {
		return (type == 1) ? 10 : 
			   (type == 2) ? 20 : 0;
	}
	public String getSizeName() {
		return (size == 'S' && size == 's') ? "Small"  : 
			   (size == 'M' && size == 'm') ? "Medium" : 
			   (size == 'L' && size == 'l') ? "Large"  : "";
	}
	public int getSizePrice() {
		return (size == 'S' && size == 's') ? 15 : 
			   (size == 'M' && size == 'm') ? 20 : 
			   (size == 'L' && size == 'l') ? 25 : 0;
	}
	public int getTotalPrice() {
		return getTypePrice() + getSizePrice();
	}
}
