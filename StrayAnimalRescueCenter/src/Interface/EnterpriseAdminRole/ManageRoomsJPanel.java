/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.EnterpriseAdminRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.RescueCenterEnterprise;
import Business.Organization.Organization;
import Business.Organization.VeterinarianOrg;
import Business.Role.Role;
import Business.Room.Room;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class ManageRoomsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageRoomsJPanel
     */
    
    private JPanel container;
    private RescueCenterEnterprise enterprise;
    
    public ManageRoomsJPanel(JPanel container, Enterprise enterprise) {
        initComponents();
        this.container = container;
        this.enterprise = (RescueCenterEnterprise)enterprise;
        populateTable();
        populateComboBox();
    }
    
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblRoom.getModel();
        
        model.setRowCount(0);
        
        for (Room room : enterprise.getRoomDir().getRoomList()){
            Object[] row = new Object[2];
            row[0] = room.getRoomId();
            row[1] = room.getVete();
            
            model.addRow(row);
        }
    }
    
    public void populateComboBox() {
        cboxVete.removeAllItems();
        for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()){
                //if(ua.getRole() instanceof VeterinarianRole) {
                    cboxVete.addItem(ua.getEmployee());
               // }
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

        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRoom = new javax.swing.JTable();
        cboxVete = new javax.swing.JComboBox();
        txtId = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblRoom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room", "Veterinarian"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRoom);

        cboxVete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxVeteActionPerformed(evt);
            }
        });

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel5.setText("Veterinarian");

        jLabel1.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel1.setText("Room Id");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCreate)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnBack)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(187, 187, 187)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cboxVete, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addComponent(btnCreate)
                        .addGap(78, 78, 78))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cboxVete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cboxVeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxVeteActionPerformed
       
    }//GEN-LAST:event_cboxVeteActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        String id = txtId.getText();
        Room r = new Room();
        r.setRoomId(id);
        r.setVete((Employee)cboxVete.getSelectedItem());
        r.setStatus(Room.AVAIL_STATUS);
        enterprise.getRoomDir().addRoom(r);
        populateTable();
    }//GEN-LAST:event_btnCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JComboBox cboxVete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRoom;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}