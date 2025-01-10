package demo.day1;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class User {
    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    User window = new User();
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
    public User() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 713, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Email:");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel.setForeground(new Color(0, 0, 255));
        lblNewLabel.setBounds(310, 195, 115, 35);
        frame.getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Name:");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel_1.setForeground(new Color(0, 0, 255));
        lblNewLabel_1.setBounds(310, 135, 82, 14);
        frame.getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel_1_1 = new JLabel("Finished Book:");
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel_1_1.setForeground(new Color(0, 0, 255));
        lblNewLabel_1_1.setBounds(310, 269, 115, 14);
        frame.getContentPane().add(lblNewLabel_1_1);

        textField = new JTextField();
        textField.setBackground(new Color(255, 255, 128));
        textField.setBounds(435, 134, 194, 20);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBackground(new Color(255, 255, 128));
        textField_1.setColumns(10);
        textField_1.setBounds(435, 204, 194, 20);
        frame.getContentPane().add(textField_1);
        
        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBackground(new Color(255, 255, 128));
        textField_2.setBounds(435, 268, 194, 20);
        frame.getContentPane().add(textField_2);

        JButton btnNewButton = new JButton("SAVE");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnNewButton.setForeground(new Color(0, 0, 255));
        btnNewButton.setBackground(new Color(255, 128, 64));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add your save logic here
            }
        });
        btnNewButton.setBounds(435, 317, 89, 23);
        frame.getContentPane().add(btnNewButton);

        JButton btnClose = new JButton("CLOSE");
        btnClose.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnClose.setForeground(new Color(0, 0, 255));
        btnClose.setBackground(new Color(255, 128, 64));
        btnClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close the window when CLOSE button is clicked
            }
        });
        btnClose.setBounds(540, 317, 89, 23);
        frame.getContentPane().add(btnClose);
        
    }
}
