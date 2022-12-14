package comboboxexample;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboExample extends JPanel implements ActionListener {
	
	static JLabel label = new JLabel();
	JLabel picture;
	
    public ComboExample() {
        super(new BorderLayout());
        String[] msgStrings = {"No Spice", "Mild", "Medium", "Hot", "Extra Hot", "Fiery", "Hell"};
        
        JComboBox petList = new JComboBox(msgStrings);
        petList.setSelectedIndex(0);
        petList.addActionListener(this);
 
        //Set up the picture.
        picture = new JLabel();
        picture.setFont(picture.getFont().deriveFont(Font.ITALIC));
        picture.setHorizontalAlignment(JLabel.CENTER);
        //updateLabel(petStrings[petList.getSelectedIndex()]);
        picture.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
 
        picture.setPreferredSize(new Dimension(400, 300));
		
 
        //Lay out the demo.
        add(petList, BorderLayout.PAGE_START);
        add(picture, BorderLayout.PAGE_END);
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
    }
 
    /** Listens to the combo box. */
    public void actionPerformed(ActionEvent e) {
        JComboBox cb = (JComboBox)e.getSource();
        String spicyLevel = (String)cb.getSelectedItem();
    }
 

    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Rush Dish");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label.setText("How spicy would you like that?");

        //Create and set up the content pane.
        JComponent newContentPane = new ComboExample();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
       
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}