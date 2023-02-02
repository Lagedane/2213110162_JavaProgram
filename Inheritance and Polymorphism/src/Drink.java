
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
		if(type == 1) return "Hot";
		if(type == 2) return "Cold";
		return "";
	}
	public int getTypePrice() {
		if(type == 1) return 10;
		if(type == 2) return 20;
		return 0;
	}
	public String getSizeName() {
		if(size == 'S') return "Small";
		if(size == 'M') return "Medium";
		if(size == 'L') return "Large";
		return "";
	}
	public int getSizePrice() {
		if(size == 'S') return 15;
		if(size == 'M') return 20;
		if(size == 'L') return 25;
		return 0;
	}
	public int getTotalPrice() {
		return getTypePrice() + getSizePrice();
	}
}
