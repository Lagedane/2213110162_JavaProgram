import java.io.*;
import java.util.*;

public class Example1202 {

	static Scanner input = new Scanner(System.in); // input data from console
	public static void main(String[] args) throws IOException {
		System.out.print("Input Section = ");
		int section = input.nextInt();
		Header(section);
		showListStudent(section);
		
	} // end of main()
	
	public static void showListStudent(int section) throws IOException {
		BufferedReader read = new BufferedReader(new FileReader("List107.txt"));
		String temp = "";
		while((temp = read.readLine()) != null) {
			String[] data = temp.split("\t");
			double midScore = Double.parseDouble(data[4]);
			double finalScore = Double.parseDouble(data[5]);
			String gradeResult = findResult(midScore, finalScore);
			if(Integer.parseInt(data[3]) == section) {
				System.out.println(data[0] + " " + data[2] + "\t" +
								   midScore + "\t" + finalScore + "\t" + gradeResult);
			} // end if
		} // end of while
	}
	
	public static String findResult(double Mid, double Final) {
		double totalScore = Mid + Final;
		return (totalScore >= 40) ? "PASS" : "FAIL";
	}
	
	public static void Header(int sec) {
		System.out.println("************************************************************");
		System.out.println("\t\tList of Data For Section " + sec);
		System.out.println("************************************************************");
	}
} // end of class
