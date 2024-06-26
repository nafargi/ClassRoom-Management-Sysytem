
public class HomePage extends javax.swing.JFrame {

    public HomePage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonTeacherSignup = new javax.swing.JButton();
        jButtonTeacherLogin = new javax.swing.JButton();
        jButtonStudentSignup = new javax.swing.JButton();
        jButtonStudentLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48));
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/welcome icon.png")));
        jLabel1.setText("Welcome");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36));
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/teacher icon.png")));
        jLabel2.setText("Teacher ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36));
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Student icon.png")));
        jLabel3.setText("Student");

        jButtonTeacherSignup.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonTeacherSignup.setForeground(new java.awt.Color(0, 118, 221));
        jButtonTeacherSignup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png")));
        jButtonTeacherSignup.setText("Signup");
        jButtonTeacherSignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonTeacherSignupMouseClicked(evt);
            }
        });

        jButtonTeacherLogin.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonTeacherLogin.setForeground(new java.awt.Color(0, 118, 221));
        jButtonTeacherLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png")));
        jButtonTeacherLogin.setText("Login");
        jButtonTeacherLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonTeacherLoginMouseClicked(evt);
            }
        });

        jButtonStudentSignup.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonStudentSignup.setForeground(new java.awt.Color(0, 118, 221));
        jButtonStudentSignup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png")));
        jButtonStudentSignup.setText("Signup");
        jButtonStudentSignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonStudentSignupMouseClicked(evt);
            }
        });

        jButtonStudentLogin.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonStudentLogin.setForeground(new java.awt.Color(0, 118, 221));
        jButtonStudentLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png")));
        jButtonStudentLogin.setText("Login");
        jButtonStudentLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonStudentLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(302, 302, 302)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jButtonTeacherSignup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButtonTeacherLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(258, 258, 258)
                                                .addComponent(jLabel2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 348, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jButtonStudentSignup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButtonStudentLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(331, 331, 331))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(298, 298, 298))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(499, 499, 499)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel1)
                                .addGap(105, 105, 105)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                .addGap(117, 117, 117)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonTeacherSignup)
                                        .addComponent(jButtonStudentSignup))
                                .addGap(99, 99, 99)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonTeacherLogin)
                                        .addComponent(jButtonStudentLogin))
                                .addContainerGap(183, Short.MAX_VALUE))
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
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButtonTeacherSignupMouseClicked(java.awt.event.MouseEvent evt) {

        setVisible(false);
        new TeacherSignup().setVisible(true);
    }

    private void jButtonTeacherLoginMouseClicked(java.awt.event.MouseEvent evt) {
        setVisible(false);
        new TeacherLogin().setVisible(true);
    }

    private void jButtonStudentSignupMouseClicked(java.awt.event.MouseEvent evt) {
        setVisible(false);
        new StudentSignUp().setVisible(true);
    }

    private void jButtonStudentLoginMouseClicked(java.awt.event.MouseEvent evt) {
        setVisible(false);
        new StudentLogin().setVisible(true);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButtonStudentLogin;
    private javax.swing.JButton jButtonStudentSignup;
    private javax.swing.JButton jButtonTeacherLogin;
    private javax.swing.JButton jButtonTeacherSignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
}

