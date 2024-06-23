import javax.swing.JOptionPane;

public class AddStudent extends javax.swing.JFrame {

    public AddStudent() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        // Initialize components here
    }

    private void jButtonAddStudentActionPerformed(java.awt.event.ActionEvent evt) {
        // Add functionality to add student to course
        String studentName = JOptionPane.showInputDialog("Enter Student Name:");
        String courseName = JOptionPane.showInputDialog("Enter Course Name:");
        // Add student to course in database
        JOptionPane.showMessageDialog(this, "Student " + studentName + " added to course " + courseName + " successfully!");
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudent().setVisible(true);
            }
        });
    }
}
