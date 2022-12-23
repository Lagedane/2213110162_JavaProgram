import java.text.DecimalFormat;
import java.util.Scanner;

public class CheckStockProduct {

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
			} // end if
		} // end for
		
		
		// NORMAL STATUS
		line();
		System.out.println("List of product in 'NORMAL' status.");
		line();
		for (Product pdt : productList) {
			if(pdt.checkProduct(pdt.getUnit()).equalsIgnoreCase("normal")) {
				pdt.listStatus();
			} // end if
		} // end for
		
		// HIGH STATUS
		line();
		System.out.println("List of product in 'NORMAL' status.");
		line();
		for (Product pdt : productList) {
			if(pdt.checkProduct(pdt.getUnit()).equalsIgnoreCase("high")) {
				pdt.listStatus();
			} // end if
		} // end for
		
	} // end main()
	
	public static void line() {
	System.out.println("----------------------------------------------------");
	}
}
