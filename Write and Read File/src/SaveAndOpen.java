import java.io.*;
import java.util.*;

public class SaveAndOpen extends Employee {
	private String name;
	private String dept;
	
	public void Insert() throws IOException {
		Scanner console = new Scanner(System.in);
		PrintStream ps  = new PrintStream(new File("employee.txt"));
		String answer;
		do {
			super.header();
			System.out.print("Enter name : ");
			name = console.next();
			System.out.print("Enter Department : ");
			dept = console.next();
			// write all data to file
			ps.println(name + "\t" + dept);
			System.out.print("Enter data again? ");
			answer = console.next();
			
		} while(answer.equalsIgnoreCase("y"));
	} // end of Insert()
	
	public void Read() {
		try {
			Scanner in = new Scanner(new File("employee.txt"));
			int i = 0;
			boolean check = false;
			super.header();
			while(in.hasNext()) {
				name = in.next();
				dept = in.next();
				if(dept.equalsIgnoreCase(super.getDept())) {
					i++;
					System.out.println(i + ".) " + name);
					check = true;
				} // end of if
			} // end of while
			if(check) {
				super.header();
				System.out.println("\nEmployee in Department " + super.getDept() + " is " + i + "person.");
				super.header();
			} else {
				System.out.println("\nSorry no Department " + super.getDept() + " is " + i + "in file.");
			} // end of if-else
			in.close();
		} catch (IOException e) {
			System.out.print("\nSorry, File not Found. . .");
		} // end catch
	} // end of Read()
} // end of class
