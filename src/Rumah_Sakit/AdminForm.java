/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rumah_Sakit;

import java.util.Arrays;
import javax.swing.JFrame;


public class AdminForm extends javax.swing.JFrame {
    private DataManager manager;
    private int user_id;
    private Admin parent = new Admin(null);
    /**
     * Creates new form AdminForm
     */
    public AdminForm(int user_id, DataManager manager, Admin parent) {
        initComponents();
        initDatas(user_id, manager);
        this.parent = parent;
    }

    public void initDatas(int user_id, DataManager manager){        
        this.manager = manager;
        this.user_id = user_id;
        if(manager==null){
            jbuttonadmin1.setEnabled(false);
        }
        if(user_id>=0 && manager!=null){
            Object[] admin = manager.get_admin(user_id);
            usernameField.setText((String) admin[1]);
            String[] choice = new String[roleChoice.getItemCount()];
            for(int i=0; i<roleChoice.getItemCount(); i++){
                choice[i] = roleChoice.getItemAt(i).toLowerCase();
            }
            roleChoice.setSelectedIndex(Arrays.asList(choice).indexOf(admin[2]));
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanelbiru = new javax.swing.JPanel();
        jLabelhexa = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        roleChoice = new javax.swing.JComboBox<>();
        jbuttonadmin2 = new javax.swing.JButton();
        jbuttonadmin1 = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Rumah_Sakit/assets/Admin-compress2.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, 80));

        jPanelbiru.setBackground(new java.awt.Color(34, 167, 240));

        jLabelhexa.setBackground(new java.awt.Color(228, 241, 254));
        jLabelhexa.setFont(new java.awt.Font("Trajan Pro", 0, 24)); // NOI18N
        jLabelhexa.setForeground(new java.awt.Color(240, 240, 240));
        jLabelhexa.setText("ADD NEW ADMIN");

        javax.swing.GroupLayout jPanelbiruLayout = new javax.swing.GroupLayout(jPanelbiru);
        jPanelbiru.setLayout(jPanelbiruLayout);
        jPanelbiruLayout.setHorizontalGroup(
            jPanelbiruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelbiruLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelhexa)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanelbiruLayout.setVerticalGroup(
            jPanelbiruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelhexa, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelbiru, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 18, 260, 80));

        jLabel1.setText("Username:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 116, -1, -1));

        usernameField.setName("usernameField"); // NOI18N
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 136, 330, 40));

        jLabel2.setText("Password:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 182, -1, -1));

        jLabel3.setText("Role:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 248, -1, -1));

        roleChoice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Doctor", "Pharmacist", "Staff" }));
        getContentPane().add(roleChoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 268, 330, 40));

        jbuttonadmin2.setBackground(new java.awt.Color(242, 38, 19));
        jbuttonadmin2.setFont(new java.awt.Font("Gill Sans MT", 2, 18)); // NOI18N
        jbuttonadmin2.setForeground(new java.awt.Color(255, 255, 255));
        jbuttonadmin2.setText("Close");
        jbuttonadmin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonadmin2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbuttonadmin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 120, 40));

        jbuttonadmin1.setBackground(new java.awt.Color(0, 153, 153));
        jbuttonadmin1.setFont(new java.awt.Font("Gill Sans MT", 2, 18)); // NOI18N
        jbuttonadmin1.setForeground(new java.awt.Color(255, 255, 255));
        jbuttonadmin1.setText("Save");
        jbuttonadmin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonadmin1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbuttonadmin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 120, 40));
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 202, 330, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Rumah_Sakit/assets/Background fix.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void jbuttonadmin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonadmin2ActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jbuttonadmin2ActionPerformed

    private void jbuttonadmin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonadmin1ActionPerformed
        // TODO add your handling code here:
        String username = usernameField.getText();
        String password = String.copyValueOf(passwordField.getPassword());
        String role = roleChoice.getSelectedItem().toString().toLowerCase();
        String data[] = {username, password, role};
        
        manager.save_admin(user_id, data);
        parent.refreshTable();
        dispose();
    }//GEN-LAST:event_jbuttonadmin1ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdminForm af = new AdminForm(-1, null, new Admin(null));
                af.setTitle("HeXa Hospital Management System");
                af.setSize(367, 512);
                af.setLocationRelativeTo(null);
                af.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                af.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelhexa;
    private javax.swing.JPanel jPanelbiru;
    private javax.swing.JButton jbuttonadmin1;
    private javax.swing.JButton jbuttonadmin2;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JComboBox<String> roleChoice;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
