/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Treatment;

import Business.Animal.Animal;
import Business.Date.Date;
import Business.Medicine.Medicine;
import Business.Room.Room;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class TreatmentRecord {
    private Date date;
    private Animal animal;
    private Room room;
    private boolean reviewed;
    private ArrayList<Medicine> medicineList;

    public TreatmentRecord() {
        reviewed = false;
        date = new Date();
        medicineList = new ArrayList<Medicine>();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public boolean isReviewed() {
        return reviewed;
    }

    public void setReviewed(boolean reviewed) {
        this.reviewed = reviewed;
    }

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }
    
}
