/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RescueRecord;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class RescueRecordDir {
    private ArrayList<RescueRecord> rescueRecordList;

    public RescueRecordDir() {
        rescueRecordList = new ArrayList<RescueRecord>(); 
    }

    public ArrayList<RescueRecord> getRescueRecordList() {
        return rescueRecordList;
    }

    public void setRescueRecordList(ArrayList<RescueRecord> rescueRecordList) {
        this.rescueRecordList = rescueRecordList;
    }
    
    public void addRescueRecord(RescueRecord r) {
        rescueRecordList.add(r);
    }
    
    public void removeRescueRecord(RescueRecord r) {
        rescueRecordList.remove(r);
    }
    
}
