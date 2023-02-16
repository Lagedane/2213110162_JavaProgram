import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ATMChecking extends ATMData {
	private int money;
	
	static DecimalFormat frm = new DecimalFormat("#,###.00");
	public ATMChecking(String id, String pass, int money) {
		super(id, pass);
		this.money = money;
	}
	
	public boolean checkBookBank() throws IOException {
		Scanner read = new Scanner(new File("ATMBookBanking.txt"));
		while(read.hasNext()) {
			String id   = read.next();
			String pass = read.next();
			int balance = read.nextInt();
			if(id == super.getId() && pass == super.getPass() && balance <= this.money) return true;
		} return false;
	}
	
	public void show() throws IOException {
		if(checkBookBank()) {
			double balance =  - this.money;
			System.out.println("You drawing for " + frm.format(money) + ", get");
			int thousand = money/1000; thousand %= 1000;
			System.out.println("\t1000 = " + thousand);
			int Fhundred = money/500;  Fhundred %= 500;
			System.out.println("\t500  = " + Fhundred);
			int Ohundred = money/100;  Ohundred %= 100;
			System.out.println("\t100  = " + Ohundred);
			System.out.println("Your balance is " + frm.format(balance) + " Baht.");
		}
	}
}
