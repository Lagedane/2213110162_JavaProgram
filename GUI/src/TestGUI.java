import java.awt.*;
import javax.swing.*;

public class TestGUI extends JFrame{
	
	private static final int WIDTH = 400;
	private static final int HEIGHT = 300;
	//Components
	private JLabel lblLength, lblWidth, lblArea, lblPerimeter;
	private JTextField txtLength, txtWidth, txtArea, txtPerimeter;
	
	//Constructor Method
	public TestGUI(){
		setTitle("Area and Paramiter");
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Properties for Components
		lblLength = new JLabel("Enter the Length: ", SwingConstants.RIGHT);
		lblWidth = new JLabel("Enter the Width: ", SwingConstants.RIGHT);
		lblArea = new JLabel("Area: ", SwingConstants.RIGHT);
		lblPerimeter = new JLabel("Perimeter: ", SwingConstants.RIGHT);
		//TextFields
		/* txtLength = new JTextField(10);
		 * txtWidth = new JTextField(10);
		 * txtArea = new JTextField(10);
		 * txtPerimeter = new JTextField(10);*/
		
		GridLayout L = new GridLayout(4, 1);
		setLayout(L);
		
		//Add Components
		add(lblLength); 	//add(txtLength);
		add(lblWidth); 		//add(txtWidth);
		add(lblArea); 		//add(txtWidth);
		add(lblPerimeter);	//add(txtWidth);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGUI prog = new TestGUI();

	}

}
