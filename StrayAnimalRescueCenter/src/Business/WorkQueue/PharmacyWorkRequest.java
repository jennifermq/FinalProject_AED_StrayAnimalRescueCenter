/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Medicine.Medicine;
import Business.Room.Room;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class PharmacyWorkRequest extends WorkRequest {
    private ArrayList<PharmacyWorkRequestUnit> medicineList;
    private boolean assigned;
    
    public PharmacyWorkRequest() {
        medicineList = new ArrayList<PharmacyWorkRequestUnit>();
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }
    
    public ArrayList<PharmacyWorkRequestUnit> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<PharmacyWorkRequestUnit> medicineList) {
        this.medicineList = medicineList;
    }
    
    public void addRequest(PharmacyWorkRequestUnit u) {
        medicineList.add(u);
    }

}
