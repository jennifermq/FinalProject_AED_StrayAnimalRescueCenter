/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Cage;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class CageCellDir {
    private ArrayList<CageCell> cageCellList;

    public CageCellDir() {
        cageCellList = new ArrayList<CageCell>(); 
    }

    public ArrayList<CageCell> getCageCellList() {
        return cageCellList;
    }

    public void setCageCellList(ArrayList<CageCell> cageCellList) {
        this.cageCellList = cageCellList;
    }
    
    public void addCageShell(CageCell sc) {
        cageCellList.add(sc);
    }
    
    public void removeCageCell(CageCell sc) {
        cageCellList.remove(sc);
    }
    
}
