import java.util.*;

public class BookDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Author
		System.out.print("Input author name    : ");
		String name = scan.nextLine();
		System.out.print("Input author e-mail  : ");
		String email = scan.next();
		
		Author1 auth = new Author1(name, email);
		System.out.println();
		System.out.println(auth); //call toString()
		System.out.println();
		
		//Book
		System.out.print("Input book title : ");
		scan.nextLine();
		String title = scan.nextLine();
		System.out.print("Input book page  : ");
		int page = scan.nextInt();
		
		System.out.println();
		
		Book1 book1 = new Book1(title, auth, page);
		System.out.println(book1);
	}

}
