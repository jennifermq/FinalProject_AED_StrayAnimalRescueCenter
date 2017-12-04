/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Medicine;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class MedicineDir {
    private ArrayList<Medicine> medicineList;

    public MedicineDir() {
        medicineList = new ArrayList<Medicine>(); 
    }

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }
    
    public void addMedicine(Medicine m) {
        medicineList.add(m);
    }
    
    public void removeMedicine(Medicine m) {
        medicineList.remove(m);
    }
}
