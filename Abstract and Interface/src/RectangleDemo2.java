import java.util.*;

public class RectangleDemo2 {
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Please input Width  : ");
		double width = scan.nextDouble();
		System.out.print("Please input Length : ");
		double length = scan.nextDouble();

		Rectangle2 rec2 = new Rectangle2(width, length);
		System.out.println(rec2 + "\nArea of Rectangle is " + rec2.getArea());
	}
} // end of class
