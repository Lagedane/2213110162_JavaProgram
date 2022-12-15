import java.util.*;

public class Lab_Example603 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number[] = new int[5];
		for (int i = 0; i < number.length; i++) {
			System.out.print("Input number " + (i+1) + " : ");
			number[i] = scan.nextInt();
		} // end of FOR
		System.out.println();
		//int totalNumber = sumOfPos(number);
		System.out.println("Summation of positive number is " + sumOfPos(number));
	} // end of MAIN
	
	public static int sumOfPos(int[] nums) {
		int sum = 0;
		for (int _nums : nums) {
			sum += _nums;
		} // end of FOR
		return sum;
	} // end of sumOfPos
}
