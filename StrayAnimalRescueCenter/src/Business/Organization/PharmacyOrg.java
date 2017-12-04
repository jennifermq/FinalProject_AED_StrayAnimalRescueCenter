/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PharmacistRole;
import Business.Role.Role;
import Business.Medicine.MedicineDir;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class PharmacyOrg extends Organization{
    private MedicineDir medicineDir;
    private WorkQueue workQueue;
    
    
    public PharmacyOrg() {
        super(Organization.Type.Pharmacy.getValue());
    }

    public MedicineDir getMedicineDir() {
        return medicineDir;
    }

    public void setMedicineDir(MedicineDir medicineDir) {
        this.medicineDir = medicineDir;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<Role>();
        roles.add(new PharmacistRole());
        return roles;
    }

    
}
