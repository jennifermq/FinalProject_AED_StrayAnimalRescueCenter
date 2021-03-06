/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.AdoptionInspectorRole;

import Business.Adoption.AdoptionHistory;
import Business.Adoption.AdoptionOffering;
import Business.Adoption.AdoptionRecord;
import Business.Animal.Animal;
import Business.Date.Date;
import Business.Delivery.DeliveryHistory;
import Business.Enterprise.RescueCenterEnterprise;
import Interface.AdoptorRole.MyAdoptionsJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class EvaluateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EvaluateJPanel
     */
    
    private JPanel container;
    private RescueCenterEnterprise enterprise;
    private AdoptionRecord ar;
    
    EvaluateJPanel(JPanel container, RescueCenterEnterprise enterprise, AdoptionRecord ar) {
        initComponents();
        this.container = container;
        this.enterprise = enterprise;
        this.ar = ar;
        rbtnApprove.setSelected(true);
        txtMessage.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rbtnApprove = new javax.swing.JRadioButton();
        rbtnReject = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMessage = new javax.swing.JTextArea();
        btnSubmit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        txtMonth = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Evaluate Applicant");

        jLabel2.setFont(new java.awt.Font("宋体", 0, 16)); // NOI18N
        jLabel2.setText("Result:");

        jLabel3.setFont(new java.awt.Font("宋体", 0, 16)); // NOI18N
        jLabel3.setText("Reason:");

        rbtnApprove.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        rbtnApprove.setText("Approve");
        rbtnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnApproveActionPerformed(evt);
            }
        });

        rbtnReject.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        rbtnReject.setText("Reject");
        rbtnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnRejectActionPerformed(evt);
            }
        });

        txtMessage.setColumns(20);
        txtMessage.setRows(5);
        txtMessage.setEnabled(false);
        jScrollPane1.setViewportView(txtMessage);

        btnSubmit.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("宋体", 0, 16)); // NOI18N
        jLabel4.setText("Delivery Date:");

        jLabel5.setText("YYYY");

        jLabel6.setText("MM");

        jLabel7.setText("DD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)
                        .addGap(86, 86, 86)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(btnSubmit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtnApprove)
                                .addGap(28, 28, 28)
                                .addComponent(rbtnReject))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addGap(8, 8, 8)
                                .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rbtnApprove)
                    .addComponent(rbtnReject))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SeeInspectionDetailJPanel sidjp = (SeeInspectionDetailJPanel) component;
        sidjp.populateButton();
        CardLayout layout = (CardLayout)container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if(rbtnApprove.isSelected() == true) {
            if(!txtYear.getText().matches("\\d{4}")) {
                JOptionPane.showMessageDialog(null, "Year is invalid");
                return;
            }
            if(txtYear.getText().matches("\\d{4}")) {
                if(Integer.parseInt(txtYear.getText()) < 2016) {
                    JOptionPane.showMessageDialog(null, "Year is invalid");
                    return;
                }
            }
            if(!txtMonth.getText().matches("\\d{1,2}")){
                JOptionPane.showMessageDialog(null, "Month is invalid");
                return;
            }
            if(txtMonth.getText().matches("\\d{1,2}")) {
                if(Integer.parseInt(txtMonth.getText()) > 12 
                        || Integer.parseInt(txtMonth.getText()) <= 0 ) {
                    JOptionPane.showMessageDialog(null, "Month is invalid");
                    return;
                }
                else if(Integer.parseInt(txtYear.getText()) == 2016
                         && Integer.parseInt(txtMonth.getText()) < 12) {
                    JOptionPane.showMessageDialog(null, "Month is invalid");
                    return;
                }
            }
            if(!txtDate.getText().matches("\\d{1,2}")){
                JOptionPane.showMessageDialog(null, "Date is invalid");
                return;
            }
            if(txtDate.getText().matches("\\d{1,2}")) {
                if(Integer.parseInt(txtDate.getText()) > 31
                        || Integer.parseInt(txtDate.getText()) <= 0 ) {
                    JOptionPane.showMessageDialog(null, "Date is invalid");
                    return;
                }
                else if(Integer.parseInt(txtYear.getText()) == 2016
                         && Integer.parseInt(txtMonth.getText()) == 12
                        && Integer.parseInt(txtDate.getText()) < 16) {
                    JOptionPane.showMessageDialog(null, "Date is invalid");
                    return;
                }
            }
        }
        
        if(rbtnReject.isSelected() == true) {
            if(txtMessage.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill out the reason for rejection.");
                return;
            }
        }
        
        if(rbtnApprove.isSelected() == true) {
            ar.setStatus(AdoptionRecord.APPROVED_STATUS);
            int size = ar.getAdoptor().getHistoryDir().getHistoryList().size();
            ar.getAdoptor().getHistoryDir().getHistoryList().get(size-1).setStatus(AdoptionHistory.APPROVED_STATUS);
            ar.getAnimal().setStatus(Animal.ADOPTED_STATUS);
            DeliveryHistory dh = new DeliveryHistory();
            dh.setAdopter(ar.getAdoptor());
            dh.setAnimal(ar.getAnimal());
            dh.setStatus(DeliveryHistory.WAITING_STATUS);

            int year = Integer.parseInt(txtYear.getText());
            int month = Integer.parseInt(txtMonth.getText());
            int date = Integer.parseInt(txtDate.getText());
            Date d = new Date();
            d.setYear(year);
            d.setMonth(month);
            d.setDate(date);
            dh.setDate(d);
            enterprise.getDeliveryHistoryDir().addDeliveryHistory(dh);
        }
        else if(rbtnReject.isSelected() == true) {
            ar.setStatus(AdoptionRecord.REJECTED_STATUS);
            int size = ar.getAdoptor().getHistoryDir().getHistoryList().size();
            ar.getAdoptor().getHistoryDir().getHistoryList().get(size-1).setMessage(txtMessage.getText());
            ar.getAdoptor().getHistoryDir().getHistoryList().get(size-1).setStatus(AdoptionHistory.REJECTED_STATUS);
            for(AdoptionOffering ao: enterprise.getAdoptionList().getAdoptionOfferingList()) {
                if(ao.getAnimal() == ar.getAnimal()) {
                    ao.setStatus(AdoptionOffering.OPEN_STATUS);
                }
            }
        }
        
        btnSubmit.setVisible(false);
        JOptionPane.showMessageDialog(null, "Evaluated Successfully.\nResult has been sent.");
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void rbtnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnApproveActionPerformed
        // TODO add your handling code here:
        rbtnReject.setSelected(false);
        txtMessage.setEnabled(false);
        txtYear.setEnabled(true);
        txtMonth.setEnabled(true);
        txtDate.setEnabled(true);
    }//GEN-LAST:event_rbtnApproveActionPerformed

    private void rbtnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnRejectActionPerformed
        // TODO add your handling code here:
        rbtnApprove.setSelected(false);
        txtMessage.setEnabled(true);
        txtYear.setEnabled(false);
        txtMonth.setEnabled(false);
        txtDate.setEnabled(false);
    }//GEN-LAST:event_rbtnRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtnApprove;
    private javax.swing.JRadioButton rbtnReject;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextArea txtMessage;
    private javax.swing.JTextField txtMonth;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
