
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import project.ConnectionProvider;

public class TeacherSignup extends javax.swing.JFrame {


    public TeacherSignup() {
        initComponents();
        jLabelSAME.setVisible(false);
        try
        {
            int id=1;
            String str1=String.valueOf(id);
            jLabelID.setText(str1);
            Connection con=ConnectionProvider.getCon();
            Statement st= con.createStatement();
            ResultSet rs=st.executeQuery("SELECT MAX(Tid) FROM teacher_info");
            while(rs.next())
            {
                id=rs.getInt(1);
                id=id+1;
                String str=String.valueOf(id);
                jLabelID.setText(str);
            }
            
            
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldFullName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButtonRegister = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jLabelSAME = new javax.swing.JLabel();
        jButtonHOME = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/teacher icon.png"))); // NOI18N
        jLabel1.setText("Teacher Signup");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 102));
        jLabel2.setText("ID");

        jLabelID.setBackground(new java.awt.Color(204, 0, 51));
        jLabelID.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelID.setForeground(new java.awt.Color(255, 0, 0));
        jLabelID.setText("00");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 102));
        jLabel4.setText("Full Name");

        jTextFieldFullName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextFieldFullName.setForeground(new java.awt.Color(255, 204, 102));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 102));
        jLabel5.setText("Email");

        jTextFieldEmail.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextFieldEmail.setForeground(new java.awt.Color(255, 204, 102));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 102));
        jLabel6.setText("Password");

        jPasswordFieldPassword.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPasswordFieldPassword.setForeground(new java.awt.Color(255, 204, 102));

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 204, 102));
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButtonRegister.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonRegister.setForeground(new java.awt.Color(255, 51, 0));
        jButtonRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Audit icon.png"))); // NOI18N
        jButtonRegister.setText("Register");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });

        jButtonReset.setFont(new java.awt.Font("Tahoma", 1, 24));
        jButtonReset.setForeground(new java.awt.Color(255, 51, 0));
        jButtonReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Audit icon.png")));
        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jLabelSAME.setFont(new java.awt.Font("Tahoma", 1, 19));
        jLabelSAME.setForeground(new java.awt.Color(255, 0, 0));
        jLabelSAME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png")));
        jLabelSAME.setText("Email or Roll no. Already Exist");

        jButtonHOME.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonHOME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png")));
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(485, 485, 485)
                        .addComponent(jLabelSAME))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(442, 442, 442)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jCheckBox1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPasswordFieldPassword)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButtonRegister)
                                    .addGap(111, 111, 111)
                                    .addComponent(jButtonReset))
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldEmail)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldFullName)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(444, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonHOME)
                .addGap(74, 74, 74))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButtonHOME))
                .addGap(10, 10, 10)
                .addComponent(jLabelSAME)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabelID)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(37, 37, 37)
                .addComponent(jTextFieldFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(27, 27, 27)
                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonReset)
                    .addComponent(jButtonRegister))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox1.isSelected())
        {
            jPasswordFieldPassword.setEchoChar((char)0);
        }
        else
        {
             jPasswordFieldPassword.setEchoChar('*');
        }
    }

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
        new TeacherSignup().setVisible(true);
    }

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {
        String id=jLabelID.getText();
        String Fullname=jTextFieldFullName.getText();
        String Email=jTextFieldEmail.getText();
        String Password1=jPasswordFieldPassword.getText();
        
        
        try
        {
            Connection con=ConnectionProvider.getCon();
            PreparedStatement ps=con.prepareStatement("insert into teacher_info values (?,?,?,?)");
            ps.setString(1, id);
            ps.setString(2, Fullname);
            ps.setString(3, Email);
            ps.setString(4, Password1);
            
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Successfully Register,Now you can Login");
            setVisible(false);
            new TeacherLogin().setVisible(true);
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }

    private void jButtonHOMEActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
        new HomePage().setVisible(true);
    }
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherSignup().setVisible(true);
            }
        });
    }


    private javax.swing.JButton jButtonHOME;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelSAME;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFullName;

}
