/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.AdoptorRole;

import Business.Adoption.AdoptionHistory;
import Business.Adoption.AdoptionOffering;
import Business.Adoption.AdoptionRecord;
import Business.Adoption.Adopter;
import Business.Animal.Animal;
import Business.Animal.Cat;
import Business.Animal.Dog;
import Business.Date.Date;
import Business.EcoSystem.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.RescueCenterEnterprise;
import Business.Network.Network;
import Business.Organization.AdoptionOrg;
import Business.Organization.Organization;
import Business.RescueRecord.RescueRecord;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class SeeOfferingDetailJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SeeOfferingDetailJPanel
     */
    
    private JPanel container;
    private AdoptionOffering ao;
    private Adopter adoptor;
    private EcoSystem business;
    
    public SeeOfferingDetailJPanel(JPanel container, EcoSystem business, Adopter adoptor, AdoptionOffering ao) {
        initComponents();
        this.container = container;
        this.ao = ao;
        this.adoptor = adoptor;
        this.business = business;
        
        populateValues();
    }

    public void populateValues() {
        Animal a = ao.getAnimal();
        lblType.setText(a.getType().getValue());
        lblColor.setText(a.getColor());
        lblAge.setText(String.valueOf(a.getAge()));
        if(a instanceof Dog) {
            lblBreed.setText(((Dog) a).getBreed());
        } 
        else if(a instanceof Cat) {
            lblBreed.setText(((Cat) a).getBreed());
        }
        else {
            lblBreed.setText("None");
        }
        
        int size = ao.getAnimal().getStatusDir().getStatusDir().size();
        double weight = ao.getAnimal().getStatusDir().getStatusDir().get(size-1).getWeight();
        lblWeight.setText(String.valueOf(weight));
        
        String location = "Unknown";
        for(Network n: business.getNetworkList()) {
            for(Enterprise e: n.getEnterpriseDir().getEnterpriseList()) {
                if(e instanceof RescueCenterEnterprise) {
                    for(RescueRecord rr: ((RescueCenterEnterprise) e).getRecordDir().getRescueRecordList()) {
                        location = rr.getLocationFound();
                    }
                }
            }
        }
        lblLocation.setText(location);
        /*
        if(a.isIsSterilized()) {
            lblSterilized.setText("Yes");
        }
        else {
            lblSterilized.setText("No");
        }
        */
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
        jLabel2 = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblWeight = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        lblSterilized = new javax.swing.JLabel();
        btnAdopt = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lblBreed = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Animal Detail Information");

        jLabel2.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel2.setText("Type:");

        lblType.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblType.setText("<value>");

        lblColor.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblColor.setText("<value>");

        jLabel3.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel3.setText("Color:");

        lblAge.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblAge.setText("<value>");

        jLabel4.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel4.setText("Age:");

        lblWeight.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblWeight.setText("<value>");

        jLabel5.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel5.setText("Weight:");

        jLabel7.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel7.setText("Location Found:");

        jLabel8.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel8.setText("Sterilized or Not:");

        lblLocation.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblLocation.setText("<value>");

        lblSterilized.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblSterilized.setText("Yes");

        btnAdopt.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        btnAdopt.setText("Adopt");
        btnAdopt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdoptActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel9.setText("Breed:");

        lblBreed.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblBreed.setText("<value>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(178, 178, 178)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblSterilized, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addGap(171, 171, 171)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(77, 77, 77)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(52, 52, 52)
                                            .addComponent(lblWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(52, 52, 52)
                                            .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel3))
                                            .addGap(52, 52, 52)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblColor, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblType, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(52, 52, 52)
                                            .addComponent(lblBreed, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(btnAdopt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblColor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblAge))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblBreed))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblWeight)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(lblLocation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblSterilized))
                .addGap(42, 42, 42)
                .addComponent(btnAdopt)
                .addContainerGap(118, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdoptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdoptActionPerformed
        // TODO add your handling code here:
        AdoptionHistory history = new AdoptionHistory();
        history.setAnimal(ao.getAnimal());
        history.setStatus(AdoptionHistory.SUBMITTED_STATUS);
        
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR); 
        int month = c.get(Calendar.MONTH); 
        int date = c.get(Calendar.DATE); 
        Date hd = new Date();
        hd.setYear(year);
        hd.setMonth(month);
        hd.setDate(date);
        history.setDate(hd);
        
        adoptor.getHistoryDir().addAdoptionHistory(history);
        ao.setStatus(AdoptionOffering.CLOSE_STATUS);
        
        AdoptionRecord adoptionRecord = new AdoptionRecord();
        adoptionRecord.setAdoptor(adoptor);
        adoptionRecord.setAnimal(ao.getAnimal());
        adoptionRecord.setDate(hd);
        adoptionRecord.setStatus(AdoptionRecord.SUBMITTED_STATUS);
        
        for(Network n: business.getNetworkList()) {
            for(Enterprise e: n.getEnterpriseDir().getEnterpriseList()) {
                if(e instanceof RescueCenterEnterprise) {
                    for(Organization o: e.getOrganizationDirectory().getOrganizationList()) {
                         if(o instanceof AdoptionOrg) {
                             ((AdoptionOrg) o).getAdoptionRecordDir().addAdoptionRecord(adoptionRecord);
                         }
                    }
                }
            }
        }
        btnAdopt.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Adoption application has been submitted.");
    }//GEN-LAST:event_btnAdoptActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AdoptionListJPanel aljp = (AdoptionListJPanel) component;
        aljp.populateTable();
        CardLayout layout = (CardLayout)container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdopt;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBreed;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblSterilized;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel lblWeight;
    // End of variables declaration//GEN-END:variables
}
