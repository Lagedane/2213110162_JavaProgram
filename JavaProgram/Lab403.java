import java.util.*;
public class Lab403 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Message : ");
		String input = scan.nextLine();
		System.out.println((input.toLowerCase().indexOf("nichi") >= 0)? "Nichi is a sentence" :(input));

	}

}