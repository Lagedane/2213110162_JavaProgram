import java.time.*;
public class FictionBook implements Author, Book {
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	
	public FictionBook(String title, int publicYear) {
		this.title 		 = title;
		this.publicYear  = publicYear;
		this.author_name = "";
		this.email       = "";
	}
	
	// Setters and Getters
	public void setAuthorName(String name) {
		author_name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String getFirstName() {
		return author_name.split(" ")[0].toUpperCase();
	}
	
	@Override
	public String getLastName() {
		return author_name.split(" ")[1].toUpperCase();
	}
	
	@Override
	public String getTitle() {
		return this.title;
	}
	
	@Override
	public int totalPublicYear() {
		return LocalDateTime.now().getYear() - this.publicYear;
	}
	
	//check method
	public boolean checkFormatName() {
		//return (author_name != getFirstName() + " " + getLastName()) ? false : true;
		return ((!author_name.contains(" ")) ? true : false);
	}
	
	@Override
	public boolean checkEmail() {
		return !((email.endsWith("@hotmail.com") || email.endsWith("@windowslive.com")) && !(email.contains(" "))) ? true : false;
	}
	
	public String toString() {
		return getTitle() + " write by " + getLastName().charAt(0) + ". " + getFirstName() +
			   " (" + this.email + ")" + "\nPublished for " + totalPublicYear() + " years.";
	}
	
} // end of class
