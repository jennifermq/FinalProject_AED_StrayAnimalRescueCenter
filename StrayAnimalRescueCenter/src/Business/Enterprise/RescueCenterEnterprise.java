/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Adoption.AdoptionOfferingList;
import Business.Animal.AnimalDir;
import Business.Cage.CageCellDir;
import Business.Medicine.MedicineDir;
import Business.RescueRecord.RescueRecordDir;
import Business.Role.Role;
import Business.Room.RoomDir;
import Business.Shelter.ShelterCellDir;
import Business.Delivery.DeliveryHistoryDir;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class RescueCenterEnterprise extends Enterprise{
    private RoomDir roomDir;
    private RescueRecordDir recordDir;
    private AnimalDir animalDir;
    private MedicineDir medicineDir;
    private CageCellDir cageCellDir;
    private ShelterCellDir shelterCellDir;
    private AdoptionOfferingList adoptionList;
    private DeliveryHistoryDir deliveryHistoryDir;
    
    public RescueCenterEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.RescueCenter);
        roomDir = new RoomDir();
        recordDir = new RescueRecordDir();
        animalDir = new AnimalDir();
        medicineDir = new MedicineDir();
        cageCellDir = new CageCellDir();
        shelterCellDir = new ShelterCellDir();
        adoptionList = new AdoptionOfferingList();
        deliveryHistoryDir = new DeliveryHistoryDir();
    }

    public RoomDir getRoomDir() {
        return roomDir;
    }

    public void setRoomDir(RoomDir roomDir) {
        this.roomDir = roomDir;
    }

    public RescueRecordDir getRecordDir() {
        return recordDir;
    }

    public void setRecordDir(RescueRecordDir recordDir) {
        this.recordDir = recordDir;
    }

    public AnimalDir getAnimalDir() {
        return animalDir;
    }

    public void setAnimalDir(AnimalDir animalDir) {
        this.animalDir = animalDir;
    }

    public MedicineDir getMedicineDir() {
        return medicineDir;
    }

    public void setMedicineDir(MedicineDir medicineDir) {
        this.medicineDir = medicineDir;
    }

    public CageCellDir getCageCellDir() {
        return cageCellDir;
    }

    public void setCageCellDir(CageCellDir cageCellDir) {
        this.cageCellDir = cageCellDir;
    }

    public ShelterCellDir getShelterCellDir() {
        return shelterCellDir;
    }

    public void setShelterCellDir(ShelterCellDir shelterCellDir) {
        this.shelterCellDir = shelterCellDir;
    }

    public AdoptionOfferingList getAdoptionList() {
        return adoptionList;
    }

    public void setAdoptionList(AdoptionOfferingList adoptionList) {
        this.adoptionList = adoptionList;
    }

    public DeliveryHistoryDir getDeliveryHistoryDir() {
        return deliveryHistoryDir;
    }

    public void setDeliveryHistoryDir(DeliveryHistoryDir deliveryHistoryDir) {
        this.deliveryHistoryDir = deliveryHistoryDir;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
