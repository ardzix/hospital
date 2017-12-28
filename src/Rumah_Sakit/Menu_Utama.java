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
        jbuttonadmin = new javax.swing.JButton();
        jLabelhexa = new javax.swing.JLabel();
        jPanelbiru = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButtonexit.setBackground(new java.awt.Color(242, 38, 19));
        jButtonexit.setText("EXIT");
        jButtonexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonexitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonexit);
        jButtonexit.setBounds(510, 350, 70, 29);

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 167, 240));
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

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 120, 120, 40);

        jbuttonPharmacy.setBackground(new java.awt.Color(228, 241, 254));
        jbuttonPharmacy.setFont(new java.awt.Font("Gill Sans MT", 2, 18)); // NOI18N
        jbuttonPharmacy.setForeground(new java.awt.Color(34, 167, 240));
        jbuttonPharmacy.setText("Pharmacist");
        jbuttonPharmacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonPharmacyActionPerformed(evt);
            }
        });
        getContentPane().add(jbuttonPharmacy);
        jbuttonPharmacy.setBounds(390, 290, 130, 40);

        jbuttondoctor.setBackground(new java.awt.Color(228, 241, 254));
        jbuttondoctor.setFont(new java.awt.Font("Gill Sans MT", 2, 18)); // NOI18N
        jbuttondoctor.setForeground(new java.awt.Color(34, 167, 240));
        jbuttondoctor.setText("Doctor");
        jbuttondoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttondoctorActionPerformed(evt);
            }
        });
        getContentPane().add(jbuttondoctor);
        jbuttondoctor.setBounds(230, 290, 130, 40);

        jbuttonadmin.setBackground(new java.awt.Color(228, 241, 254));
        jbuttonadmin.setFont(new java.awt.Font("Gill Sans MT", 2, 18)); // NOI18N
        jbuttonadmin.setForeground(new java.awt.Color(34, 167, 240));
        jbuttonadmin.setLabel("Admin");
        jbuttonadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonadminActionPerformed(evt);
            }
        });
        getContentPane().add(jbuttonadmin);
        jbuttonadmin.setBounds(70, 290, 120, 40);

        jLabelhexa.setBackground(new java.awt.Color(228, 241, 254));
        jLabelhexa.setFont(new java.awt.Font("Trajan Pro", 0, 24)); // NOI18N
        jLabelhexa.setForeground(new java.awt.Color(240, 240, 240));
        jLabelhexa.setText("     HeXa HOSPITAL MANAGEMENT SYSTEM");
        getContentPane().add(jLabelhexa);
        jLabelhexa.setBounds(0, 29, 590, 70);

        jPanelbiru.setBackground(new java.awt.Color(34, 167, 240));

        javax.swing.GroupLayout jPanelbiruLayout = new javax.swing.GroupLayout(jPanelbiru);
        jPanelbiru.setLayout(jPanelbiruLayout);
        jPanelbiruLayout.setHorizontalGroup(
            jPanelbiruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanelbiruLayout.setVerticalGroup(
            jPanelbiruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelbiru);
        jPanelbiru.setBounds(0, 30, 600, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbuttonadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonadminActionPerformed
        login(1);
    }//GEN-LAST:event_jbuttonadminActionPerformed

    private void jbuttondoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttondoctorActionPerformed
        login(2);
    }//GEN-LAST:event_jbuttondoctorActionPerformed

    private void jbuttonPharmacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonPharmacyActionPerformed
        login(3);
    }//GEN-LAST:event_jbuttonPharmacyActionPerformed

    private void jButtonexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonexitActionPerformed
    System.exit(0);
    }//GEN-LAST:event_jButtonexitActionPerformed

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
                mu.setSize(600,420);
                mu.setLocationRelativeTo(null);
                mu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mu.setVisible(true);   
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonexit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelhexa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelbiru;
    private javax.swing.JButton jbuttonPharmacy;
    private javax.swing.JButton jbuttonadmin;
    private javax.swing.JButton jbuttondoctor;
    // End of variables declaration//GEN-END:variables
}
