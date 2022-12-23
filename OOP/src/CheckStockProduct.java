import java.text.DecimalFormat;
import java.util.Scanner;

public class CheckStockProduct {
	public static int countL = 0, countN = 0, countH = 0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many product list in stock : ");
		Product[] productList = new Product[scan.nextInt()];
		System.out.println();
		
		for(int i = 0; i < productList.length; i++) {
			productList[i] = new Product();
			System.out.print("Input product Id     : ");
			productList[i].setId(scan.next());
			System.out.print("Input product Unit   : ");
			productList[i].setUnit(scan.nextInt());
			System.out.println();
		} // end for
		
		System.out.println();

		// LOW STATUS
		line();
		System.out.println("List of product in 'LOW' status.");
		line();
		for (Product pdt : productList) {
			if(pdt.checkProduct(pdt.getUnit()).equalsIgnoreCase("low")) {
				pdt.listStatus();
				countL++;
			} // end if
		} // end for
		if(countL == 0) System.out.println(">> There is no any LOW product");		
		
		// NORMAL STATUS
		line();
		System.out.println("List of product in 'NORMAL' status.");
		line();
		for (Product pdt : productList) {
			if(pdt.checkProduct(pdt.getUnit()).equalsIgnoreCase("normal")) {
				pdt.listStatus();
				countN++;
			} // end if
		} // end for
		if(countN == 0) System.out.println(">> There is no any NORMAL product");		
		
		// HIGH STATUS
		line();
		System.out.println("List of product in 'HIGH' status.");
		line();
		for (Product pdt : productList) {
			if(pdt.checkProduct(pdt.getUnit()).equalsIgnoreCase("high")) {
				pdt.listStatus();
				countH++;
			} // end if
		} // end for
		if(countH == 0) System.out.println(">> There is no any HIGH product");		

	} // end main()
	
	public static void line() {
	System.out.println("----------------------------------------------------");
	}
}  
