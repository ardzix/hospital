/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rumah_Sakit;

import java.util.Arrays;
import javax.swing.JFrame;

/**
 *
 * @author ardzix
 */
public class MedicineForm extends javax.swing.JFrame {
    private DataManager manager;
    private int medicine_id;
    private Medicine parent = new Medicine(null);
    /**
     * Creates new form AdminForm
     */
    public MedicineForm(int user_id, DataManager manager, Medicine parent) {
        initComponents();
        initDatas(user_id, manager);
        this.parent = parent;
    }

    public void initDatas(int medicine_id, DataManager manager){       
        this.manager = manager;
        this.medicine_id = medicine_id;
        if(manager==null){
            jbuttonadmin1.setEnabled(false);
        }    
        
        if(medicine_id>=0 && manager!=null){
            Object[] medicine = manager.get_medicine(medicine_id);
            nameField.setText((String) medicine[1]);
            priceField.setText((String) medicine[2]);
            ingredientsField.setText((String) medicine[3]);
            effectsField.setText((String) medicine[4]);
            best_forField.setText((String) medicine[5]);
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

        jPanelbiru = new javax.swing.JPanel();
        jLabelhexa = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbuttonadmin2 = new javax.swing.JButton();
        jbuttonadmin1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ingredientsField = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        effectsField = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        best_forField = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelbiru.setBackground(new java.awt.Color(34, 167, 240));

        jLabelhexa.setBackground(new java.awt.Color(228, 241, 254));
        jLabelhexa.setFont(new java.awt.Font("Trajan Pro", 0, 24)); // NOI18N
        jLabelhexa.setForeground(new java.awt.Color(240, 240, 240));
        jLabelhexa.setText("MEDICINE - HeXa HOSPITAL");

        javax.swing.GroupLayout jPanelbiruLayout = new javax.swing.GroupLayout(jPanelbiru);
        jPanelbiru.setLayout(jPanelbiruLayout);
        jPanelbiruLayout.setHorizontalGroup(
            jPanelbiruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelbiruLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelhexa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelbiruLayout.setVerticalGroup(
            jPanelbiruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelbiruLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabelhexa, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jLabel1.setText("Name:");

        nameField.setName("nameField"); // NOI18N
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Price:");

        jLabel3.setText("Ingredients:");

        jbuttonadmin2.setBackground(new java.awt.Color(228, 241, 254));
        jbuttonadmin2.setFont(new java.awt.Font("Gill Sans MT", 2, 18)); // NOI18N
        jbuttonadmin2.setForeground(new java.awt.Color(34, 167, 240));
        jbuttonadmin2.setText("Close");
        jbuttonadmin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonadmin2ActionPerformed(evt);
            }
        });

        jbuttonadmin1.setBackground(new java.awt.Color(228, 241, 254));
        jbuttonadmin1.setFont(new java.awt.Font("Gill Sans MT", 2, 18)); // NOI18N
        jbuttonadmin1.setForeground(new java.awt.Color(34, 167, 240));
        jbuttonadmin1.setText("Save");
        jbuttonadmin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonadmin1ActionPerformed(evt);
            }
        });

        ingredientsField.setColumns(20);
        ingredientsField.setRows(5);
        jScrollPane1.setViewportView(ingredientsField);

        effectsField.setColumns(20);
        effectsField.setRows(5);
        jScrollPane2.setViewportView(effectsField);

        jLabel4.setText("Effects:");

        best_forField.setColumns(20);
        best_forField.setRows(5);
        jScrollPane3.setViewportView(best_forField);

        jLabel5.setText("Used for:");

        priceField.setName("nameField"); // NOI18N
        priceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelbiru, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbuttonadmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbuttonadmin2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(231, 231, 231))
                            .addComponent(priceField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanelbiru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbuttonadmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbuttonadmin2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void jbuttonadmin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonadmin2ActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jbuttonadmin2ActionPerformed

    private void jbuttonadmin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonadmin1ActionPerformed
        // TODO add your handling code here:
        String name = nameField.getText();
        String price = priceField.getText();
        String ingredients = ingredientsField.getText();
        String effects = effectsField.getText();
        String best_for = best_forField.getText();
        String data[] = {name, price, ingredients, effects, best_for};
        
        manager.save_medicine(medicine_id, data);
        parent.refreshTable();
        dispose();
    }//GEN-LAST:event_jbuttonadmin1ActionPerformed

    private void priceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceFieldActionPerformed

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
            java.util.logging.Logger.getLogger(MedicineForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicineForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicineForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicineForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MedicineForm af = new MedicineForm(-1, null, new Medicine(null));
                af.setTitle("HeXa Hospital Management System");
                af.setSize(564, 620);
                af.setLocationRelativeTo(null);
                af.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                af.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea best_forField;
    private javax.swing.JTextArea effectsField;
    private javax.swing.JTextArea ingredientsField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelhexa;
    private javax.swing.JPanel jPanelbiru;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbuttonadmin1;
    private javax.swing.JButton jbuttonadmin2;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField priceField;
    // End of variables declaration//GEN-END:variables
}
