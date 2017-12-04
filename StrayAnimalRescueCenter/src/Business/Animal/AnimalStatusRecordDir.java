/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Animal;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class AnimalStatusRecordDir {
    private ArrayList<AnimalStatusRecord> statusList;

    public AnimalStatusRecordDir() {
        statusList = new ArrayList<AnimalStatusRecord>();
    }

    public ArrayList<AnimalStatusRecord> getStatusDir() {
        return statusList;
    }

    public void setStatusDir(ArrayList<AnimalStatusRecord> statusDir) {
        this.statusList = statusDir;
    }
    
    public void addAnimalStatus(AnimalStatusRecord r) {
        statusList.add(r);
    }
    
    public void removeAnimalStatus(AnimalStatusRecord r) {
        statusList.remove(r);
    }
}
