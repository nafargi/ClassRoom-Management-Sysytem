import javax.swing.JOptionPane;

public class CreateCourse extends javax.swing.JFrame {

    public CreateCourse() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        // Initialize components here
    }

    private void jButtonCreateCourseActionPerformed(java.awt.event.ActionEvent evt) {
        // Add functionality to create course
        String courseName = JOptionPane.showInputDialog("Enter Course Name:");
        // Save course to database
        JOptionPane.showMessageDialog(this, "Course " + courseName + " created successfully!");
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateCourse().setVisible(true);
            }
        });
    }
}
