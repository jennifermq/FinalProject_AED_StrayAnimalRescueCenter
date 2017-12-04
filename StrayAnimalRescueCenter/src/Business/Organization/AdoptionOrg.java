/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Adoption.AdoptionOfferingList;
import Business.Adoption.AdoptionRecordDir;
import Business.Adoption.AdopterDir;
import Business.Role.AdoptionInspectorRole;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class AdoptionOrg extends Organization{
    private AdoptionRecordDir adoptionRecordDir;
    private AdopterDir adopterDir;
    private AdoptionOfferingList adoptionList;
    
    public AdoptionOrg() {
        super(Organization.Type.Adoption.getValue());
        adoptionRecordDir = new AdoptionRecordDir();
        adopterDir = new AdopterDir();
        adoptionList = new AdoptionOfferingList();
    }

    public AdoptionRecordDir getAdoptionRecordDir() {
        return adoptionRecordDir;
    }

    public void setAdoptionRecordDir(AdoptionRecordDir adoptionRecordDir) {
        this.adoptionRecordDir = adoptionRecordDir;
    }

    public AdopterDir getAdopterDir() {
        return adopterDir;
    }

    public void setAdopterDir(AdopterDir adopterDir) {
        this.adopterDir = adopterDir;
    }

    public AdoptionOfferingList getAdoptionList() {
        return adoptionList;
    }

    public void setAdoptionList(AdoptionOfferingList adoptionList) {
        this.adoptionList = adoptionList;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<Role>();
        roles.add(new AdoptionInspectorRole());
        return roles;
    }
 
}
