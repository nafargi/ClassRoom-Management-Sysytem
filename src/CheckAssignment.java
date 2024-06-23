import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckAssignment extends JFrame {

    private JLabel labelAssignment;
    private JTextField textFieldAssignmentName;
    private JButton buttonCheck;

    public CheckAssignment() {
        initComponents();
        setupUI();
        setupListeners();
        setTitle("Check Assignment");
        setSize(400, 200);
        setLocationRelativeTo(null); // Center the frame on screen
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close only this window on close
    }

    private void initComponents() {
        labelAssignment = new JLabel("Assignment Name:");
        textFieldAssignmentName = new JTextField(20);
        buttonCheck = new JButton("Check Assignment");
    }

    private void setupUI() {
        JPanel panel = new JPanel();
        panel.add(labelAssignment);
        panel.add(textFieldAssignmentName);
        panel.add(buttonCheck);

        add(panel, BorderLayout.CENTER);
    }

    private void setupListeners() {
        buttonCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String assignmentName = textFieldAssignmentName.getText().trim();
                // Example logic to check assignment
                if (assignmentName.isEmpty()) {
                    JOptionPane.showMessageDialog(CheckAssignment.this, "Please enter assignment name.");
                } else {
                    // Replace this with your actual logic to check the assignment
                    JOptionPane.showMessageDialog(CheckAssignment.this, "Checking assignment: " + assignmentName);
                }
            }
        });
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckAssignment().setVisible(true);
            }
        });
    }
}
