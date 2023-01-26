
public class Date {
	private int dMonth;
	private int dDay;
	private int dYear;
	
	public Date() {
		this(1, 1, 1900);
	}
	
	public Date(int month, int day, int year) {
		setDate(month, day, year);
	}
	
	public void setDate(int month, int day, int year) {
		dMonth = month;
		dDay   = day;
		dYear  = year;	
	}
	
	//Getters and Setters
	public int getMonth() {
		return dMonth;
	}
	
	public int getDay() {
		return dDay;
	}
	
	public int getYear() {
		return dYear;
	}
	
	//toString()
	public String toString() {
		//mm-dd-yyyy
		return getDay() + "-" + getMonth() + "-" + getYear();
	}
}
