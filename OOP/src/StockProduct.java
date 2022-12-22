import java.util.*;

public class StockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Product[] input = new Product[4];
		
		for(int i = 0; i < input.length; i++) {
			input[i] = new Product();
			System.out.print("Input product Id     : ");
			input[i].setId(scan.next());
			System.out.print("Input product Unit   : ");
			input[i].setUnit(scan.nextInt());
			System.out.print("Input product Price  : ");
			input[i].setPrice(scan.nextDouble());
			System.out.println();
		} // end for
		
		System.out.println();
		for(int i = 0; i < input.length; i++) {
			System.out.println("Product ID : " + );
		} // end for
		
		System.out.println("----------------------------------------------------");

	} // end main()

}
