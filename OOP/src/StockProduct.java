import java.util.*;
import java.text.*;
   
public class StockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Product[] input = new Product[4];
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		for(int i = 0; i < input.length; i++) {
			input[i] = new Product();
			// input ID
			System.out.print("Input product Id     : ");
			input[i].setId(scan.next());
			// input UNIT
			System.out.print("Input product Unit   : ");
			input[i].setUnit(scan.nextInt());
			while(input[i].getUnit() <= 0) {
				System.out.print("Input product Unit, again   : ");
				input[i].setUnit(scan.nextInt());
			} // end while
			// input PRICE
			System.out.print("Input product Price  : ");
			input[i].setPrice(scan.nextDouble());
			while(input[i].getPrice() <= 0) {
				System.out.print("Input product Price  : ");
				input[i].setPrice(scan.nextDouble());
			} // end while
			System.out.println();
		} // end for
		
		System.out.println("\n----------------------------------------------------");

		for(int i = 0; i < input.length; i++) {
			System.out.println("Product ID : " + input[i].getId() + ", Total price = " + frm.format(input[i].calculate()) + " baht.");
		} // end for
		
		System.out.println("----------------------------------------------------");
		
		double sumTotal = 0;
		for(Product total : input) {
			sumTotal += total.calculate();
		} // end for
		
		System.out.println("Total price of all products is " + frm.format(sumTotal));

	} // end main()

}
