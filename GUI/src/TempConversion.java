import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TempConversion extends JFrame{
	//Components
	private JLabel lblCelcius;
	private JLabel lblFahrenheit;
	
	private JTextField tfCelcius;
	private JTextField tfFahrenheit;
	
	private static final int WIDTH = 500;
	private static final int HEIGHT = 80;
	private static final double FTOC = 5.0/9.0;
	private static final double CTOF = 9.0/5.0;
	private static final int OFFSET = 32;
	
	//Constructor Method
	public TempConversion(){
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 4));
		
		lblCelcius = new JLabel("Temp in Celcius: ", SwingConstants.RIGHT);
		lblFahrenheit = new JLabel("Temp in Fahrenheit: ", SwingConstants.RIGHT);
		
		tfCelcius = new JTextField(10);
		tfFahrenheit = new JTextField(10);
		
		//Add Components
		c.add(lblCelcius); 		c.add(tfCelcius);
		c.add(lblFahrenheit);	c.add(tfFahrenheit);
		
		CelsHandler celciusHandler = new CelsHandler();
		FahrHandler  fahrenheitHandler = new FahrHandler();
		tfCelcius.addActionListener(celciusHandler);
		tfFahrenheit.addActionListener(fahrenheitHandler);

		setTitle("Temperature Conversion");
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	
	private class CelsHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			double celcius, fahrenheit;
			celcius = Double.parseDouble(tfCelcius.getText());
			fahrenheit = (celcius * CTOF) + OFFSET;
			tfFahrenheit.setText(String.format("%.2f", fahrenheit));
		}
	}
	
	private class FahrHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			double celcius, fahrenheit;
			fahrenheit = Double.parseDouble(tfFahrenheit.getText());
			celcius = (fahrenheit - OFFSET) * FTOC;
			tfCelcius.setText(String.format("%.2f", celcius));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TempConversion tempConv = new TempConversion();
	}

}
