/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Adoption;

import Business.Adoption.Adopter;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class AdopterDir {
    private ArrayList<Adopter> adoptorList;

    public AdopterDir() {
        adoptorList = new ArrayList<Adopter>(); 
    }
    
    public ArrayList<Adopter> getAdoptorList() {
        return adoptorList;
    }

    public void setAdoptorList(ArrayList<Adopter> adoptorList) {
        this.adoptorList = adoptorList;
    }
    
    public void addAdoptor(Adopter a) {
        adoptorList.add(a);
    }
    
    public void removeAdoptor(Adopter a) {
        adoptorList.remove(a);
    }
    
}
