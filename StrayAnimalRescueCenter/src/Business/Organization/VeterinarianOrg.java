/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.VeterinarianRole;
import Business.Treatment.TreatmentRecordDir;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class VeterinarianOrg extends Organization{
    
    private TreatmentRecordDir treatmentRecordDir;
    
    public VeterinarianOrg() {
        super(Organization.Type.Vete.getValue());
    }

    public TreatmentRecordDir getTreatmentRecordDir() {
        return treatmentRecordDir;
    }

    public void setTreatmentRecordDir(TreatmentRecordDir treatmentRecordDir) {
        this.treatmentRecordDir = treatmentRecordDir;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<Role>();
        roles.add(new VeterinarianRole());
        return roles;
    }

}
