import project.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;

public class StudentSignUp extends javax.swing.JFrame {

    public StudentSignUp() {
        initComponents();
        jLabelSAME.setVisible(false);
        try {
            int Sid = 1;
            String str1 = String.valueOf(Sid);
            jLabelIDnumber.setText(str1);

            Connection con = ConnectionProvider.getCon();
            if (con == null) {
                System.out.println("Database connection failed!");
                JOptionPane.showMessageDialog(null, "Database connection failed!");
                System.exit(0);
            }

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select max(Sid) from Student_info");
            while (rs.next()) {
                Sid = rs.getInt(1);
                Sid = Sid + 1;
                String str = String.valueOf(Sid);
                jLabelIDnumber.setText(str);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldFullName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxDiv = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxYear = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxBranch = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldRollNo = new javax.swing.JTextField();
        jButtonSumbit = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jLabelID = new javax.swing.JLabel();
        jLabelIDnumber = new javax.swing.JLabel();
        jLabelSAME = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jButtonHOME = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sign up icon.png"))); // NOI18N
        jLabel1.setText("Student Signup Form");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 0));
        jLabel2.setText("Full Name");

        jTextFieldFullName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldFullName.setForeground(new java.awt.Color(102, 153, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 0));
        jLabel3.setText("Email");

        jTextFieldEmail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldEmail.setForeground(new java.awt.Color(102, 153, 0));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 0));
        jLabel4.setText("Password");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 153, 0));
        jLabel5.setText("Division");

        jComboBoxDiv.setFont(new java.awt.Font("Tahoma", 1, 18));
        jComboBoxDiv.setForeground(new java.awt.Color(102, 153, 0));
        jComboBoxDiv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Div 1", "Div 2" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel6.setForeground(new java.awt.Color(102, 153, 0));
        jLabel6.setText("Year");

        jComboBoxYear.setFont(new java.awt.Font("Tahoma", 1, 18));
        jComboBoxYear.setForeground(new java.awt.Color(102, 153, 0));
        jComboBoxYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FE", "SE", "TE", "BE" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel7.setForeground(new java.awt.Color(102, 153, 0));
        jLabel7.setText("Branch");

        jComboBoxBranch.setFont(new java.awt.Font("Tahoma", 1, 18));
        jComboBoxBranch.setForeground(new java.awt.Color(102, 153, 0));
        jComboBoxBranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IT", "CS", "ENTC", "MECH" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel8.setForeground(new java.awt.Color(102, 153, 0));
        jLabel8.setText("Roll No");

        jTextFieldRollNo.setFont(new java.awt.Font("Tahoma", 1, 18));
        jTextFieldRollNo.setForeground(new java.awt.Color(102, 153, 0));
        jTextFieldRollNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRollNoActionPerformed(evt);
            }
        });

        jButtonSumbit.setFont(new java.awt.Font("Tahoma", 1, 20));
        jButtonSumbit.setForeground(new java.awt.Color(153, 153, 0));
        jButtonSumbit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Audit icon.png")));
        jButtonSumbit.setText("Submit");
        jButtonSumbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSumbitActionPerformed(evt);
            }
        });

        jButtonReset.setFont(new java.awt.Font("Tahoma", 1, 20));
        jButtonReset.setForeground(new java.awt.Color(153, 153, 0));
        jButtonReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reset.png")));
        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jLabelID.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabelID.setForeground(new java.awt.Color(102, 153, 0));
        jLabelID.setText("ID");

        jLabelIDnumber.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabelIDnumber.setForeground(new java.awt.Color(255, 0, 51));
        jLabelIDnumber.setText("00");

        jLabelSAME.setFont(new java.awt.Font("Tahoma", 1, 19));
        jLabelSAME.setForeground(new java.awt.Color(255, 0, 0));
        jLabelSAME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png")));
        jLabelSAME.setText("Email or Roll no. Already Exist");

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jCheckBox1.setForeground(new java.awt.Color(102, 153, 0));
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jPasswordFieldPassword.setFont(new java.awt.Font("Tahoma", 1, 18));
        jPasswordFieldPassword.setForeground(new java.awt.Color(102, 153, 0));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(277, 277, 277)
                .addComponent(jButtonHOME)
                .addGap(63, 63, 63))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldFullName)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelIDnumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(217, 217, 217)
                                    .addComponent(jCheckBox1))
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldEmail)
                                .addComponent(jPasswordFieldPassword))
                            .addComponent(jButtonSumbit))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldRollNo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxYear, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonReset)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(jLabelSAME)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButtonHOME))
                .addGap(58, 58, 58)
                .addComponent(jLabelSAME)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabelID))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIDnumber)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldRollNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxDiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonReset)
                    .addComponent(jButtonSumbit))
                .addGap(83, 83, 83))
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
    }

    private void jTextFieldRollNoActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButtonSumbitActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here: SAVE
        String id=jLabelIDnumber.getText();
        String Fullname=jTextFieldFullName.getText();
        String Email=jTextFieldEmail.getText();
        String Password1=jPasswordFieldPassword.getText();
        String Rollno=jTextFieldRollNo.getText();
        
        String Group=(String)jComboBoxDiv.getSelectedItem();
        String Section=(String)jComboBoxYear.getSelectedItem();
        String Brach=(String)jComboBoxBranch.getSelectedItem();
        
        try
        {
            Connection con=ConnectionProvider.getCon();
            PreparedStatement ps=con.prepareStatement("insert into Student_info values (?,?,?, ?,?,?, ?,?)");
            ps.setString(1, id);
            ps.setString(2, Fullname);
            ps.setString(3, Email);
            ps.setString(4, Password1);
            ps.setString(5, Rollno);
            ps.setString(6, Group);
            ps.setString(7, Section);
            ps.setString(8, Brach);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Successfully Register,Now you can Login");
            setVisible(false);
            new StudentLogin().setVisible(true);
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here: Show Password
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
        new StudentSignUp().setVisible(true);
        
    }

    private void jButtonHOMEActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
        new HomePage().setVisible(true);
    }
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentSignUp().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButtonHOME;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonSumbit;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBoxBranch;
    private javax.swing.JComboBox<String> jComboBoxDiv;
    private javax.swing.JComboBox<String> jComboBoxYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelIDnumber;
    private javax.swing.JLabel jLabelSAME;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFullName;
    private javax.swing.JTextField jTextFieldRollNo;
}
