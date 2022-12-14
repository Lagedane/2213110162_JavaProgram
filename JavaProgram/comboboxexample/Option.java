package comboboxexample;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Option extends JFrame implements ActionListener{
	
	String[] messageStrings = {"No Spice", "Mild", "Medium", "Hot", "Extra Hot", "Fiery", "Hell"};
	JComboBox cmbMessageList = new JComboBox(messageStrings);
	JLabel lblText = new JLabel();

	public static void main(String[] args) {
		Option fr = new Option();
		//centerFrame(fr);
		//maximiseFrame(fr)
		fr.setVisible(true);
	}
	
	public Option() {
		setLayout (new FlowLayout());
		setSize(400, 300);
		setTitle("How spicy would you like that?");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		cmbMessageList.setSelectedIndex(1);
		cmbMessageList.addActionListener(this);
		add(lblText);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cmbMessageList) {
			JComboBox cb = (JComboBox)e.getSource();
			String msg = (String)cb.getSelectedItem();
			switch(msg) {
				case "Message 1" : lblText.setText("You choose No Spice");
					break;
				case "Message 2" : lblText.setText("You choose Mild");
					break;
				case "Message 3" : lblText.setText("You choose Medium");
					break;
				case "Message 4" : lblText.setText("You choose Hot");
					break;
				case "Message 5" : lblText.setText("You choose Extra Hot");
					break;
				case "Message 6" : lblText.setText("You choose Fiery");
					break;
				case "Message 7" : lblText.setText("You choose Hell");
					break;
				default: lblText.setText("Error");
			}
		}
	}
}
