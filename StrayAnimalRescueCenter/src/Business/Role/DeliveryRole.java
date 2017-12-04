/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DeliveryOrg;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.DeliveryRole.DeliveryWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class DeliveryRole  extends Role{
    @Override
    public JPanel createWorkArea(JPanel container, 
            Enterprise enterprise, 
            Organization organization, 
            UserAccount userAccount, 
            EcoSystem business) {
        return new DeliveryWorkAreaJPanel(container, enterprise, (DeliveryOrg)organization, userAccount);
    }
}
