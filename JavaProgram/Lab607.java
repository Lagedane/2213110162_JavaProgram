import java.util.*;

public class Lab607 {

	static Scanner scan = new Scanner(System.in);
	static String month[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September","October", "November", "December" };
	static int count[] = new int[12];
	static int inputBirthDate[] = new int[5];
	
	public static void main(String[] args) {
		inputBirthDate();
	} // end of main
	
	public static void inputBirthDate() {
		for (int i = 0; i < inputBirthDate.length; i++) {
			System.out.print("Enter BirthDate " + (i+1) + " : ");
			String bDate = scan.nextLine();
			int bmonth = checkBirthDate(bDate);
			//inputBirthDate[i] = bmonth;
			count[bmonth-1]++;
		} // end of FOR
		
		System.out.println();
		
		displayCountBday(count);
		
	} // end of inputBirthDate
	
	public static int checkBirthDate(String bDate) {
		int month = Integer.parseInt(bDate.substring(3, 5));
		return month;
	} // end of checkBirthDate
	
	public static void displayCountBday(int[] count) {
		for(int i = 0; i < count.length; i++) {
			System.out.println(month[i] + " [" + count[i] + " people]");
		} // end of FOR
	}

}
