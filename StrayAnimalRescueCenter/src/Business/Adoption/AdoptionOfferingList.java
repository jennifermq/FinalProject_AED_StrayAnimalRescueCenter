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
public class AdoptionOfferingList {
   private ArrayList<AdoptionOffering> adoptionOfferingList;

    public AdoptionOfferingList() {
        adoptionOfferingList = new ArrayList<AdoptionOffering>();
    }

    public ArrayList<AdoptionOffering> getAdoptionOfferingList() {
        return adoptionOfferingList;
    }

    public void setAdoptionOfferingList(ArrayList<AdoptionOffering> adoptionOfferingList) {
        this.adoptionOfferingList = adoptionOfferingList;
    }
   
    public void addAdoptionOffering(AdoptionOffering ao) {
        adoptionOfferingList.add(ao);
    }
    
    public void removeAdoptionOffering(AdoptionOffering ao) {
        adoptionOfferingList.remove(ao);
    }
    
}
