package Admin;

import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.JLayeredPane;
import javax.swing.JComboBox;

public class Search extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search frame = new Search();
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
	public Search() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1187, 635);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 51, 51));
		panel.setBounds(10, 80, 383, 508);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton Back = new JButton("BACK");
		Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Back.setBounds(30, 444, 85, 21);
		panel.add(Back);
		
		JButton btnNewButton = new JButton("SEARCH");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(136, 319, 85, 21);
		panel.add(btnNewButton);
		
		JPanel panel_3_3 = new JPanel();
		panel_3_3.setLayout(null);
		panel_3_3.setBackground(new Color(51, 51, 51));
		panel_3_3.setBounds(40, 136, 264, 59);
		panel.add(panel_3_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(49, 28, 205, 20);
		panel_3_3.add(textField_2);
		
		JLabel lblNewLabel_7 = new JLabel("ENTER AUTHOR NAME:");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(55, 3, 158, 14);
		panel_3_3.add(lblNewLabel_7);
		
		JLabel lblNewLabel_2_3 = new JLabel("");
		lblNewLabel_2_3.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\id-badge (2).png"));
		lblNewLabel_2_3.setForeground(Color.WHITE);
		lblNewLabel_2_3.setBounds(10, 11, 29, 44);
		panel_3_3.add(lblNewLabel_2_3);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBounds(40, 40, 264, 59);
		panel.add(panel_3_1);
		panel_3_1.setLayout(null);
		panel_3_1.setBackground(new Color(51, 51, 51));
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(49, 28, 205, 20);
		panel_3_1.add(textField);
		
		JLabel lblNewLabel = new JLabel("ENTER BOOK NAME:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		lblNewLabel.setBounds(55, 3, 134, 15);
		panel_3_1.add(lblNewLabel);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\id-badge (2).png"));
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setBounds(10, 11, 29, 44);
		panel_3_1.add(lblNewLabel_2_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(40, 235, 264, 59);
		panel.add(panel_3);
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(51, 51, 51));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(49, 28, 205, 20);
		panel_3.add(textField_1);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER BOOK ID: ");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(55, 3, 129, 14);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\id-badge (2).png"));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(10, 11, 29, 44);
		panel_3.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(392, 80, 781, 508);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(124, 78, 266, 354);
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("BOOK NAME:");
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lblNewLabel_3.setBounds(417, 98, 134, 15);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ENTER BOOK NAME:");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(430, 98, 134, 15);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel(" AUTHOR NAME:");
		lblNewLabel_5.setForeground(new Color(0, 0, 0));
		lblNewLabel_5.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lblNewLabel_5.setBounds(417, 223, 134, 15);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_1_1 = new JLabel(" BOOK ID: ");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(417, 343, 129, 14);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(427, 123, 45, 13);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(437, 248, 45, 13);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setBounds(437, 367, 45, 13);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_3_1 = new JLabel("AVAILABILITY:");
		lblNewLabel_3_1.setForeground(Color.BLACK);
		lblNewLabel_3_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(637, 102, 134, 15);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_10 = new JLabel("TRUE OR FALSE");
		lblNewLabel_10.setBounds(637, 123, 92, 27);
		panel_1.add(lblNewLabel_10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(102, 102, 205));
		panel_2.setBounds(10, -10, 1163, 90);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("Mind Sphere");
		lblNewLabel_11.setIcon(null);
		lblNewLabel_11.setForeground(Color.WHITE);
		lblNewLabel_11.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 30));
		lblNewLabel_11.setBounds(90, 28, 220, 38);
		panel_2.add(lblNewLabel_11);
	}
}
