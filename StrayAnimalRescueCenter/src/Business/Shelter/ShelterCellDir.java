/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Shelter;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class ShelterCellDir {
    private ArrayList<ShelterCell> shelterCellList;

    public ShelterCellDir() {
        shelterCellList = new ArrayList<ShelterCell>(); 
    }

    public ArrayList<ShelterCell> getShelterCellList() {
        return shelterCellList;
    }

    public void setShelterCellList(ArrayList<ShelterCell> shelterCellList) {
        this.shelterCellList = shelterCellList;
    }
    
    public void addShelterShell(ShelterCell sc) {
        shelterCellList.add(sc);
    }
    
    public void removeShelterCell(ShelterCell sc) {
        shelterCellList.remove(sc);
    }
    
}
