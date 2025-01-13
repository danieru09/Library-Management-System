package LibrarySystem;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class SearchBook extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable table;
    private JTextField textField;
    private DefaultTableModel adminTableModel; // Reference to AdminDashboard's table model

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                SearchBook frame = new SearchBook(null); // Placeholder null for standalone testing
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the frame.
     */
    public SearchBook(DefaultTableModel adminTableModel) {
        this.adminTableModel = adminTableModel;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 317, 463);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 301, 447);
        contentPane.add(panel);
        panel.setLayout(null);

        JButton btnNewButton = new JButton("Search");
        btnNewButton.setBounds(109, 307, 89, 23);
        panel.add(btnNewButton);

        textField = new JTextField();
        textField.setBounds(45, 270, 217, 20);
        panel.add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("Title of the Book");
        lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 21));
        lblNewLabel_1.setBounds(69, 239, 166, 20);
        panel.add(lblNewLabel_1);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(45, 45, 217, 183);
        panel.add(scrollPane);

        table = new JTable();
        scrollPane.setViewportView(table);
        table.setModel(new DefaultTableModel(
            new Object[][] {},
            new String[] { "Title of the Book", "Author" }
        ));

        // Button Action: Search Books
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                searchBooks();
            }
        });
    }

    /**
     * Search for books based on the entered title.
     */
    private void searchBooks() {
        String searchTerm = textField.getText().trim().toLowerCase();

        if (searchTerm.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a book title to search.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel searchTableModel = (DefaultTableModel) table.getModel();
        searchTableModel.setRowCount(0); // Clear existing rows

        if (adminTableModel != null) {
            for (int i = 0; i < adminTableModel.getRowCount(); i++) {
                String title = adminTableModel.getValueAt(i, 1).toString().toLowerCase();
                String author = adminTableModel.getValueAt(i, 2).toString();

                if (title.contains(searchTerm)) {
                    searchTableModel.addRow(new Object[] { title, author });
                }
            }

            if (searchTableModel.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "No books found matching the title.", "No Results", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No book data available.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
