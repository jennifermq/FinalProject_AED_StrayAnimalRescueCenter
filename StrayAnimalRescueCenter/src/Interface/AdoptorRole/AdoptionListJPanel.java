/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.AdoptorRole;

import Business.Adoption.AdoptionOfferingList;
import Business.Adoption.AdoptionOffering;
import Business.Adoption.Adopter;
import Business.EcoSystem.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.RescueCenterEnterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class AdoptionListJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdoptionListJPanel
     */
    
    private JPanel container;
    private EcoSystem business;
    private Adopter adoptor;
    
    public AdoptionListJPanel(JPanel container, EcoSystem business, Adopter adoptor) {
        initComponents();
        this.container = container;
        this.business = business;
        this.adoptor = adoptor;
        
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel)tblOffering.getModel();
        model.setRowCount(0);
        
        for(Network n: business.getNetworkList()) {
            for(Enterprise e: n.getEnterpriseDir().getEnterpriseList()) {
                if(e instanceof RescueCenterEnterprise) {
                    for(AdoptionOffering ao: ((RescueCenterEnterprise) e).getAdoptionList().getAdoptionOfferingList()) {
                        System.out.println(ao.getAnimal().getAnimalId());
                        System.out.println(ao.getPublishedDate());
                        System.out.println(ao.getStatus());
                    }
                    AdoptionOfferingList list = ((RescueCenterEnterprise) e).getAdoptionList();
                    for(AdoptionOffering ao: list.getAdoptionOfferingList()) {
                        System.out.println(ao.getStatus());
                        System.out.println(AdoptionOffering.OPEN_STATUS);
                        if(ao.getStatus() != null) {
                            if(ao.getStatus().equals(AdoptionOffering.OPEN_STATUS)) {
                                Object[] row = new Object[5];
                                row[0] = ao;
                                row[1] = ao.getAnimal().getColor();
                                row[2] = ao.getAnimal().getAge();

                                int size = ao.getAnimal().getStatusDir().getStatusDir().size();
                                row[3] = ao.getAnimal().getStatusDir().getStatusDir().get(size-1).getWeight();

                                row[4] = ao.getPublishedDate().getMonth()
                                        + "/" + ao.getPublishedDate().getDate()
                                        + "/" + ao.getPublishedDate().getYear();
                                model.addRow(row);
                            }
                        }
                    }
                }
            }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOffering = new javax.swing.JTable();
        btnSeeDetail = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Adoption List");

        tblOffering.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Animal Type", "Color", "Age", "Weight", "Published Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOffering);

        btnSeeDetail.setText("See Detail");
        btnSeeDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeeDetailActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSeeDetail)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(129, 129, 129)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSeeDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeeDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeeDetailActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOffering.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        AdoptionOffering ao = (AdoptionOffering)tblOffering.getValueAt(selectedRow, 0);
        
        CardLayout layout = (CardLayout) container.getLayout();
        container.add("SeeOfferingDetailJPanel", new SeeOfferingDetailJPanel(container, business, adoptor, ao));
        layout.next(container);
    }//GEN-LAST:event_btnSeeDetailActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout)container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSeeDetail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOffering;
    // End of variables declaration//GEN-END:variables
}