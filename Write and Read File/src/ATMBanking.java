import java.util.Scanner;

public class ATMBanking {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		String accountNumber, pass;
		int money;
		System.out.print("Enter account number : ");
		accountNumber = input.nextLine();
		/*while(!(accountNumber >=   && accountNumber <= )) {
			System.out.println("Input wrong type, Enter account number : ");
		}*/
		System.out.print("Enter password : ");
		pass = input.nextLine();
		while(pass.length() != 4) {
			System.out.print("Enter password, again : ");
			pass = input.nextLine();
		}
		System.out.print("Enter money : ");
		money = input.nextInt();
		while(money <= 0) {
			System.out.print("Enter money : ");
			money = input.nextInt();
		}
	}

}
