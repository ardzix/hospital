/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rumah_Sakit;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Admin extends JFrame {

    private DataManager manager;
    private int selected_row = -1;
    private ArrayList<Integer> ids = new ArrayList<Integer>();
    /**
     * Creates new form Admin
     */
    public Admin(DataManager manager) {
        initComponents();
        initDatas(manager);
    }
    
    public void initDatas(DataManager manager){
        this.manager = manager;
        System.out.println(manager);
        refreshTable();
        jbuttonedit.setEnabled(false);
        jbuttondelete.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanelbiru = new javax.swing.JPanel();
        jLabelhexa = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbuttonnew = new javax.swing.JButton();
        jbuttonedit = new javax.swing.JButton();
        jbuttondelete = new javax.swing.JButton();
        jButtonlogout = new javax.swing.JButton();
        jButtonclose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Rumah_Sakit/assets/Hospital-compress2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 100));

        jPanelbiru.setBackground(new java.awt.Color(34, 167, 240));

        jLabelhexa.setBackground(new java.awt.Color(228, 241, 254));
        jLabelhexa.setFont(new java.awt.Font("Trajan Pro", 0, 24)); // NOI18N
        jLabelhexa.setForeground(new java.awt.Color(240, 240, 240));
        jLabelhexa.setText("DATA ADMINISTRATOR HEXA HOSPITAL");

        javax.swing.GroupLayout jPanelbiruLayout = new javax.swing.GroupLayout(jPanelbiru);
        jPanelbiru.setLayout(jPanelbiruLayout);
        jPanelbiruLayout.setHorizontalGroup(
            jPanelbiruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelbiruLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jLabelhexa, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        jPanelbiruLayout.setVerticalGroup(
            jPanelbiruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelbiruLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelhexa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelbiru, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 16, 660, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Username", "Role"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 118, 803, 319));

        jbuttonnew.setBackground(new java.awt.Color(228, 241, 254));
        jbuttonnew.setFont(new java.awt.Font("Gill Sans MT", 2, 18)); // NOI18N
        jbuttonnew.setForeground(new java.awt.Color(34, 167, 240));
        jbuttonnew.setText("New");
        jbuttonnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonnewActionPerformed(evt);
            }
        });
        getContentPane().add(jbuttonnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 448, 120, 40));

        jbuttonedit.setBackground(new java.awt.Color(228, 241, 254));
        jbuttonedit.setFont(new java.awt.Font("Gill Sans MT", 2, 18)); // NOI18N
        jbuttonedit.setForeground(new java.awt.Color(34, 167, 240));
        jbuttonedit.setText("Edit");
        jbuttonedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttoneditActionPerformed(evt);
            }
        });
        getContentPane().add(jbuttonedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 448, 120, 40));

        jbuttondelete.setBackground(new java.awt.Color(228, 241, 254));
        jbuttondelete.setFont(new java.awt.Font("Gill Sans MT", 2, 18)); // NOI18N
        jbuttondelete.setForeground(new java.awt.Color(34, 167, 240));
        jbuttondelete.setText("Delete");
        jbuttondelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttondeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jbuttondelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 448, 120, 40));

        jButtonlogout.setBackground(new java.awt.Color(242, 38, 19));
        jButtonlogout.setFont(new java.awt.Font("Gill Sans MT", 2, 12)); // NOI18N
        jButtonlogout.setText("LOGOUT");
        jButtonlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonlogoutActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, 82, 40));

        jButtonclose.setBackground(new java.awt.Color(0, 153, 153));
        jButtonclose.setFont(new java.awt.Font("Gill Sans MT", 2, 12)); // NOI18N
        jButtonclose.setText("CLOSE");
        jButtonclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncloseActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, 82, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Rumah_Sakit/assets/Background fix.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbuttonnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonnewActionPerformed
        AdminForm af = new AdminForm(-1, manager, this);
        af.setTitle("HeXa Hospital Management System");
        af.setSize(367, 512);
        af.setLocationRelativeTo(null);
        af.setVisible(true);       
    }//GEN-LAST:event_jbuttonnewActionPerformed

    private void jbuttoneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttoneditActionPerformed
        AdminForm af = new AdminForm(ids.get(selected_row), manager, this);
        af.setTitle("HeXa Hospital Management System");
        af.setSize(367, 512);
        af.setLocationRelativeTo(null);
        af.setVisible(true); 
    }//GEN-LAST:event_jbuttoneditActionPerformed

    private void jbuttondeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttondeleteActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure want to delete this data?","Warning",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION){
            manager.delete_admin(ids.get(selected_row));
            refreshTable();
        }
    }//GEN-LAST:event_jbuttondeleteActionPerformed

    private void jButtonlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonlogoutActionPerformed
        Menu_Utama mu = new Menu_Utama();
        mu.setTitle("HeXa Hospital Management System");
        mu.setSize(800,540);
        mu.setLocationRelativeTo(null);
        mu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonlogoutActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        selectRow(jTable1.getSelectedRow());
        jbuttonedit.setEnabled(true);
        jbuttondelete.setEnabled(true);
        System.out.println("Selected row "+jTable1.getSelectedRow());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtoncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncloseActionPerformed
        dispose();
    }//GEN-LAST:event_jButtoncloseActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Admin a = new Admin(null);
                a.setTitle("HeXa Hospital Management System");
                a.setSize(800,540);
                a.setLocationRelativeTo(null);
                a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                a.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonclose;
    private javax.swing.JButton jButtonlogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelhexa;
    private javax.swing.JPanel jPanelbiru;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbuttondelete;
    private javax.swing.JButton jbuttonedit;
    private javax.swing.JButton jbuttonnew;
    // End of variables declaration//GEN-END:variables

    private void selectRow(int selectedRow) {
        selected_row = selectedRow;
    }
    public void refreshTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        if(manager!=null){
            ArrayList<Object> admins = manager.get_admins();
            ids.clear();
            for(int i=0; i<admins.size(); i++){
                model.addRow((Object[]) admins.get(i));
                Object id = (int)((Object[]) admins.get(i))[0];
                ids.add((Integer) id);
            }  
        }else{
            model.addRow(new Object[]{"Column 1", "Column 2", "Column 3"});
        }
    }
}
