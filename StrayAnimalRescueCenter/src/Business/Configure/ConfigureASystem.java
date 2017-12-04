/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Configure;


import Business.Adoption.Address;
import Business.Adoption.Adopter;
import Business.Animal.Animal;
import Business.Animal.Dog;
import Business.Cage.CageCell;
import Business.Cage.CageCellDir;
import Business.Date.Date;
import Business.EcoSystem.EcoSystem;
import Business.Employee.Employee;
import Business.Employee.EmployeeDir;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDir;
import Business.Enterprise.RescueCenterEnterprise;
import Business.Medicine.Anesthetics;
import Business.Medicine.Antibiotics;
import Business.Medicine.Medicine;
import static Business.Medicine.Medicine.MedicineType.Anesthetics;
import Business.Medicine.MedicineDir;
import Business.Medicine.OtherMedicine;
import Business.Medicine.Vaccination;
import Business.Network.Network;
import Business.Organization.AdoptionOrg;
import Business.Organization.Organization;
import Business.Organization.OrganizationDir;
import Business.RescueRecord.RescueRecord;
import Business.Role.AdoptionInspectorRole;
import Business.Role.DeliveryRole;
import Business.Role.PharmacistRole;
import Business.Role.ReceptionistRole;
import static Business.Role.Role.RoleType.AdoptionInspector;
import Business.Role.ShelterStaffRole;
import Business.Role.SystemAdminRole;
import Business.Role.VeteAssistantRole;
import Business.Role.VeterinarianRole;
import Business.Room.Room;
import Business.Room.RoomDir;
import Business.Shelter.ShelterCell;
import Business.Shelter.ShelterCellDir;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDir;
import Business.UserAccount.VisitorAccount;
import java.util.ArrayList;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        ArrayList<Network> networkList=new ArrayList<Network>();
        system.setNetworkList(networkList);
        
        Network network = new Network();
        network.setName("Boston");
        networkList.add(network);
        
        EnterpriseDir enterpriseDir = network.getEnterpriseDir();
        RescueCenterEnterprise enterpriseRescueCenter = (RescueCenterEnterprise)enterpriseDir.createAndAddEnterprise("Rescue Center", Enterprise.EnterpriseType.RescueCenter);
        network.setEnterpriseDir(enterpriseDir);
        
        OrganizationDir organizationDir=new OrganizationDir();
        enterpriseRescueCenter.setOrganizationDirectory(organizationDir);
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        Organization orgVete = enterpriseRescueCenter.getOrganizationDirectory().createOrganization(Organization.Type.Vete);
        Organization orgAdmin = enterpriseRescueCenter.getOrganizationDirectory().createOrganization(Organization.Type.EnterpriseAdmin);
        Organization orgAdoption = enterpriseRescueCenter.getOrganizationDirectory().createOrganization(Organization.Type.Adoption);
        Organization orgCage = enterpriseRescueCenter.getOrganizationDirectory().createOrganization(Organization.Type.Cage);
        Organization orgCenterRegistration = enterpriseRescueCenter.getOrganizationDirectory().createOrganization(Organization.Type.CenterRegistration);
        Organization orgDelivery = enterpriseRescueCenter.getOrganizationDirectory().createOrganization(Organization.Type.Delivery);
        Organization orgPharmacy = enterpriseRescueCenter.getOrganizationDirectory().createOrganization(Organization.Type.Pharmacy);
        Organization orgShelter = enterpriseRescueCenter.getOrganizationDirectory().createOrganization(Organization.Type.Shelter);

                
        Employee sysadminEmployee = system.getEmployeeDirectory().createEmployee("Professor");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", sysadminEmployee, new SystemAdminRole());
        ua.setEmployee(sysadminEmployee);

        //UserAccountDir uadsys = new UserAccountDir();
        
        //UserAccountDir uadcr = new UserAccountDir();
        //orgCenterRegistration.setUserAccountDirectory(uadcr);
        //EmployeeDir ed1 = new EmployeeDir();
        //orgCenterRegistration.setEmployeeDirectory(ed1);
        
        /*
        Employee receptionist = system.getEmployeeDirectory().createEmployee("Qing");
        UserAccount ua1 = system.getUserAccountDirectory().createUserAccount("re", "re", receptionist, new ReceptionistRole());
        ua1.setEmployee(receptionist);
        orgCenterRegistration.getUserAccountDirectory().getUserAccountList().add(ua1);
        orgCenterRegistration.getEmployeeDirectory().getEmployeeList().add(receptionist);
        //UserAccountDir uadv = new UserAccountDir();
        //orgCenterRegistration.setUserAccountDirectory(uadv);
        //EmployeeDir ed2 = new EmployeeDir();
        
        Employee veterinarian = system.getEmployeeDirectory().createEmployee("Xuan");
        UserAccount ua2 = system.getUserAccountDirectory().createUserAccount("ve", "ve", veterinarian, new VeterinarianRole());
        ua2.setEmployee(veterinarian);
        orgVete.getUserAccountDirectory().getUserAccountList().add(ua2);
        orgVete.getEmployeeDirectory().getEmployeeList().add(veterinarian);
        
        Employee pharmacist = system.getEmployeeDirectory().createEmployee("Hang");
        UserAccount ua3 = system.getUserAccountDirectory().createUserAccount("ph", "ph", pharmacist, new PharmacistRole());
        ua3.setEmployee(pharmacist);
        orgPharmacy.getUserAccountDirectory().getUserAccountList().add(ua3);
        orgPharmacy.getEmployeeDirectory().getEmployeeList().add(pharmacist);
        
        Employee shelterStaff = system.getEmployeeDirectory().createEmployee("Vijayashree");
        UserAccount ua4 = system.getUserAccountDirectory().createUserAccount("sh", "sh", shelterStaff, new ShelterStaffRole());
        ua4.setEmployee(shelterStaff);
        orgShelter.getUserAccountDirectory().getUserAccountList().add(ua4);
        orgShelter.getEmployeeDirectory().getEmployeeList().add(shelterStaff);
        
        Employee adoptionInspector = system.getEmployeeDirectory().createEmployee("Rajput");
        UserAccount ua5 = system.getUserAccountDirectory().createUserAccount("ad", "ad", adoptionInspector, new AdoptionInspectorRole());
        ua5.setEmployee(adoptionInspector);
        orgAdoption.getUserAccountDirectory().getUserAccountList().add(ua5);
        orgAdoption.getEmployeeDirectory().getEmployeeList().add(adoptionInspector);
        
        Employee delivery = system.getEmployeeDirectory().createEmployee("Avee");
        UserAccount ua6 = system.getUserAccountDirectory().createUserAccount("de", "de", delivery, new DeliveryRole());
        ua6.setEmployee(delivery);
        orgDelivery.getUserAccountDirectory().getUserAccountList().add(ua6);
        orgDelivery.getEmployeeDirectory().getEmployeeList().add(delivery);
        
        Employee veteAssistant=system.getEmployeeDirectory().createEmployee("Ming");
        UserAccount ua7=system.getUserAccountDirectory().createUserAccount("veteAssistant", "veteAssistant", veteAssistant, new VeteAssistantRole());
        ua7.setEmployee(veteAssistant);
        orgCage.getUserAccountDirectory().getUserAccountList().add(ua7);
        orgCage.getEmployeeDirectory().getEmployeeList().add(veteAssistant);
        */
        
        MedicineDir medicineDir = new MedicineDir();
        Anesthetics m1 = new Anesthetics();
        m1.setName("ane1");
        m1.setType(Medicine.MedicineType.Anesthetics);
        m1.setVendor("ane1");
        Antibiotics m2 = new Antibiotics();
        m2.setName("ant1");
        m2.setType(Medicine.MedicineType.Antibiotics);
        m2.setVendor("ant1");
        OtherMedicine m3 = new OtherMedicine();
        m3.setName("other1");
        m3.setType(Medicine.MedicineType.Other);
        m3.setVendor("other1");
        Vaccination m4 = new Vaccination();
        m4.setName("vac1");
        m4.setType(Medicine.MedicineType.Vaccination);
        m4.setVendor("vac1");
        enterpriseRescueCenter.setMedicineDir(medicineDir);
        
        for(int i=0;i<10;i++) {
            CageCell c = new CageCell();
            c.setLocation("f1 c" + String.valueOf(i+1));
            c.setStatus(CageCell.AVAIL_STATUS);
            enterpriseRescueCenter.getCageCellDir().addCageShell(c);
        }
        
        for(int i=0;i<50;i++) {
            ShelterCell c = new ShelterCell();
            c.setLocation("f1 c" + String.valueOf(i+1));
            c.setStatus(ShelterCell.AVAIL_STATUS);
            enterpriseRescueCenter.getShelterCellDir().addShelterShell(c);
        }
        
        Adopter adopter = new Adopter();
        adopter.setFirstName("Zesheng");
        adopter.setLastName("Zong");
        adopter.setEmail("zong.zesheng@husky.neu.edu");
        adopter.setPhoneNum("888-888-8888");
        adopter.setSsn("111111111");
        Address address = new Address();
        address.setStreet("650 Huntington St");
        address.setCity("Boston");
        address.setState("MA");
        adopter.setAddress(address);
        system.getVisitorAccountDir().createUserAccount("adopter", "adopter", adopter);
        ((AdoptionOrg)orgAdoption).getAdopterDir().addAdoptor(adopter);
        RescueRecord rr = new RescueRecord();
        
        Date date = new Date();
        date.setYear(2016);
        date.setMonth(12);
        date.setDate(10);
        rr.setDate(date);
        
        Animal animal = new Dog();
        animal.setColor("white");
        animal.setGender("male");
        animal.setType(Animal.AnimalType.Dog);
        animal.setStatus(Animal.UNREADY_STATUS);
        rr.setAnimal(animal);
        
        rr.setLocationFound("Malden");
        enterpriseRescueCenter.getRecordDir().addRescueRecord(rr);
        
        return system;
    }

   
    
}

