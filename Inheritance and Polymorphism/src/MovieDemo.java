import java.util.*;

public class MovieDemo {
	static Scanner scan = new Scanner (System.in);
	public static void main(String[] args) {
		System.out.print("Input movie id    : ");
		String mId = scan.nextLine();
		System.out.print("Input movie name  : ");
		String mName = scan.nextLine();
		
		System.out.println();
		
		System.out.print("Input director name    : ");
		String dName = scan.nextLine();
		System.out.print("Input director e-mail  : ");
		String email = scan.nextLine();
		System.out.print("Input director gender  : ");
		char gender = scan.next().charAt(0);
		while(!(gender + "").equalsIgnoreCase("M") && !(gender + "").equalsIgnoreCase("F")) {
			System.out.print("Input director gender, again  : ");
			gender = scan.next().charAt(0);
		} //end of while
		
		System.out.println();

		System.out.print("Input movie theater no.   : ");
		int mNo = scan.nextInt();
		while(mNo <= 0 || mNo > 15) {
			System.out.print("Please input 1 - 15 only  : ");
			mNo = scan.nextInt();
		}
		
		System.out.println();

		Theater theater = new Theater(mId, mName, new Director(dName, email, gender), mNo);
		System.out.println(theater);
	} //end of main()
}
