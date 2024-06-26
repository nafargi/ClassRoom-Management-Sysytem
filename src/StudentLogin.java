
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import project.ConnectionProvider;

public class StudentLogin extends javax.swing.JFrame {

    private Connection con;

    public StudentLogin() {
        initComponents();
        jLabelINVALID.setVisible(false);
        con = ConnectionProvider.getCon();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jCheckBoxSHOW = new javax.swing.JCheckBox();
        jLabelINVALID = new javax.swing.JLabel();
        jButtonForgetpassword = new javax.swing.JButton();
        jButtonHOME = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sign in new.png"))); // NOI18N
        jLabel1.setText("Student Login ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Email");

        jTextFieldEmail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldEmail.setForeground(new java.awt.Color(0, 153, 153));
        jTextFieldEmail.setText("Email");
        jTextFieldEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldEmailFocusLost(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Password");

        jPasswordFieldPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPasswordFieldPassword.setForeground(new java.awt.Color(0, 153, 153));
        jPasswordFieldPassword.setText("Password");
        jPasswordFieldPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldPasswordFocusLost(evt);
            }
        });

        jButtonLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(0, 153, 153));
        jButtonLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/small login.png"))); // NOI18N
        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jCheckBoxSHOW.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBoxSHOW.setForeground(new java.awt.Color(0, 153, 153));
        jCheckBoxSHOW.setText("Show Password");
        jCheckBoxSHOW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSHOWActionPerformed(evt);
            }
        });

        jLabelINVALID.setBackground(new java.awt.Color(255, 0, 51));
        jLabelINVALID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelINVALID.setForeground(new java.awt.Color(204, 51, 0));
        jLabelINVALID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jLabelINVALID.setText("Email/Password is invalid");

        jButtonForgetpassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonForgetpassword.setForeground(new java.awt.Color(204, 0, 51));
        jButtonForgetpassword.setText("Forget Password?");

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
                .addGap(259, 259, 259)
                .addComponent(jButtonHOME)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 434, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonForgetpassword))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelINVALID, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCheckBoxSHOW)))
                        .addGap(666, 666, 666))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButtonHOME))
                .addGap(55, 55, 55)
                .addComponent(jLabelINVALID)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxSHOW)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLogin)
                    .addComponent(jButtonForgetpassword))
                .addContainerGap(188, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEmailFocusLost(java.awt.event.FocusEvent evt) {

        jLabelINVALID.setVisible(false);
        if(jTextFieldEmail.getText().equals(""))
        {
            jTextFieldEmail.setText("Email");
            jTextFieldEmail.setForeground(new Color(0,118,221 ));
        }
    }

    private void jCheckBoxSHOWActionPerformed(java.awt.event.ActionEvent evt) {
         if(jCheckBoxSHOW.isSelected())
        {
            jPasswordFieldPassword.setEchoChar((char)0);
        }
        else
        {
             jPasswordFieldPassword.setEchoChar('*');
        }
    }


    private void jTextFieldEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldEmailFocusGained
        jLabelINVALID.setVisible(false);
        if(jTextFieldEmail.getText().equals("Email"))
        {
            jTextFieldEmail.setText("");
            jTextFieldEmail.setForeground(new Color(0,118,221 ));
        }
    }

    private void jPasswordFieldPasswordFocusGained(java.awt.event.FocusEvent evt) {

        jLabelINVALID.setVisible(false);
        if(jPasswordFieldPassword.getText().equals("Password"))
        {
            jPasswordFieldPassword.setText("");
            jPasswordFieldPassword.setForeground(new Color(0,118,221 ));
        }
    }

    private void jPasswordFieldPasswordFocusLost(java.awt.event.FocusEvent evt) {

        jLabelINVALID.setVisible(false);
        if(jPasswordFieldPassword.getText().equals(""))
        {
            jPasswordFieldPassword.setText("Password");
            jPasswordFieldPassword.setForeground(new Color(0,118,221 ));
        }
    }//GEN-LAST:event_jPasswordFieldPasswordFocusLost

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {

        int checkid = 0;
        String Email = jTextFieldEmail.getText();
        String Password = jPasswordFieldPassword.getText();
        try {
            if (con == null) {
                JOptionPane.showMessageDialog(null, "Database connection failed!");
                return;
            }
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from Student_info where Email='" + Email + "'AND Password='" + Password + "'");
            if (rs.next()) {
                checkid = 1;
                setVisible(false);
                new StudentDashboard().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Email or Password");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void jButtonHOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHOMEActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new HomePage().setVisible(true);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentLogin().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButtonForgetpassword;
    private javax.swing.JButton jButtonHOME;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JCheckBox jCheckBoxSHOW;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelINVALID;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldEmail;
}
