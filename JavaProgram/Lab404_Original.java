import java.util.*;

public class Lab404_Original {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Text: ");
		String text = scan.nextLine();
		String s = "" , r = "";
		for(int i = 0; i < text.length(); i++) {
			String txt = text.substring(i,i+1);
			if(!txt.equals(" ")) {
				s = s + txt;
				r = txt + r;
			} // end if
		} // end for
		System.out.println("It is" + ((s.equalsIgnoreCase(r)) ? " " : " not " ) + "palindrome");
	} // end main()

}
