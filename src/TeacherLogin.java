
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import project.ConnectionProvider;

public class TeacherLogin extends javax.swing.JFrame {

    public TeacherLogin() {
        initComponents();
        jLabelINVALID1.setVisible(false);
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldEmail1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPasswordFieldPassword1 = new javax.swing.JPasswordField();
        jButtonLogin1 = new javax.swing.JButton();
        jCheckBoxSHOW1 = new javax.swing.JCheckBox();
        jLabelINVALID1 = new javax.swing.JLabel();
        jButtonForgetpassword1 = new javax.swing.JButton();
        jButtonHOME = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 204));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sign in new.png"))); // NOI18N
        jLabel4.setText("Teacher Login ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 153));
        jLabel5.setText("Email");

        jTextFieldEmail1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldEmail1.setForeground(new java.awt.Color(153, 0, 153));
        jTextFieldEmail1.setText("Email");
        jTextFieldEmail1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldEmail1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldEmail1FocusLost(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 153));
        jLabel6.setText("Password");

        jPasswordFieldPassword1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPasswordFieldPassword1.setForeground(new java.awt.Color(153, 0, 153));
        jPasswordFieldPassword1.setText("Password");
        jPasswordFieldPassword1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldPassword1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldPassword1FocusLost(evt);
            }
        });

        jButtonLogin1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonLogin1.setForeground(new java.awt.Color(153, 0, 153));
        jButtonLogin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/small login.png"))); // NOI18N
        jButtonLogin1.setText("Login");
        jButtonLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogin1ActionPerformed(evt);
            }
        });

        jCheckBoxSHOW1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBoxSHOW1.setForeground(new java.awt.Color(153, 0, 153));
        jCheckBoxSHOW1.setText("Show Password");
        jCheckBoxSHOW1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSHOW1ActionPerformed(evt);
            }
        });

        jLabelINVALID1.setBackground(new java.awt.Color(255, 0, 51));
        jLabelINVALID1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelINVALID1.setForeground(new java.awt.Color(204, 51, 0));
        jLabelINVALID1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jLabelINVALID1.setText("Email/Password is invalid");

        jButtonForgetpassword1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonForgetpassword1.setForeground(new java.awt.Color(204, 0, 51));
        jButtonForgetpassword1.setText("Forget Password?");

        jButtonHOME.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonHOME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jButtonHOME.setText("HOME");
        jButtonHOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHOMEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jButtonHOME)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 439, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonLogin1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonForgetpassword1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelINVALID1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                                    .addComponent(jTextFieldEmail1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jPasswordFieldPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCheckBoxSHOW1)))
                        .addGap(668, 668, 668))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButtonHOME))
                .addGap(55, 55, 55)
                .addComponent(jLabelINVALID1)
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jPasswordFieldPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxSHOW1)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLogin1)
                    .addComponent(jButtonForgetpassword1))
                .addContainerGap(193, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void jTextFieldEmail1FocusGained(java.awt.event.FocusEvent evt) {
        jLabelINVALID1.setVisible(false);
        if(jTextFieldEmail1.getText().equals("Email"))
        {
            jTextFieldEmail1.setText("");
            jTextFieldEmail1.setForeground(new Color(0,118,221 ));
        }
    }

    private void jTextFieldEmail1FocusLost(java.awt.event.FocusEvent evt) {
        jLabelINVALID1.setVisible(false);
        if(jTextFieldEmail1.getText().equals(""))
        {
            jTextFieldEmail1.setText("Email");
            jTextFieldEmail1.setForeground(new Color(0,118,221 ));
        }
    }

    private void jPasswordFieldPassword1FocusGained(java.awt.event.FocusEvent evt) {

        jLabelINVALID1.setVisible(false);
        if(jPasswordFieldPassword1.getText().equals("Password"))
        {
            jPasswordFieldPassword1.setText("");
            jPasswordFieldPassword1.setForeground(new Color(0,118,221 ));
        }
    }

    private void jPasswordFieldPassword1FocusLost(java.awt.event.FocusEvent evt) {
        jLabelINVALID1.setVisible(false);
        if(jPasswordFieldPassword1.getText().equals(""))
        {
            jPasswordFieldPassword1.setText("Password");
            jPasswordFieldPassword1.setForeground(new Color(0,118,221 ));
        }
    }

    private void jButtonLogin1ActionPerformed(java.awt.event.ActionEvent evt) {

        int checkid=0;
        String Email =jTextFieldEmail1.getText();
        String Password1 =jPasswordFieldPassword1.getText();
        try
        {
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from teacher_info where Email='"+Email+"'AND Password='"+Password1+"'");
            while(rs.next())
            {
                checkid=1;
                setVisible(false);
                new TeacherDashboard().setVisible(true);
            }
            if (checkid==0)
            {
                JOptionPane.showMessageDialog(null, "User Doesn't Exist");

            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }

    private void jCheckBoxSHOW1ActionPerformed(java.awt.event.ActionEvent evt) {

        if(jCheckBoxSHOW1.isSelected())
        {
            jPasswordFieldPassword1.setEchoChar((char)0);
        }
        else
        {
            jPasswordFieldPassword1.setEchoChar('*');
        }
    }

    private void jButtonHOMEActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
        new HomePage().setVisible(true);
    }
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherLogin().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButtonForgetpassword1;
    private javax.swing.JButton jButtonHOME;
    private javax.swing.JButton jButtonLogin1;
    private javax.swing.JCheckBox jCheckBoxSHOW1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelINVALID1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldPassword1;
    private javax.swing.JTextField jTextFieldEmail1;
}