/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Adoption.AdoptionRecord;
import Business.Adoption.Adopter;
import Business.Animal.Animal;

/**
 *
 * @author user
 */
public class AdoptionVisitWorkRequest extends WorkRequest {
    private AdoptionRecord adoptionRecord;
    private String result;

    public AdoptionRecord getAdoptionRecord() {
        return adoptionRecord;
    }

    public void setAdoptionRecord(AdoptionRecord adoptionRecord) {
        this.adoptionRecord = adoptionRecord;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    
}
