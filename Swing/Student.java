import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student extends JFrame {

    private JTable attendanceTable;
    private JTextField studentNameField;
    private DefaultTableModel tableModel;

    public Student() {
        // Set up the frame
        setTitle("Student Attendance Manager");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Set up the layout
        setLayout(new BorderLayout());

        // Create the header panel
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(70, 150, 180));
        JLabel headerLabel = new JLabel("CHINMAY INGALE");
        headerLabel.setForeground(Color.WHITE);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        headerPanel.add(headerLabel);
        add(headerPanel, BorderLayout.NORTH);

        // Create the table model and table
        tableModel = new DefaultTableModel(new String[]{"Student Name", "Present"}, 0);
        attendanceTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(attendanceTable);
        add(scrollPane, BorderLayout.CENTER);

        // Create the input panel
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(2, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel nameLabel = new JLabel("Student Name:");
        studentNameField = new JTextField();
        inputPanel.add(nameLabel);
        inputPanel.add(studentNameField);

        // Add buttons
        JButton addButton = new JButton("Add Student");
        addButton.setBackground(new Color(60, 179, 113)); // Medium Sea Green
        addButton.setForeground(Color.WHITE);
        JButton markPresentButton = new JButton("Mark Present");
        markPresentButton.setBackground(new Color(255, 165, 0)); // Orange
        markPresentButton.setForeground(Color.WHITE);

        inputPanel.add(addButton);
        inputPanel.add(markPresentButton);

        add(inputPanel, BorderLayout.SOUTH);

        // Add functionality to buttons
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String studentName = studentNameField.getText();
                if (!studentName.isEmpty()) {
                    tableModel.addRow(new Object[]{studentName, "Absent"});
                    studentNameField.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter a student name.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        markPresentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = attendanceTable.getSelectedRow();
                if (selectedRow != -1) {
                    tableModel.setValueAt("Present", selectedRow, 1);
                } else {
                    JOptionPane.showMessageDialog(null, "Please select a student to mark present.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Student().setVisible(true);
            }
        });
    }
}
