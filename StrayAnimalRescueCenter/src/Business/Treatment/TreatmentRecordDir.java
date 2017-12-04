/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Treatment;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class TreatmentRecordDir {
    private ArrayList<TreatmentRecord> treatmentRecordList;

    public TreatmentRecordDir() {
        treatmentRecordList = new ArrayList<TreatmentRecord>(); 
    }

    public ArrayList<TreatmentRecord> getTreatmentRecordList() {
        return treatmentRecordList;
    }

    public void setTreatmentRecordList(ArrayList<TreatmentRecord> treatmentRecordDir) {
        this.treatmentRecordList = treatmentRecordDir;
    }
    
    public void addTreatmentRecord(TreatmentRecord r) {
        treatmentRecordList.add(r);
    }
    
    public void removeTreatmentRecord(TreatmentRecord r) {
        treatmentRecordList.remove(r);
    }
    
}
