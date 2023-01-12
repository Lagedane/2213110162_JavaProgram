import java.awt.EventQueue;
import java.text.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.server.Operation;

import javax.swing.JTextField;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.Toolkit;

public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumber1;
	private JTextField txtNumber2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculateTwoNumber() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\เดี๋ยวลบ\\ehe.jpg"));
		setTitle("CalculateTwoNumber");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 508, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNo1 = new JLabel("Enter Number 1");
		lblNo1.setFont(new Font("Cascadia Mono", Font.PLAIN, 16));
		lblNo1.setBounds(23, 24, 146, 29);
		contentPane.add(lblNo1);
		
		txtNumber1 = new JTextField();
		txtNumber1.setBounds(227, 30, 125, 22);
		contentPane.add(txtNumber1);
		txtNumber1.setColumns(10);
		
		JLabel lblNo2 = new JLabel("Enter Number 2");
		lblNo2.setFont(new Font("Cascadia Mono", Font.PLAIN, 16));
		lblNo2.setBounds(23, 65, 146, 13);
		contentPane.add(lblNo2);
		
		txtNumber2 = new JTextField();
		txtNumber2.setBounds(227, 63, 125, 22);
		contentPane.add(txtNumber2);
		txtNumber2.setColumns(10);
		
		final JLabel lblResult = new JLabel("Result");
		lblResult.setForeground(new Color(220, 20, 60));
		lblResult.setFont(new Font("Cascadia Mono", Font.BOLD, 22));
		lblResult.setBounds(229, 262, 88, 22);
		contentPane.add(lblResult);
		
		final JLabel lblOpera = new JLabel("Operator");
		lblOpera.setFont(new Font("Cascadia Mono", Font.PLAIN, 16));
		lblOpera.setBounds(23, 95, 125, 22);
		contentPane.add(lblOpera);
		
		final JComboBox chOpera = new JComboBox();
		chOpera.setFont(new Font("Cascadia Mono", Font.PLAIN, 16));
		chOpera.setBounds(227, 96, 125, 21);
		chOpera.addItem("+");
		chOpera.addItem("-");
		chOpera.addItem("*");
		chOpera.addItem("/");
		contentPane.add(chOpera);

		JLabel lblDigit = new JLabel("How to show digit");
		lblDigit.setFont(new Font("Cascadia Mono", Font.PLAIN, 16));
		lblDigit.setBounds(23, 127, 178, 29);
		contentPane.add(lblDigit);
		
		final JRadioButton rdbtn1digit = new JRadioButton("1 digit");
		rdbtn1digit.setFont(new Font("Cascadia Mono", Font.PLAIN, 16));
		rdbtn1digit.setBounds(227, 133, 103, 21);
		contentPane.add(rdbtn1digit);
		
		final JRadioButton rdbtn2digit = new JRadioButton("2 digit");
		rdbtn2digit.setFont(new Font("Cascadia Mono", Font.PLAIN, 16));
		rdbtn2digit.setBounds(227, 161, 103, 21);
		contentPane.add(rdbtn2digit);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtn1digit);
		group.add(rdbtn2digit);
		
		JLabel lbloption = new JLabel("Option to show");
		lbloption.setFont(new Font("Cascadia Mono", Font.PLAIN, 16));
		lbloption.setBounds(23, 194, 146, 29);
		contentPane.add(lbloption);
		
		final JCheckBox chkDialogBox = new JCheckBox("Show result at DialogBox");
		chkDialogBox.setFont(new Font("Cascadia Mono", Font.PLAIN, 16));
		chkDialogBox.setBounds(227, 200, 273, 21);
		contentPane.add(chkDialogBox);
		
		final JButton btnOK = new JButton("OK");
		btnOK.setFont(new Font("Cascadia Mono", Font.PLAIN, 16));
		btnOK.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1, num2, sum = 0;
				String operator;
				if(e.getSource() == btnOK) {
					num1 = Double.parseDouble(txtNumber1.getText());
					num2 = Double.parseDouble(txtNumber2.getText());
					operator = (String)chOpera.getSelectedItem();
					//JComboBox
					if(operator.equals("+"))
					 sum = num1 + num2;
					if(operator.equals("-"))
						 sum = num1 - num2;
					if(operator.equals("*"))
						 sum = num1 * num2;
					if(operator.equals("/"))
						 sum = num1 / num2;
					
					//JRadioButton
					DecimalFormat frmNumber = null;
					if(rdbtn1digit.isSelected()) {
						frmNumber = new DecimalFormat("#,###.0");
					}
					else if(rdbtn2digit.isSelected()) {
						frmNumber = new DecimalFormat("#,###.00");
					}
					
					lblResult.setText(frmNumber.format(sum));
					
					if(chkDialogBox.isSelected()) {
						JOptionPane.showMessageDialog(null, "Result is : " + frmNumber.format(sum));
					}
				}
			}
		});
		btnOK.setBounds(120, 400, 93, 29);
		contentPane.add(btnOK);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Cascadia Mono", Font.PLAIN, 16));
		btnExit.setBounds(248, 400, 93, 29);
		contentPane.add(btnExit);

	}
}
