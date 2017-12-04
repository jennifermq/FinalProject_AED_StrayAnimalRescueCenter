/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.ShelterStaffRole;
import Business.Shelter.ShelterCellDir;
import Business.Delivery.VehicleDir;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class ShelterOrg extends Organization{
    private ShelterCellDir shelterCellDir;
    
    public ShelterOrg() {
        super(Organization.Type.Shelter.getValue());
    }

    public ShelterCellDir getShelterCellDir() {
        return shelterCellDir;
    }

    public void setShelterCellDir(ShelterCellDir shelterCellDir) {
        this.shelterCellDir = shelterCellDir;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<Role>();
        roles.add(new ShelterStaffRole());
        return roles;
    }
}
