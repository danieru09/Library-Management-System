package Admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.UIManager;

public class AdminDashboard extends JFrame {

	private JFrame frame;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDashboard window = new AdminDashboard();
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
	public AdminDashboard() {
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
		panel.setBounds(0, 0, 1172, 83);
		panel.setBackground(new Color(102, 102, 205));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mind Sphere");
		lblNewLabel.setIcon(null);
		lblNewLabel.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 30));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(130, 22, 180, 38);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome, Admin");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 25));
		lblNewLabel_1.setBounds(918, 30, 190, 29);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\Person.png"));
		lblNewLabel_4.setBounds(1103, 29, 46, 30);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\mssmall.png"));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(10, 10, 90, 63);
		panel.add(lblNewLabel_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(102, 102, 205));
		panel_3.setBounds(294, 107, 241, 447);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(51, 51, 51));
		panel_4.setBounds(43, 38, 147, 45);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("ENTER BOOK ID : ");
		lblNewLabel_5.setBounds(0, 0, 120, 14);
		panel_4.add(lblNewLabel_5);
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		
		textField = new JTextField();
		textField.setBounds(0, 25, 147, 20);
		panel_4.add(textField);
		textField.setColumns(10);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBackground(new Color(51, 51, 51));
		panel_4_1.setBounds(43, 122, 147, 45);
		panel_3.add(panel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("ENTER BOOK NAME: ");
		lblNewLabel_5_1.setForeground(Color.WHITE);
		lblNewLabel_5_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		lblNewLabel_5_1.setBounds(0, 0, 147, 14);
		panel_4_1.add(lblNewLabel_5_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(0, 25, 147, 20);
		panel_4_1.add(textField_1);
		
		JPanel panel_4_2 = new JPanel();
		panel_4_2.setLayout(null);
		panel_4_2.setBackground(new Color(51, 51, 51));
		panel_4_2.setBounds(43, 214, 147, 45);
		panel_3.add(panel_4_2);
		
		JLabel lblNewLabel_5_2 = new JLabel("ENTER BOOK AUTHOR");
		lblNewLabel_5_2.setForeground(Color.WHITE);
		lblNewLabel_5_2.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		lblNewLabel_5_2.setBounds(0, 0, 147, 14);
		panel_4_2.add(lblNewLabel_5_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(0, 25, 147, 20);
		panel_4_2.add(textField_2);
		
		JButton btnNewButton_2_1_1 = new JButton("ADD");
		btnNewButton_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_2_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_2_1_1.setBackground(new Color(51, 51, 51));
		btnNewButton_2_1_1.setBounds(43, 344, 66, 23);
		panel_3.add(btnNewButton_2_1_1);
		
		JButton btnNewButton_2_1 = new JButton("DELETE");
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_2_1.setBackground(new Color(51, 51, 51));
		btnNewButton_2_1.setForeground(new Color(255, 255, 255));
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_1.setBounds(124, 344, 66, 23);
		panel_3.add(btnNewButton_2_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 80, 256, 498);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(new Color(0, 0, 0));
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(0, 35, 256, 60);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("HomePage");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\home.png"));
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 25));
		lblNewLabel_2.setBounds(64, 11, 161, 38);
		panel_2.add(lblNewLabel_2);
		
		JButton btnMember = new JButton("Add User");
		btnMember.setForeground(new Color(255, 255, 255));
		btnMember.setBackground(new Color(51, 51, 51));
		btnMember.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\member-list.png"));
		btnMember.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		btnMember.setBounds(48, 182, 154, 38);
		panel_1.add(btnMember);
		
				btnMember.addActionListener(new ActionListener() {
				    @Override
				    public void actionPerformed(ActionEvent e) {
				        // Create an instance of AddUser and display it
				        AddUser addUser = new AddUser();
				        addUser.setVisible(true); // Assuming AddUser extends JFrame
		
				        // Dispose of the current AdminDashboard frame
				        dispose();
				    }
				});
		
		JLabel lblNewLabel_2_1_1 = new JLabel("FEATURES");
		lblNewLabel_2_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 25));
		lblNewLabel_2_1_1.setBounds(10, 182, 139, 38);
		panel_1.add(lblNewLabel_2_1_1);
		
		JButton btnIssueBook = new JButton("Search Book\r\n");
		btnIssueBook.setForeground(new Color(255, 255, 255));
		btnIssueBook.setBackground(new Color(51, 51, 51));
		btnIssueBook.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\books tagilid.png"));
		btnIssueBook.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		btnIssueBook.setBounds(48, 355, 154, 38);
		panel_1.add(btnIssueBook);
		
		JButton btnNewButton_1 = new JButton("LOG OUT");
		btnNewButton_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1.setBounds(10, 464, 89, 23);
		panel_1.add(btnNewButton_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(120, 105, 115, 19);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(120, 145, 115, 19);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("User Email:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(25, 110, 80, 13);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("User Name: ");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(25, 145, 85, 13);
		panel_1.add(lblNewLabel_7);
		
		JButton btnBorrowBook = new JButton("Borrow Book\r\n");
		btnBorrowBook.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\books tagilid.png"));
		btnBorrowBook.setForeground(Color.WHITE);
		btnBorrowBook.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		btnBorrowBook.setBackground(new Color(51, 51, 51));
		btnBorrowBook.setBounds(48, 307, 154, 38);
		panel_1.add(btnBorrowBook);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(573, 107, 571, 447);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, "", null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"BOOK ID", "NAME", "AUTHOR"
			}
		));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(51, 51, 51));
		panel_5.setBounds(253, 85, 921, 493);
		frame.getContentPane().add(panel_5);

		btnIssueBook.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        // Create an instance of userinfo and display it
		        userinfo userInfoFrame = new userinfo();
		        userInfoFrame.setVisible(true); // Assuming userinfo extends JFrame
		        
		        // Dispose of the current AdminDashboard frame
		        dispose();
		    }
		});

		
		


		
		
		
		
		
	}
}