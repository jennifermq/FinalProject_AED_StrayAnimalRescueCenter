    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package Business.Role;

import Business.EcoSystem.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CageOrg;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.VeteAssistantRole.VeteAssistantWorkAreaJPanel;
import javax.swing.JPanel;

    /**
 *
 * @author user
 */
public class VeteAssistantRole extends Role {
    public JPanel createWorkArea(JPanel container, 
            Enterprise enterprise, 
            Organization organization, 
            UserAccount userAccount, 
            EcoSystem business) {
        return new VeteAssistantWorkAreaJPanel(container, enterprise, (CageOrg)organization, userAccount);
    }
}
