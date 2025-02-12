package demo.day1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class BorrowBook extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BorrowBook frame = new BorrowBook();
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
	public BorrowBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(70, 70, 1200, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		contentPane.setBackground(Color.GRAY); 

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BORROW");
		lblNewLabel.setBounds(847, 95, 112, 47);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		contentPane.add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("UserName:");
		lblUsername.setBounds(798, 335, 112, 14);
		lblUsername.setForeground(new Color(0, 0, 255));
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblUsername);
		
		JLabel lblBookName = new JLabel("Book Name:");
		lblBookName.setBounds(798, 281, 112, 14);
		lblBookName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblBookName.setForeground(new Color(0, 0, 255));
		contentPane.add(lblBookName);
		
		textField = new JTextField();
		textField.setBounds(920, 327, 197, 33);
		textField.setBackground(new Color(255, 255, 128));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(920, 273, 197, 33);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(255, 255, 128));
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("BORROW BOOK");
		btnNewButton.setBounds(955, 401, 151, 23);
		btnNewButton.setBackground(new Color(0, 0, 255));
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(btnNewButton);
		
		JButton btnReturnBook = new JButton("RETURN BOOK");
		btnReturnBook.setBounds(957, 449, 149, 23);
		btnReturnBook.setForeground(Color.RED);
		btnReturnBook.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnReturnBook.setBackground(Color.BLUE);
		contentPane.add(btnReturnBook);
		
		JLabel lblNewLabel_1 = new JLabel("&");
		lblNewLabel_1.setBounds(945, 126, 70, 47);
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblReturn = new JLabel("RETURN");
		lblReturn.setBounds(955, 152, 112, 47);
		lblReturn.setForeground(Color.RED);
		lblReturn.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblReturn);
		
		JLabel lblBook = new JLabel("BOOK");
		lblBook.setBounds(1044, 185, 93, 47);
		lblBook.setForeground(Color.RED);
		lblBook.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblBook);
		
		JButton btnNewButton_1 = new JButton("CLOSE");
		btnNewButton_1.setBounds(1044, 529, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("WELCOME");
		lblNewLabel_2.setBounds(213, 95, 220, 81);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 37));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("MIND SPHERE'S");
		lblNewLabel_2_1.setBounds(154, 242, 319, 75);
		lblNewLabel_2_1.setForeground(new Color(0, 128, 255));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 39));
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("RETURN");
		lblNewLabel_2_2.setBounds(248, 417, 182, 75);
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 28));
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3 = new JLabel("TO");
		lblNewLabel_3.setBounds(273, 181, 49, 47);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 29));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("BORROW");
		lblNewLabel_2_2_1.setBounds(236, 318, 182, 75);
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 28));
		contentPane.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("&");
		lblNewLabel_3_1.setBounds(288, 382, 49, 47);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 29));
		contentPane.add(lblNewLabel_3_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(790, 93, 347, 399);
		contentPane.add(panel);
		panel.setLayout(null);

	}
}
