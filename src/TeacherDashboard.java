
import javax.swing.JOptionPane;

public class TeacherDashboard extends javax.swing.JFrame {

    public TeacherDashboard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonCreate = new javax.swing.JButton();
        jButtonCheckASS = new javax.swing.JButton();
        jButtonCreateCourse = new javax.swing.JButton();
        jButtonAddStudent = new javax.swing.JButton();
        jButtonCheckASS = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonLogout = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButtonCreate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonCreate.setForeground(new java.awt.Color(51, 153, 255));
        jButtonCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/task2 icon.png"))); // NOI18N
        jButtonCreate.setText("Create Assigment");
        jButtonCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCreateMouseClicked(evt);
            }
        });
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });

        jButtonCreateCourse.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonCreateCourse.setForeground(new java.awt.Color(51, 153, 255));
        jButtonCreateCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/certificate.png")));
        jButtonCreateCourse.setText("Create Course         ");
        jButtonCreateCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCreateCourseMouseClicked(evt);
            }
        });
        jButtonCreateCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateCourseActionPerformed(evt);
            }
        });


        jButtonAddStudent.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonAddStudent.setForeground(new java.awt.Color(51, 153, 255));
        jButtonAddStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/open-enrollment.png"))); // NOI18N
        jButtonAddStudent.setText("Add Students        ");
        jButtonAddStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAddStudentMouseClicked(evt);
            }
        });
        jButtonAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddStudentActionPerformed(evt);
            }
        });

        jButtonCheckASS.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonCheckASS.setForeground(new java.awt.Color(51, 153, 255));
        jButtonCheckASS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check icon.png"))); // NOI18N
        jButtonCheckASS.setText("Check Assignment");
        jButtonCheckASS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCheckASSMouseClicked(evt);
            }
        });
        jButtonCheckASS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckASSActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dashboard icon.png"))); // NOI18N
        jLabel1.setText("Teacher Dashboard");

        jButtonLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        jButtonLogout.setText("Logout");
        jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutActionPerformed(evt);
            }
        });

        jButtonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(185, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButtonCreate)
                                                .addGap(243, 243, 243)
                                                .addComponent(jButtonCheckASS)
                                                .addGap(213, 213, 213))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jButtonLogout)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButtonExit))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(388, 388, 388)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(jButtonCreateCourse)
                                .addGap(250, 250, 250)
                                .addComponent(jButtonAddStudent)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonLogout)
                                        .addComponent(jButtonExit))
                                .addGap(134, 134, 134)
                                .addComponent(jLabel1)
                                .addGap(100, 100, 100)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonCreateCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonCheckASS, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 221, Short.MAX_VALUE))
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

    private void jButtonCreateMouseClicked(java.awt.event.MouseEvent evt) {
    }
    private void jButtonCreateCourseMouseClicked(java.awt.event.MouseEvent evt) {
    }
    private void jButtonAddStudentMouseClicked(java.awt.event.MouseEvent evt) {
    }
    private void jButtonCheckASSMouseClicked(java.awt.event.MouseEvent evt) {
    }

    private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {
        int a=JOptionPane.showConfirmDialog(null,"do u really want to Logout?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            setVisible(false);
            new TeacherLogin().setVisible(true);
        }
    }

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {
         int a=JOptionPane.showConfirmDialog(null,"do u really want to Exit?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            setVisible(false);
            new HomePage().setVisible(true);
        }
    }

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {

        setVisible(true);
        new CreateAss().setVisible(true);
    }

    private void jButtonCreateCourseActionPerformed(java.awt.event.ActionEvent evt) {

        setVisible(true);
        new CreateAss().setVisible(true);
    }
    private void jButtonAddStudentActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(true);
        new CreateAss().setVisible(true);
    }
    private void jButtonCheckASSActionPerformed(java.awt.event.ActionEvent evt) {//

        setVisible(true);
        new Checkstatus().setVisible(true);
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
            java.util.logging.Logger.getLogger(TeacherDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherDashboard().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButtonCheckASS;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonCreateCourse;
    private javax.swing.JButton jButtonAddStudent;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
}
