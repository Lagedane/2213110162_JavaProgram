import javax.swing.*;
public class BookDemo2 {

	public static void main(String[] args) {
		String name  = JOptionPane.showInputDialog("Input author name:");
		String email = JOptionPane.showInputDialog("Input author e-mail:");

		String title = JOptionPane.showInputDialog("Input book title:");
		int    page  = Integer.parseInt(JOptionPane.showInputDialog("Input book page:"));
		int    check = JOptionPane.showConfirmDialog(null, "Is the page correct?", "Confirm", JOptionPane.YES_NO_OPTION);
		while(check == 1) {
			page  = Integer.parseInt(JOptionPane.showInputDialog("Input book page, again:"));
			break; // เดี๋ยวมาแก้ค่ะ
		}
		
		Book1 book1 = new Book1(title, new Author1(name, email), page);
		JOptionPane.showMessageDialog(null, "Book Title : " + book1.getTitle() +
				  "\nAuthor name : " + book1.getAuthor().getName() + " (" + book1.getPage() + ")" +
				  "\nAuthor e-mail : " + book1.getAuthor().getEmail());		
	}

}
