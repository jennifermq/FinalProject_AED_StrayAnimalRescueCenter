/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class OrganizationDir {
    private ArrayList<Organization> organizationList;

    public OrganizationDir() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.CenterRegistration.getValue())){
            organization = new CenterRegistrationOrg();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Vete.getValue())){
            organization = new VeterinarianOrg();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Pharmacy.getValue())){
            organization = new PharmacyOrg();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Cage.getValue())){
            organization = new CageOrg();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Delivery.getValue())){
            organization = new DeliveryOrg();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Shelter.getValue())){
            organization = new ShelterOrg();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Adoption.getValue())){
            organization = new AdoptionOrg();
            organizationList.add(organization);
        }
        
        return organization;
    }
}
