/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.RescueCenterEnterprise;
import Business.Organization.Organization;
import Business.Organization.VeterinarianOrg;
import Business.UserAccount.UserAccount;
import Interface.VeterinarianRole.VeterinarianWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class VeterinarianRole extends Role {
    public JPanel createWorkArea(JPanel container, 
            Enterprise enterprise, 
            Organization organization, 
            UserAccount userAccount, 
            EcoSystem business) {
        return new VeterinarianWorkAreaJPanel(container, (RescueCenterEnterprise)enterprise, (VeterinarianOrg)organization, userAccount);
    }
}
