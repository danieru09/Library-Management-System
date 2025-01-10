package Admin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class AddUser {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddUser window = new AddUser();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddUser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1188, 617);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1172, 578);
		panel.setBackground(new Color(102, 102, 205));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(1103, 29, 46, 30);
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Person.png"));
		panel.add(lblNewLabel_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setBounds(121, 74, 306, 430);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Mind Sphere");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(30, 10, 258, 117);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1.setBounds(30, 128, 71, 21);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1_1.setBounds(30, 177, 71, 21);
		panel_1.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBounds(111, 129, 147, 19);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(111, 178, 147, 19);
		panel_1.add(textField_1);
		
		JButton btnNewButton = new JButton("Add User");
		btnNewButton.setBounds(141, 207, 95, 21);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setBounds(10, 368, 85, 21);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("ADD");
		lblNewLabel_2.setForeground(new Color(255, 128, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_2.setBounds(865, 186, 250, 51);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("USER");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_2_1.setForeground(new Color(128, 128, 255));
		lblNewLabel_2_1.setBounds(889, 247, 250, 51);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_5 = new JLabel("libraryniMingmong");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 65));
		lblNewLabel_5.setBounds(482, 432, 657, 87);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_3 = new JLabel("libraryniMingMong");
		lblNewLabel_3.setBounds(52, 39, 1063, 498);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\bg2.png"));
	}
}