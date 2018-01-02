package Rumah_Sakit;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class Menu_Utama extends JFrame {

    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JLabel jLabel4;
    private JLabel jLabel2;
    private DataManager manager;

    public Menu_Utama() {
        initComponents();
        manager = new DataManager();
    }
    @SuppressWarnings("unchecked")
    
    
    private void login(int role){
        Login l = new Login(role);
        l.setTitle("HeXa Hospital Management System");
        l.setLocationRelativeTo(null);
        l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l.setVisible(true);
        l.set_manager(manager);
        dispose();
    }
    
        
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonexit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbuttonPharmacy = new javax.swing.JButton();
        jbuttondoctor = new javax.swing.JButton();
        jbuttonstaff = new javax.swing.JButton();
        jbuttonadmin = new javax.swing.JButton();
        jPanelbiru = new javax.swing.JPanel();
        jLabelhexa = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonexit.setBackground(new java.awt.Color(242, 38, 19));
        jButtonexit.setFont(new java.awt.Font("Gill Sans MT", 2, 12)); // NOI18N
        jButtonexit.setText("EXIT");
        jButtonexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonexitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, 90, 40));

        jPanel1.setBackground(new java.awt.Color(34, 167, 240));

        jLabel1.setBackground(new java.awt.Color(34, 167, 240));
        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login As");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 120, -1));

        jbuttonPharmacy.setBackground(new java.awt.Color(228, 241, 254));
        jbuttonPharmacy.setFont(new java.awt.Font("Gill Sans MT", 2, 18)); // NOI18N
        jbuttonPharmacy.setForeground(new java.awt.Color(34, 167, 240));
        jbuttonPharmacy.setText("Pharmacist");
        jbuttonPharmacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonPharmacyActionPerformed(evt);
            }
        });
        getContentPane().add(jbuttonPharmacy, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 130, 40));

        jbuttondoctor.setBackground(new java.awt.Color(228, 241, 254));
        jbuttondoctor.setFont(new java.awt.Font("Gill Sans MT", 2, 18)); // NOI18N
        jbuttondoctor.setForeground(new java.awt.Color(34, 167, 240));
        jbuttondoctor.setText("Doctor");
        jbuttondoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttondoctorActionPerformed(evt);
            }
        });
        getContentPane().add(jbuttondoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 130, 40));

        jbuttonstaff.setBackground(new java.awt.Color(228, 241, 254));
        jbuttonstaff.setFont(new java.awt.Font("Gill Sans MT", 2, 18)); // NOI18N
        jbuttonstaff.setForeground(new java.awt.Color(34, 167, 240));
        jbuttonstaff.setText("Staff");
        jbuttonstaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonstaffActionPerformed(evt);
            }
        });
        getContentPane().add(jbuttonstaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 130, 40));

        jbuttonadmin.setBackground(new java.awt.Color(228, 241, 254));
        jbuttonadmin.setFont(new java.awt.Font("Gill Sans MT", 2, 18)); // NOI18N
        jbuttonadmin.setForeground(new java.awt.Color(34, 167, 240));
        jbuttonadmin.setText("Admin");
        jbuttonadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonadminActionPerformed(evt);
            }
        });
        getContentPane().add(jbuttonadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 120, 40));

        jPanelbiru.setBackground(new java.awt.Color(34, 167, 240));

        jLabelhexa.setBackground(new java.awt.Color(228, 241, 254));
        jLabelhexa.setFont(new java.awt.Font("Trajan Pro", 0, 24)); // NOI18N
        jLabelhexa.setForeground(new java.awt.Color(240, 240, 240));
        jLabelhexa.setText("     HeXa HOSPITAL MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanelbiruLayout = new javax.swing.GroupLayout(jPanelbiru);
        jPanelbiru.setLayout(jPanelbiruLayout);
        jPanelbiruLayout.setHorizontalGroup(
            jPanelbiruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelbiruLayout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(jLabelhexa, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelbiruLayout.setVerticalGroup(
            jPanelbiruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelbiruLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelhexa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanelbiru, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Rumah_Sakit/assets/Apoteker-compress.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 120, 120));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Rumah_Sakit/assets/Medicine-compress2.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 110, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Rumah_Sakit/assets/Admin-compress2.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Rumah_Sakit/assets/Watermark.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Rumah_Sakit/assets/Doctor-compress2.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Rumah_Sakit/assets/Background fix.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbuttonadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonadminActionPerformed
        login(1);
    }//GEN-LAST:event_jbuttonadminActionPerformed

    private void jbuttondoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttondoctorActionPerformed
        login(3);
    }//GEN-LAST:event_jbuttondoctorActionPerformed

    private void jbuttonPharmacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonPharmacyActionPerformed
        login(4);
    }//GEN-LAST:event_jbuttonPharmacyActionPerformed

    private void jButtonexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonexitActionPerformed
    System.exit(0);
    }//GEN-LAST:event_jButtonexitActionPerformed

    private void jbuttonstaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonstaffActionPerformed
        login(2);
    }//GEN-LAST:event_jbuttonstaffActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Menu_Utama mu = new Menu_Utama();
                mu.setTitle("HeXa Hospital Management System");
                mu.setSize(800,540);
                mu.setLocationRelativeTo(null);
                mu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mu.setVisible(true);   
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonexit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelhexa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelbiru;
    private javax.swing.JButton jbuttonPharmacy;
    private javax.swing.JButton jbuttonadmin;
    private javax.swing.JButton jbuttondoctor;
    private javax.swing.JButton jbuttonstaff;
    // End of variables declaration//GEN-END:variables
}
