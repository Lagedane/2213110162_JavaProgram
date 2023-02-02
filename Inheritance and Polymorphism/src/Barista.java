
public class Barista {
	private String name;
	private char gender;
	
	public Barista(String name, char gender) {
		this.name 	= name;
		this.gender = gender;
	}
	public Barista() {
		this.name	= "";
		this.gender = ' ';
	}
	
	//Getters
	public String getName() {
		return name;
	}
	public String getGenderName() {
		return (gender + "").equalsIgnoreCase("M") ? "Male" :
		       (gender + "").equalsIgnoreCase("F") ? "Female" : "";
	}
}
