/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rumah_Sakit;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

public class AppointmentProccessForm extends javax.swing.JFrame {
    private DataManager manager;
    private int appointment_id;
    private Appointment parent = new Appointment(null);
    /**
     * Creates new form AdminForm
     */
    public AppointmentProccessForm(int appointment_id, DataManager manager, Appointment parent) {
        initComponents();
        
        if(manager!=null){
            if(manager.is_doctor()){
                saveButton.setEnabled(true);
            }
        }
        initDatas(appointment_id, manager);
        this.parent = parent;
    }

    public void initDatas(int appointment_id, DataManager manager){       
        this.manager = manager;
        this.appointment_id = appointment_id;
        
        ArrayList<Object> medicines = manager.get_medicines();
        DefaultListModel<String> model = new DefaultListModel<>();
        medicineList.setModel(model);
        for(int i=0; i<medicines.size(); i++){
            model.addElement(((Object[]) medicines.get(i))[1].toString());
        }  
        
        if(manager==null){
            saveButton.setEnabled(false);
        }    
        
        if(appointment_id>=0 && manager!=null){
            Object[] appointment = manager.get_appointment_joined(appointment_id);
            patientLabel.setText("Patient: " + (String) appointment[2]);
            doctorLabel.setText("Doctor: " + (String) appointment[1]);
            complaintField.setText((String) appointment[3]);
            diagnoseField.setText((String) appointment[4]);
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

        jLabel1 = new javax.swing.JLabel();
        jPanelbiru = new javax.swing.JPanel();
        jLabelhexa = new javax.swing.JLabel();
        patientLabel = new javax.swing.JLabel();
        doctorLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        complaintField = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        diagnoseField = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        medicineList = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        printButton = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelbiru.setBackground(new java.awt.Color(34, 167, 240));

        jLabelhexa.setBackground(new java.awt.Color(228, 241, 254));
        jLabelhexa.setFont(new java.awt.Font("Trajan Pro", 0, 24)); // NOI18N
        jLabelhexa.setForeground(new java.awt.Color(240, 240, 240));
        jLabelhexa.setText("ADD MEDICINE HEXA HOSPITAL");

        javax.swing.GroupLayout jPanelbiruLayout = new javax.swing.GroupLayout(jPanelbiru);
        jPanelbiru.setLayout(jPanelbiruLayout);
        jPanelbiruLayout.setHorizontalGroup(
            jPanelbiruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelbiruLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelhexa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelbiruLayout.setVerticalGroup(
            jPanelbiruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelbiruLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabelhexa, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanelbiru, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 16, 450, -1));

        patientLabel.setText("Patient:");
        getContentPane().add(patientLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        doctorLabel.setText("Doctor:");
        getContentPane().add(doctorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        jLabel3.setText("Medicines/Services:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        closeButton.setBackground(new java.awt.Color(228, 241, 254));
        closeButton.setFont(new java.awt.Font("Gill Sans MT", 2, 18)); // NOI18N
        closeButton.setForeground(new java.awt.Color(34, 167, 240));
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, 70, 40));

        saveButton.setBackground(new java.awt.Color(228, 241, 254));
        saveButton.setFont(new java.awt.Font("Gill Sans MT", 2, 18)); // NOI18N
        saveButton.setForeground(new java.awt.Color(34, 167, 240));
        saveButton.setText("Save");
        saveButton.setEnabled(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 80, 40));

        complaintField.setColumns(20);
        complaintField.setRows(5);
        complaintField.setEnabled(false);
        jScrollPane1.setViewportView(complaintField);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 260, 120));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabel4.setText("Diagnose:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        diagnoseField.setColumns(20);
        diagnoseField.setRows(5);
        jScrollPane2.setViewportView(diagnoseField);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 260, 140));

        medicineList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(medicineList);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 260, 220));

        jLabel5.setText("Complaint:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 176, -1, -1));

        printButton.setBackground(new java.awt.Color(228, 241, 254));
        printButton.setFont(new java.awt.Font("Gill Sans MT", 2, 18)); // NOI18N
        printButton.setForeground(new java.awt.Color(34, 167, 240));
        printButton.setText("Print");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });
        getContentPane().add(printButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 80, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_closeButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        
        String complaint = complaintField.getText();
//        String data[] = {patient, doctor, complaint};        // TODO add your handling code here:
        
//        manager.save_appointment(appointment_id, data);
        parent.refreshTable();
        dispose();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AppointmentProccessForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppointmentProccessForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppointmentProccessForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppointmentProccessForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AppointmentProccessForm af = new AppointmentProccessForm(-1, null, new Appointment(null));
                af.setTitle("HeXa Hospital Management System");
                af.setSize(564, 620);
                af.setLocationRelativeTo(null);
                af.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                af.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JTextArea complaintField;
    private javax.swing.JTextArea diagnoseField;
    private javax.swing.JLabel doctorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelhexa;
    private javax.swing.JPanel jPanelbiru;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> medicineList;
    private javax.swing.JLabel patientLabel;
    private javax.swing.JButton printButton;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}