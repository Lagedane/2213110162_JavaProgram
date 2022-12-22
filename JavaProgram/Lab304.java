import java.util.*;

public class Lab304 {

	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int num, _num;
		System.out.print("Input number : ");
		num = scan.nextInt();
		while(true) {
			System.out.print("Input number : ");
			_num = scan.nextInt();
			if (_num < num) break;
			num = _num;
		} // end while
		System.out.println("\nBYE BYE");
	}

}
