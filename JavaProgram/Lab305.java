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
		for(int i = x; i < y; i++) {
			System.out.println(x + " + " + (i+1) + " = " + (x+i+1));
			x += i+1;
		} // end for
	} // end main()

}
