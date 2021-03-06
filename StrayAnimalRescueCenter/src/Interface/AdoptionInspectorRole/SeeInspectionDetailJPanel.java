/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.AdoptionInspectorRole;

import Business.Adoption.AdoptionRecord;
import Business.Adoption.Adopter;
import Business.Animal.Animal;
import Business.Enterprise.RescueCenterEnterprise;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class SeeInspectionDetailJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SeeInspectionDetailJPanel
     */
    
    private JPanel container;
    private AdoptionRecord ar;
    private RescueCenterEnterprise enterprise;
    
    SeeInspectionDetailJPanel(JPanel container, RescueCenterEnterprise enterprise, AdoptionRecord ar) {
        initComponents();
        this.container = container;
        this.enterprise = enterprise;
        this.ar = ar;
        btnEvaluate.setVisible(false);
        
        populateButton();
        populateValues();
    }
    
    public void populateButton() {
        if(ar.getStatus().equals(AdoptionRecord.APPROVED_STATUS) 
                || ar.getStatus().equals(AdoptionRecord.REJECTED_STATUS )
                || ar.getStatus().equals(AdoptionRecord.INPROGRESS_STATUS)) {
            btnEvaluate.setVisible(false);
        }
        else {
            btnEvaluate.setVisible(true);
        }
    }
    
    public void populateValues() {
        Animal animal = ar.getAnimal();
        Adopter adopter = ar.getAdoptor();
        
        lblAnimalId.setText(String.valueOf(animal.getAnimalId()));
        lblType.setText(animal.getType().getValue());
        lblColor.setText(animal.getColor());
        
        lblSsn.setText(adopter.getSsn());
        lblFirstName.setText(adopter.getFirstName());
        lblLastName.setText(adopter.getLastName());
        lblPhone.setText(adopter.getPhoneNum());
        lblEmail.setText(adopter.getEmail());
        lblStreet.setText(adopter.getAddress().getStreet());
        lblCity.setText(adopter.getAddress().getCity());
        lblState.setText(adopter.getAddress().getState());
        
        int size = adopter.getHistoryDir().getHistoryList().size();
        if(size == 1) {
            lblHasHistory.setText("No");
        }
        else {
            lblHasHistory.setText("Yes");
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
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblAnimalId = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblSsn = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblStreet = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblHasHistory = new javax.swing.JLabel();
        btnEvaluate = new javax.swing.JButton();
        lblCity = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Inspection Detail");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel2.setText("Animal Type:");

        jLabel3.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel3.setText("Color:");

        lblColor.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblColor.setText("<value>");

        lblType.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblType.setText("<value>");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Animal Info");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Adoptor Info");

        jLabel7.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel7.setText("Animal ID:");

        lblAnimalId.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblAnimalId.setText("<value>");

        jLabel8.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel8.setText("Social Security:");

        jLabel6.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel6.setText("First Name:");

        jLabel9.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel9.setText("Last Name:");

        lblLastName.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblLastName.setText("<value>");

        lblFirstName.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblFirstName.setText("<value>");

        lblSsn.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblSsn.setText("<value>");

        jLabel10.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel10.setText("Address:");

        jLabel11.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel11.setText("Email:");

        jLabel12.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel12.setText("Phone Number:");

        lblStreet.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblStreet.setText("<value>");

        lblEmail.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblEmail.setText("<value>");

        lblPhone.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblPhone.setText("<value>");

        jLabel13.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel13.setText("Has Adoption History:");

        lblHasHistory.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblHasHistory.setText("<value>");

        btnEvaluate.setText("Evaluate");
        btnEvaluate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvaluateActionPerformed(evt);
            }
        });

        lblCity.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblCity.setText("<value>");

        lblState.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblState.setText("<value>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnBack))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel4)))
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel7)
                                .addGap(52, 52, 52)
                                .addComponent(lblAnimalId, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(52, 52, 52)
                                    .addComponent(lblColor, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(52, 52, 52)
                                    .addComponent(lblType, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel6))
                                        .addGap(52, 52, 52)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblLastName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblFirstName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(52, 52, 52)
                                        .addComponent(lblSsn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel13))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(52, 52, 52)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblHasHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(1, 1, 1))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(52, 52, 52)
                                        .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblState, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(btnEvaluate)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(lblAnimalId))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblType)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblColor)
                                    .addComponent(jLabel3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btnEvaluate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(lblSsn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(lblFirstName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(lblPhone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStreet)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblState)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHasHistory)
                    .addComponent(jLabel13))
                .addGap(48, 48, 48))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        MyInspectionsJPanel mijp = (MyInspectionsJPanel) component;
        mijp.populateTable();
        CardLayout layout = (CardLayout)container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnEvaluateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluateActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) container.getLayout();
        container.add("EvaluateJPanel", new EvaluateJPanel(container, enterprise, ar));
        layout.next(container);
    }//GEN-LAST:event_btnEvaluateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEvaluate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAnimalId;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblHasHistory;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblSsn;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblStreet;
    private javax.swing.JLabel lblType;
    // End of variables declaration//GEN-END:variables
}
