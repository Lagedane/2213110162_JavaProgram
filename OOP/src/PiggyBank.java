  
public class PiggyBank {
	// attributes
	public int one;
	public int two;
	public int five;
	public int ten;
	public int size;
	
	// methods
	public void setPiggyBank(int s) {
		clear();
		size = s;
	} // end setPiggyBank
	 
	public int getPiggyBank() {
		return size;
	}
	
	public void clear() {
		one = two = five = ten = 0;
	} // end clear

	public int getTotal() {
		return one + (two*2) + (five*5) + (ten*10);
	} // end getTotal
	
	public void msg() {
		System.out.println("Piggy Bank Full");
	} // end msg
	
	public void addOne(int c) {
		if((getTotal()+ c ) <= size) {
			one += c;
		} else msg(); // end if else
	} // end addOne
	
	public void addTwo(int c) {
		if((getTotal()+ (c*2) ) <= size) {
			two += c;
		} else msg(); // end if else
	} // end addTwo
	
	public void addFive(int c) {
		if((getTotal()+ (c*5) ) <= size) {
			five += c;
		} else msg(); // end if else
	} // end addFive
	
	public void addTen(int c) {
		if((getTotal()+ (c*10) ) <= size) {
			ten += c;
		} else msg(); // end if else
	} // end addTen
} // end class
