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
import Business.Organization.PharmacyOrg;
import Business.UserAccount.UserAccount;
import Interface.PharmacistRole.PharmacistWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class PharmacistRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel container, 
            Enterprise enterprise, 
            Organization organization, 
            UserAccount userAccount, 
            EcoSystem business) {
        return new PharmacistWorkAreaJPanel(container, enterprise, (PharmacyOrg)organization, userAccount, business);
    }
}
