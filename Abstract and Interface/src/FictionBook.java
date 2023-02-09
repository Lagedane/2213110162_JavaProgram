
public class FictionBook implements Author, Book {
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	
	static int CURRENT_YEAR = 2023;
	public FictionBook(String title, int publicYear) {
		this.title 		= title;
		this.publicYear = publicYear;
	}
	
	// Setters and Getters
	public void setAuthorName(String name) {
		author_name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getFirstName() {
		return author_name.split(" ")[0];
	}
	
	public String getLastName() {
		return author_name.split(" ")[1];
	}
	
	@Override
	public String getTitle() {
		return this.title;
	}
	
	@Override
	public int totalPublicYear() {
		return CURRENT_YEAR - this.publicYear;
	}
	
	//check method
	public boolean checkFormatName() {
		return (author_name == getFirstName() + " " + getLastName()) ? true : false;
	}
	
	public boolean checkEmail() {
		return (email.endsWith("@hotmail.com") || email.endsWith("@hotmail.com")) ? true : false;
	}
	
	public String toString() {
		return getTitle() + " write by " + getLastName().charAt(0) + ". " + getFirstName() +
			   "(" + this.email + ")" + "\nPublished for " + totalPublicYear() + " years.";
	}
	
} // end of class
