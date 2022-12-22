import java.util.*;

public class Lab305 {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Input value of X : ");
		int x = scan.nextInt();
		System.out.print("Input value of Y : ");
		int y = scan.nextInt();
		while(y < x) {
			System.out.print("Input value of Y, again : ");
			 y = scan.nextInt();
		} // end while
		
		System.out.println();
		int i = 0;
		int sum = x + (x+(i+1));
		System.out.println(x + " + " + (x+(i+1)) + " = " + sum);
		for(i = 1; i < (y-x); i++) {
			int finalSum = sum + (x+(i+1));
			System.out.println(sum + " + " + (x+(i+1)) + " = " + finalSum);
		} // end for
	} // end main()

}
