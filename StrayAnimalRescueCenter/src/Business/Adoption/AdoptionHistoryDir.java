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
public class AdoptionHistoryDir {
    private ArrayList<AdoptionHistory> historyList;

    public AdoptionHistoryDir() {
        historyList = new ArrayList<AdoptionHistory>();
    }

    public ArrayList<AdoptionHistory> getHistoryList() {
        return historyList;
    }

    public void setHistoryList(ArrayList<AdoptionHistory> historyList) {
        this.historyList = historyList;
    }
    
    public void addAdoptionHistory(AdoptionHistory ah) {
        historyList.add(ah);
    }
    
    public void removeAdoptionHisstory(AdoptionHistory ah) {
        historyList.remove(ah);
    }
    
}
