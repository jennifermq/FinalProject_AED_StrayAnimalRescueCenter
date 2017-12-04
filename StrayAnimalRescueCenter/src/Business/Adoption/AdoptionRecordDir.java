/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Adoption;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class AdoptionRecordDir {
    private ArrayList<AdoptionRecord> adoptionRecordList;

    public AdoptionRecordDir() {
        adoptionRecordList = new ArrayList<AdoptionRecord>(); 
    }

    public ArrayList<AdoptionRecord> getAdoptionRecordList() {
        return adoptionRecordList;
    }

    public void setAdoptionRecordList(ArrayList<AdoptionRecord> adoptionRecordList) {
        this.adoptionRecordList = adoptionRecordList;
    }
    
    public void addAdoptionRecord(AdoptionRecord r) {
        adoptionRecordList.add(r);
    }
    
    public void removeAdoptionRecord(AdoptionRecord r) {
        adoptionRecordList.remove(r);
    }
    
}
