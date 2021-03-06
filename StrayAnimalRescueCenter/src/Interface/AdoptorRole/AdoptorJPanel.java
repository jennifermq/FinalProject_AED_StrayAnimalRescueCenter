/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.AdoptorRole;

import Business.Adoption.Adopter;
import Business.EcoSystem.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class AdoptorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdoptorJPanel
     */
    private JPanel container;
    private EcoSystem business;
    private Adopter adoptor;
    
    public AdoptorJPanel(JPanel container, EcoSystem business, Adopter adoptor) {
        initComponents();
        this.container  = container;
        this.business = business;
        this.adoptor = adoptor;
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
        btnMyAdoptions = new javax.swing.JButton();
        btnAdoptionList = new javax.swing.JButton();
        btnEditInfo = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Welcome To Animal Rescue Center!");

        btnMyAdoptions.setText("My Adoptions");
        btnMyAdoptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyAdoptionsActionPerformed(evt);
            }
        });

        btnAdoptionList.setText("Adoption List");
        btnAdoptionList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdoptionListActionPerformed(evt);
            }
        });

        btnEditInfo.setText("Edit Information");
        btnEditInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(167, 167, 167))
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMyAdoptions, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdoptionList, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(btnAdoptionList, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnMyAdoptions, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnEditInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMyAdoptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyAdoptionsActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) container.getLayout();
        container.add("MyAdoptionsJPanel", new MyAdoptionsJPanel(container, business, adoptor));
        layout.next(container);
    }//GEN-LAST:event_btnMyAdoptionsActionPerformed

    private void btnAdoptionListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdoptionListActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) container.getLayout();
        container.add("AdoptorListJPanel", new AdoptionListJPanel(container, business, adoptor));
        layout.next(container);
    }//GEN-LAST:event_btnAdoptionListActionPerformed

    private void btnEditInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditInfoActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) container.getLayout();
        container.add("AdoptorInformationJPanel", new AdoptorInformationJPanel(container, adoptor));
        layout.next(container);
    }//GEN-LAST:event_btnEditInfoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdoptionList;
    private javax.swing.JButton btnEditInfo;
    private javax.swing.JButton btnMyAdoptions;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
