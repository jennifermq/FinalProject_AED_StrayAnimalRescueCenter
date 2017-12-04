/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.RescueRecord.RescueRecordDir;
import Business.Role.ReceptionistRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class CenterRegistrationOrg extends Organization {
    private RescueRecordDir rescueRecordDir;
    
    public CenterRegistrationOrg() {
        super(Organization.Type.CenterRegistration.getValue());
        rescueRecordDir = new RescueRecordDir();
    }

    public RescueRecordDir getRescueRecordDir() {
        return rescueRecordDir;
    }

    public void setRescueRecordDir(RescueRecordDir rescueRecordDir) {
        this.rescueRecordDir = rescueRecordDir;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<Role>();
        roles.add(new ReceptionistRole());
        return roles;
    }

}
