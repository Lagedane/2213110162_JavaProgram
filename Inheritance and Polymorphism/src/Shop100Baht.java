import javax.swing.*;

public class Shop100Baht {
	public static void main(String[] args) {
		Product arnupab = new Product();
		
		int check = JOptionPane.showConfirmDialog(null, "Is the program run on Pattakarn Branch?","Run Program",JOptionPane.YES_NO_OPTION);
		if(check == 0) {
			arnupab = new PattanakarnBranch();
		}
		//arnupab.setUnit(10);
		//JOptionPane.showMessageDialog(null, arnupab);
		arnupab.setUnit(Integer.parseInt(JOptionPane.showInputDialog("Input the number of product: ")));
		JOptionPane.showMessageDialog(null, arnupab);
	}
}
