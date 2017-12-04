/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RescueRecord;

import Business.Animal.Animal;
import Business.Date.Date;
import Business.Employee.Employee;
import Business.Room.Room;

/**
 *
 * @author user
 */
public class RescueRecord {
    private Date date;
    private Animal animal;
    private Room room;
    private Employee rescuer;
    private String locationFound;
    private boolean healthy;

    public RescueRecord() {
        this.date = new Date();
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

    public Employee getRescuer() {
        return rescuer;
    }

    public void setRescuer(Employee rescuer) {
        this.rescuer = rescuer;
    }

    public String getLocationFound() {
        return locationFound;
    }

    public void setLocationFound(String locationFound) {
        this.locationFound = locationFound;
    }

    public boolean isHealthy() {
        return healthy;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }
           
    @Override
    public String toString() {
        return date.toString();
    }
}
