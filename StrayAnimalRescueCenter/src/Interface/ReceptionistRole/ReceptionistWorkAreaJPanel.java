/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ReceptionistRole;

import Business.Animal.Animal;
import Business.Enterprise.Enterprise;
import Business.Enterprise.RescueCenterEnterprise;
import Business.Network.Network;
import Business.Organization.CenterRegistrationOrg;
import Business.Organization.VeterinarianOrg;
import Business.RescueRecord.RescueRecord;
import Business.Room.Room;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class ReceptionistWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReceptionistWorkAreaJPanel
     */
    private JPanel container;
    private RescueCenterEnterprise enterprise;
    private CenterRegistrationOrg organization;
    private UserAccount userAccount;
    
    public ReceptionistWorkAreaJPanel(JPanel container, RescueCenterEnterprise enterprise, CenterRegistrationOrg organization, UserAccount userAccount) {
        initComponents();
        this.container = container;
        this.enterprise = enterprise;
        this.organization = organization;
        this.userAccount = userAccount;
        
        populateAnimalTable();
    }
    
   
    
    public void populateAnimalTable() {
        DefaultTableModel model = (DefaultTableModel) tblAnimal.getModel();

        model.setRowCount(0);
        for (RescueRecord r : enterprise.getRecordDir().getRescueRecordList()) {
            Object[] row = new Object[4];
            row[0] = r;
            row[1] = r.getAnimal().getAnimalId();
            row[2] = r.getAnimal().getType();
            if(r.getRoom() == null) {
                row[3] = "Waiting...";
            }
            else {
                row[3] = r.getRoom().getRoomId();
            } 
            
            model.addRow(row);
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
        tblAnimal = new javax.swing.JTable();
        btnRegister = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Center Receptionist WorkArea");

        tblAnimal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date(MM/DD/YYYY)", "Animal ID", "Animal Type", "Room"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAnimal);
        if (tblAnimal.getColumnModel().getColumnCount() > 0) {
            tblAnimal.getColumnModel().getColumn(0).setResizable(false);
            tblAnimal.getColumnModel().getColumn(1).setResizable(false);
            tblAnimal.getColumnModel().getColumn(2).setResizable(false);
            tblAnimal.getColumnModel().getColumn(3).setResizable(false);
        }

        btnRegister.setText("Register New");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRegister)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) container.getLayout();
        container.add("RequestLabTestJPanel", new RegisterAnimalJPanel(container, enterprise, userAccount));
        layout.next(container);
    }//GEN-LAST:event_btnRegisterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAnimal;
    // End of variables declaration//GEN-END:variables
}
