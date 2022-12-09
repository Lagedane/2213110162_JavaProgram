import javax.swing.*;
import java.text.*;
import java.util.Scanner;

public class Test {
	static final double TAX_RATE_ABOVE_20K = 0.1;
	static final double TAX_RATE_ABOVE_40K = 0.2;
	static final double TAX_RATE_ABOVE_60K = 0.3;
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("0.00");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the taxable income: $");
		double taxableIncome = scan.nextDouble();
		double taxPayable;
		if (taxableIncome <= 20000) { // [0, 20000]
			taxPayable = 0;
			}
		else if (taxableIncome <= 40000) { //[40001, 60000]
			taxPayable = (taxableIncome-20000) * TAX_RATE_ABOVE_20K ;
			}
		else if (taxableIncome <= 60000) { // [40001, 60000]
			taxPayable = ((taxableIncome-40000) * TAX_RATE_ABOVE_40K) + (20000*TAX_RATE_ABOVE_20K) ;
			}
		else { // [60001, ]
			taxPayable = TAX_RATE_ABOVE_60K * (taxableIncome-60000)+ (TAX_RATE_ABOVE_40K*20000)+(TAX_RATE_ABOVE_20K*20000) ;
			}
		System.out.print("The income tax payable is: $" + frm.format(taxPayable));
	}

}