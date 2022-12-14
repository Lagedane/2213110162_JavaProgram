package comboboxexample;

import java.awt.event.*;
import java.sql.*;
import java.util.HashSet;
import java.util.Iterator;
import javax.swing.*;

public class EditableComboBox implements ActionListener {

	String[] msgStrings = {"No Spice", "Mild", "Medium", "Hot", "Extra Hot", "Fiery", "Hell"};
	String msgVolume ="";
	JComboBox msgList;
	JButton button;
	
	private void createUI()
	{
		
	JFrame frame = new JFrame("Rush Dish");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	frame.setLayout(null); 

	JLabel label = new JLabel("How spicy level would you like : ");
	button = new JButton("Insert");
	button.addActionListener(this);
	label.setBounds(50, 50, 150, 20);
	label.setSize(300, 20);
	button.setBounds(50, 150, 95, 30);
	msgList = new JComboBox(msgStrings);

	msgList.setBounds(50, 100, 250, 20);
	msgList.setSelectedIndex(0); 

	frame.add(button);
	frame.add(label);
	frame.add(msgList);

	frame.setVisible(true);
	frame.setSize(450, 300); 
	}
	
	public void actionPerformed(ActionEvent e){

		HashSet set = new HashSet();
		if(e.getSource() == button)
		{
		String[] newList = new String[msgStrings.length+1];
		msgVolume = (String)msgList.getSelectedItem();
		int i = 0;
		while(i < msgStrings.length)
			{
				newList[i]= msgStrings[i];
				set.add(newList[i]); 
				i++;
			}
		newList[i] = msgVolume;
		set.add(newList[i]); 
		Iterator itr = set.iterator();
		while(itr.hasNext())
			{
				String s = (String) itr.next(); 
				if(msgVolume.equals(s))
					{
					addOperation();
					}
			} 
		msgList.setEditable(true);
		}
	}
	private void addOperation()
	{
		try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con = DriverManager.getConnection("jdbc:odbc:swing");
				String sql = "INSERT INTO PetTable(petName) Values('"+msgVolume+"')";
				Statement st = con.createStatement();
				st.execute(sql);
				JOptionPane.showMessageDialog(null, "Record Added Succesfully.","Record Added",
				JOptionPane.INFORMATION_MESSAGE);
			}
		catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, e.getMessage(),"Error",
				JOptionPane.ERROR_MESSAGE);
			}
	}
	public static void main(String[] args) {
		EditableComboBox gvb = new EditableComboBox();
		gvb.createUI();
	}

}
