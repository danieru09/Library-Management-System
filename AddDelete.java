package LibrarySystem;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddDelete {

    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTable table;
    private Library library; // Create Library object

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AddDelete window = new AddDelete();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public AddDelete() {
        library = new Library(); // Initialize the library
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 1188, 617);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(393, 193, 769, 262);
        frame.getContentPane().add(scrollPane);

        table = new JTable();
        table.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 11));
        scrollPane.setViewportView(table);
        table.setModel(new DefaultTableModel(
            new Object[][] {
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

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1172, 83);
        panel.setBackground(new Color(102, 102, 205));
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("MANAGE BOOKS");
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 25));
        lblNewLabel_1.setBounds(918, 30, 190, 29);
        panel.add(lblNewLabel_1);

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(102, 102, 205));
        panel_2.setBounds(0, 0, 108, 47);
        panel.add(panel_2);
        panel_2.setLayout(null);

        JButton btnNewButton = new JButton("BACK");
        btnNewButton.setForeground(new Color(0, 0, 0));
        btnNewButton.setBackground(new Color(255, 255, 255));
        btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
        btnNewButton.setBounds(10, 11, 89, 23);
        panel_2.add(btnNewButton);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(51, 51, 51));
        panel_1.setBounds(0, 80, 383, 498);
        frame.getContentPane().add(panel_1);
        panel_1.setLayout(null);

        JPanel panel_3 = new JPanel();
        panel_3.setBackground(new Color(51, 51, 51));
        panel_3.setBounds(34, 63, 264, 59);
        panel_1.add(panel_3);
        panel_3.setLayout(null);

        textField = new JTextField();
        textField.setBounds(49, 28, 205, 20);
        panel_3.add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel = new JLabel("ENTER BOOK ID :");
        lblNewLabel.setBounds(55, 3, 112, 14);
        panel_3.add(lblNewLabel);
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));

        JPanel panel_3_1 = new JPanel();
        panel_3_1.setLayout(null);
        panel_3_1.setBackground(new Color(51, 51, 51));
        panel_3_1.setBounds(34, 154, 264, 59);
        panel_1.add(panel_3_1);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(49, 28, 205, 20);
        panel_3_1.add(textField_1);

        JLabel lblNewLabel_5 = new JLabel("ENTER BOOK NAME :");
        lblNewLabel_5.setForeground(Color.WHITE);
        lblNewLabel_5.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
        lblNewLabel_5.setBounds(55, 3, 144, 14);
        panel_3_1.add(lblNewLabel_5);

        JPanel panel_3_2 = new JPanel();
        panel_3_2.setLayout(null);
        panel_3_2.setBackground(new Color(51, 51, 51));
        panel_3_2.setBounds(34, 232, 264, 59);
        panel_1.add(panel_3_2);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(49, 28, 205, 20);
        panel_3_2.add(textField_2);

        JLabel lblNewLabel_6 = new JLabel("ENTER AUTHOR :");
        lblNewLabel_6.setForeground(Color.WHITE);
        lblNewLabel_6.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 15));
        lblNewLabel_6.setBounds(55, 3, 129, 14);
        panel_3_2.add(lblNewLabel_6);

        JButton btnNewButton_1 = new JButton("ADD");
        btnNewButton_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
        btnNewButton_1.setBackground(new Color(255, 255, 255));
        btnNewButton_1.setBounds(114, 309, 89, 23);
        panel_1.add(btnNewButton_1);

        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String bookId = textField.getText();
                String bookName = textField_1.getText();
                String authorName = textField_2.getText();

                // Add the book
                library.addBook(bookName, authorName);

                // Update the table to reflect the new book
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.insertRow(0, new Object[] { bookId, bookName, authorName });

                // Clear input fields
                textField.setText("");
                textField_1.setText("");
                textField_2.setText("");
            }
        });

        // Delete Book Button
        JButton btnDelete = new JButton("DELETE");
        btnDelete.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
        btnDelete.setBackground(new Color(255, 255, 255));
        btnDelete.setBounds(114, 360, 89, 23);
        panel_1.add(btnDelete);

        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String bookId = textField.getText();
                
                // Remove the book using the removeBook method
                try {
                    int id = Integer.parseInt(bookId);
                    library.removeBook(id);

                    // Remove the book from the table
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    for (int i = 0; i < model.getRowCount(); i++) {
                        if (model.getValueAt(i, 0).equals(bookId)) {
                            model.removeRow(i);
                            break;
                        }
                    }

                    // Clear input fields
                    textField.setText("");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid book ID entered!");
                }
            }
        });
    }
}
