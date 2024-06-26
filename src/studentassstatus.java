import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import project.ConnectionProvider;

public class studentassstatus extends javax.swing.JFrame {


    public studentassstatus() {
        initComponents();
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxbatch = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxSub = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxDiv = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxAssname = new javax.swing.JComboBox<>();
        jButtonSearchAssignemnt = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldRollno = new javax.swing.JTextField();
        jButtonSubmitSearch = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldDoS = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldAssnotes = new javax.swing.JTextField();
        jTextFieldAssLink = new javax.swing.JTextField();
        jButtonSubmitDelete = new javax.swing.JButton();
        jButtonSubmitUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 118, 221));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/task2 icon.png"))); // NOI18N
        jLabel1.setText("Assignment Status Students section");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Rollno", "Date of submission", "Ass Notes", "Ass File", "Remark", "Marks"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 118, 221));
        jLabel3.setText("Choose Class");

        jComboBoxbatch.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jComboBoxbatch.setForeground(new java.awt.Color(0, 118, 221));
        jComboBoxbatch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Section1", "Section2", "Section3", "Section4" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 118, 221));
        jLabel4.setText("Course Name");

        jComboBoxSub.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jComboBoxSub.setForeground(new java.awt.Color(0, 118, 221));
        jComboBoxSub.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OOP", "DSA", "DataBase", "Python", "Web Development", "App Development", "Networking", "C++", "Linux", "Ios Developement", "OS", "HCI", "TOC", "DBMS", "SEPM", "ICS", "MLA", "SDM", "BAI", "STQA", " " }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel7.setForeground(new java.awt.Color(0, 118, 221));
        jLabel7.setText("Choose Group");

        jComboBoxDiv.setFont(new java.awt.Font("Tahoma", 1, 16));
        jComboBoxDiv.setForeground(new java.awt.Color(0, 118, 221));
        jComboBoxDiv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Group1", "Group2", " " }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel5.setForeground(new java.awt.Color(0, 118, 221));
        jLabel5.setText("Assignment Name");

        jComboBoxAssname.setFont(new java.awt.Font("Tahoma", 1, 16));
        jComboBoxAssname.setForeground(new java.awt.Color(0, 118, 221));
        jComboBoxAssname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ass1", "Ass2", "Ass3", "Ass4", "Ass5", "Ass6", "Ass7", "Ass8", "Ass9", "Ass10" }));

        jButtonSearchAssignemnt.setFont(new java.awt.Font("Tahoma", 1, 16));
        jButtonSearchAssignemnt.setForeground(new java.awt.Color(0, 118, 221));
        jButtonSearchAssignemnt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png")));
        jButtonSearchAssignemnt.setText("Search Assignment ");
        jButtonSearchAssignemnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchAssignemntActionPerformed(evt);
            }
        });

        jButtonReset.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonReset.setForeground(new java.awt.Color(0, 118, 221));
        jButtonReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reset.png"))); // NOI18N
        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel2.setForeground(new java.awt.Color(0, 118, 221));
        jLabel2.setText("Roll no");

        jTextFieldRollno.setFont(new java.awt.Font("Tahoma", 1, 16));
        jTextFieldRollno.setForeground(new java.awt.Color(0, 118, 221));

        jButtonSubmitSearch.setFont(new java.awt.Font("Tahoma", 1, 16));
        jButtonSubmitSearch.setForeground(new java.awt.Color(0, 118, 221));
        jButtonSubmitSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png")));
        jButtonSubmitSearch.setText("Search");
        jButtonSubmitSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitSearchActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel6.setForeground(new java.awt.Color(0, 118, 221));
        jLabel6.setText("Name");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel9.setForeground(new java.awt.Color(0, 118, 221));
        jLabel9.setText("Date of Submission");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel10.setForeground(new java.awt.Color(0, 118, 221));
        jLabel10.setText("Ass Notes");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel11.setForeground(new java.awt.Color(0, 118, 221));
        jLabel11.setText("Ass File");

        jTextFieldDoS.setFont(new java.awt.Font("Tahoma", 1, 16));
        jTextFieldDoS.setForeground(new java.awt.Color(0, 118, 221));

        jTextFieldName.setFont(new java.awt.Font("Tahoma", 1, 16));
        jTextFieldName.setForeground(new java.awt.Color(0, 118, 221));

        jTextFieldAssnotes.setFont(new java.awt.Font("Tahoma", 1, 16));
        jTextFieldAssnotes.setForeground(new java.awt.Color(0, 118, 221));

        jTextFieldAssLink.setFont(new java.awt.Font("Tahoma", 1, 16));
        jTextFieldAssLink.setForeground(new java.awt.Color(0, 118, 221));

        jButtonSubmitDelete.setFont(new java.awt.Font("Tahoma", 1, 16));
        jButtonSubmitDelete.setForeground(new java.awt.Color(0, 118, 221));
        jButtonSubmitDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete new icon.png")));
        jButtonSubmitDelete.setText("Delete");
        jButtonSubmitDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitDeleteActionPerformed(evt);
            }
        });

        jButtonSubmitUpdate.setFont(new java.awt.Font("Tahoma", 1, 16));
        jButtonSubmitUpdate.setForeground(new java.awt.Color(0, 118, 221));
        jButtonSubmitUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update medium icon.png")));
        jButtonSubmitUpdate.setText("Update");
        jButtonSubmitUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonSearchAssignemnt)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonSubmitUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextFieldRollno, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBoxAssname, javax.swing.GroupLayout.Alignment.LEADING, 0, 158, Short.MAX_VALUE)
                                            .addComponent(jTextFieldName, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldDoS, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldAssnotes, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldAssLink, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonSubmitDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 37, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBoxSub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBoxbatch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jButtonSubmitSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 984, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 29, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxbatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jComboBoxSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBoxDiv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBoxAssname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSearchAssignemnt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRollno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldDoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldAssnotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jTextFieldAssLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSubmitDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSubmitUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSubmitSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

         setVisible(false);
    }

    private void jButtonSearchAssignemntActionPerformed(java.awt.event.ActionEvent evt) {

        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        String Class=(String)jComboBoxbatch.getSelectedItem();
        String Subject=(String)jComboBoxSub.getSelectedItem();
        String Div=(String)jComboBoxDiv.getSelectedItem();
        String AssName=(String)jComboBoxAssname.getSelectedItem();
        String tablename=Class+Subject+Div+AssName;
        
        try
        {
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from "+tablename+" ");
            while(rs.next())
            {
                
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),
                    rs.getString(5),rs.getString(6),rs.getString(7)});

        }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {

        setVisible(false);
        new studentassstatus().setVisible(true);
    }

    private void jButtonSubmitSearchActionPerformed(java.awt.event.ActionEvent evt) {

        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        String Class=(String)jComboBoxbatch.getSelectedItem();
        String Subject=(String)jComboBoxSub.getSelectedItem();
        String Div=(String)jComboBoxDiv.getSelectedItem();
        String AssName=(String)jComboBoxAssname.getSelectedItem();
        String tablename=Class+Subject+Div+AssName;
        String Rollno =jTextFieldRollno.getText();
        System.out.println("select * from "+tablename+" where Rollno='"+Rollno+"'"); 
        try
        {
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from "+tablename+" where Rollno='"+Rollno+"'");
            
            setVisible(false);
            new studentassstatus().setVisible(true);
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),
                    rs.getString(5),rs.getString(6),rs.getString(7)});

        }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_jButtonSubmitSearchActionPerformed

    private void jButtonSubmitDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitDeleteActionPerformed
        // TODO add your handling code here:DELETE
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        String Class=(String)jComboBoxbatch.getSelectedItem();
        String Subject=(String)jComboBoxSub.getSelectedItem();
        String Div=(String)jComboBoxDiv.getSelectedItem();
        String AssName=(String)jComboBoxAssname.getSelectedItem();
        String tablename=Class+Subject+Div+AssName;
        String Rollno =jTextFieldRollno.getText();
        System.out.println("select * from "+tablename+" where Rollno='"+Rollno+"'"); 
        try
        {
           
            Connection con=ConnectionProvider.getCon();
            PreparedStatement ps;
            ps = con.prepareStatement("DELETE FROM "+tablename+" where Rollno='"+Rollno+"'  ");
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Successfully,Assignment is Updated now");
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void jButtonSubmitUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitUpdateActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        String Class=(String)jComboBoxbatch.getSelectedItem();
        String Subject=(String)jComboBoxSub.getSelectedItem();
        String Div=(String)jComboBoxDiv.getSelectedItem();
        String AssName=(String)jComboBoxAssname.getSelectedItem();
        String tablename=Class+Subject+Div+AssName;
        String Rollno =jTextFieldRollno.getText();
        String Name =jTextFieldName.getText();
        String DOS=jTextFieldDoS.getText();
        String Assnote =jTextFieldAssnotes.getText();
        String AssLink =jTextFieldAssLink.getText();
        System.out.println("select * from "+tablename+" where Rollno='"+Rollno+"'"); 
        try
        {
           
            Connection con=ConnectionProvider.getCon();
            PreparedStatement ps;
            //ResultSet rs=st.executeQuery("select * from "+tablename+" where Rollno='"+Rollno+"'");
            ps = con.prepareStatement("UPDATE "+tablename+" SET Name1= '"+Name+"',DOS='"+DOS+"',AssNote='"+Assnote+"',AssFile='"+AssLink+"' where Rollno='"+Rollno+"'  ");
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Successfully,Assignment is Updated now");
            /*while(rs.next())
            {
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),
                    rs.getString(5),rs.getString(6),rs.getString(7)});

        }*/
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButtonSubmitUpdateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(studentassstatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentassstatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentassstatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentassstatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentassstatus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonSearchAssignemnt;
    private javax.swing.JButton jButtonSubmitDelete;
    private javax.swing.JButton jButtonSubmitSearch;
    private javax.swing.JButton jButtonSubmitUpdate;
    private javax.swing.JComboBox<String> jComboBoxAssname;
    private javax.swing.JComboBox<String> jComboBoxDiv;
    private javax.swing.JComboBox<String> jComboBoxSub;
    private javax.swing.JComboBox<String> jComboBoxbatch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldAssLink;
    private javax.swing.JTextField jTextFieldAssnotes;
    private javax.swing.JTextField jTextFieldDoS;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldRollno;
    // End of variables declaration//GEN-END:variables
}
