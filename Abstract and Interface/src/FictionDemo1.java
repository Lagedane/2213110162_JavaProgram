import java.util.Scanner;

public class FictionDemo1 {
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Input Book's name  : ");
		String bookName = scan.nextLine();
		System.out.print("Input Book's year  : ");
		int bookYear = scan.nextInt();
		
		FictionBook book = new FictionBook(bookName, bookYear);
		
		System.out.print("Input Author name  : ");
		String author = scan.next();
		scan.nextLine();
		System.out.print("Input Author email : ");
		String email = scan.next();
		
		book.setAuthorName(author);
		book.setEmail(email);
		
		while(book.checkFormatName()) {
			System.out.print("Input Author name, again  : ");
			author = scan.next();
		} // end of while
		
		while(book.checkEmail()) {
			System.out.print("Input Author email, again  : ");
			email = scan.next();
		} // end of while
		System.out.println(book.toString());
	} // end of main()
} // end of class
