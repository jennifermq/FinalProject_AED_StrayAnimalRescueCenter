/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public abstract class Role {

   
    public enum RoleType{
        SystemAdmin("System Admin"),
        EnterpriseAdmin("Enterprise Admin"),
        CenterReceptionist("Receptionist"),
        Vete("Veterinarian"),
        VeteAssistant("Veterinarian Assistant"),
        Pharmacist("Pharmacist"),
        Delivery("Delivery"),
        ShelterReceptionist("Shelter Receptionist"),
        ShelterStaff("Shelter Staff"),
        AdoptionInspector("Adoption Inspector"),
        Rescuer("Rescuer"),
        StaticsAdmin("Statics Admin");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
   public abstract JPanel createWorkArea(JPanel container, 
            Enterprise enterprise, 
            Organization organization, 
            UserAccount account, 
            EcoSystem business);
   

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
