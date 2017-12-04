/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.VeterinarianRole;

import Business.Animal.Animal;
import Business.Date.Date;
import Business.EcoSystem.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.RescueCenterEnterprise;
import Business.Organization.VeterinarianOrg;
import Business.RescueRecord.RescueRecord;
import Business.Room.Room;
import Business.Treatment.TreatmentRecord;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.TreatmentWorkRequest;
import Business.WorkQueue.WorkRequest;
import Interface.ReceptionistRole.RegisterAnimalJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class VeterinarianWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VeterinarianWorkAreaJPanel
     */
    
    private JPanel container;
    private RescueCenterEnterprise enterprise;
    private VeterinarianOrg organization;
    private UserAccount userAccount;

    public VeterinarianWorkAreaJPanel(JPanel container, RescueCenterEnterprise enterprise, VeterinarianOrg veterinarianOrg, UserAccount userAccount) {
        initComponents();
        this.container = container;
        this.enterprise = enterprise;
        this.organization = veterinarianOrg;
        this.userAccount = userAccount;
        System.out.println(enterprise.getName());
        
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)tblTreatmentRequest.getModel();
        model.setRowCount(0);
        
        for(RescueRecord r: enterprise.getRecordDir().getRescueRecordList()){
            if(r.getRoom() == null) {
                Object[] row = new Object[4];
                row[0] = r;
                row[1] = r.getAnimal();
                row[2] = r.getAnimal().getType();
                row[3] = r.getAnimal().getColor();
                model.addRow(row);
            }
        }
    }

    public Date getDateAfterNDays(Date d, int n) {
        Date after = new Date();
        //runnian Febrary
        if( ( (d.getYear()%400 != 0 && d.getYear()%4 == 0) || (d.getYear()%400 == 0)) && d.getMonth() == 2) {
            if(d.getDate() < 29-n) {
                after.setYear(d.getYear());
                after.setMonth(d.getMonth());
                after.setDate(d.getDate() + n);
            }
            else {
                after.setYear(d.getYear());
                after.setMonth(d.getMonth() + 1);
                after.setDate(d.getDate() + n - 29);
            }
        }
        //pingnian febrary
        else if(d.getYear()%4 != 0 && d.getMonth() == 2) {
            if(d.getDate() < 28-n) {
                after.setYear(d.getYear());
                after.setMonth(d.getMonth());
                after.setDate(d.getDate() + n);
            }
            else {
                after.setYear(d.getYear());
                after.setMonth(d.getMonth() + 1);
                after.setDate(d.getDate() + n - 28);
            }
        }
        //pingnian 30tian
        else if(d.getMonth() == 4 || d.getMonth() == 6 || d.getMonth() == 9 || d.getMonth() == 11) {
            if(d.getDate() <= 30-n) {
                after.setYear(d.getYear());
                after.setMonth(d.getMonth());
                after.setDate(d.getDate() + n);
            }
            else {
                after.setYear(d.getYear());
                after.setMonth(d.getMonth() + 1);
                after.setDate(d.getDate() + n -30);
            }
        }
        //pingnian 31tian
        else {
            if(d.getDate() <= 31-n) {
                after.setYear(d.getYear());
                after.setMonth(d.getMonth());
                after.setDate(d.getDate() + n);
            }
            else {
                if(d.getMonth()<=11) {
                    after.setYear(d.getYear());
                    after.setMonth(d.getMonth() + 1);
                    after.setDate(d.getDate() + n - 31);
                }
                else {
                    after.setYear(d.getYear() + 1);
                    after.setMonth(1);
                    after.setDate(d.getDate() + n - 31);
                }
            }
        }
        return after;
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
        tblTreatmentRequest = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Veterinarian WorkArea");

        tblTreatmentRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date(MM/DD/YYYY)", "Animal Id", "Animal Type", "Color"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTreatmentRequest);

        btnAssign.setText("Assign To Me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAssign)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(260, 260, 260))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblTreatmentRequest.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        RescueRecord record = (RescueRecord)tblTreatmentRequest.getValueAt(selectedRow, 0);
        UserAccount ua = userAccount;
        for(Room r: enterprise.getRoomDir().getRoomList()) {
            if(r.getVete() == ua.getEmployee()) {
                record.setRoom(r);
            }
        }
        
        Date d = new Date();
        d.setYear(record.getDate().getYear());
        d.setMonth(record.getDate().getMonth());
        d.setDate(record.getDate().getDate());
        record.setDate(d);
        Date after = getDateAfterNDays(record.getDate(),7);
        record.getAnimal().setNextReview(after);
        
        TreatmentRecord treatment = new TreatmentRecord();
        treatment.setAnimal(record.getAnimal());
        treatment.setRoom(record.getRoom());
        treatment.setDate(record.getDate());
        System.out.println("treatment animal: " + treatment.getAnimal().getAnimalId());
        System.out.println("treatment date: " + treatment.getDate());
        System.out.println("treatmentDir: " + record.getAnimal().getTreatmentDir());
        treatment.getAnimal().getTreatmentDir().addTreatmentRecord(treatment);
        
        CardLayout layout = (CardLayout) container.getLayout();
        container.add("TreatJPanel", new TreatJPanel(container, enterprise, userAccount, record, treatment));
        layout.next(container);
        
    }//GEN-LAST:event_btnAssignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTreatmentRequest;
    // End of variables declaration//GEN-END:variables
}
