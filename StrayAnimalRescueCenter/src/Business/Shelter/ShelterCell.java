/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Shelter;

import Business.Animal.Animal;

/**
 *
 * @author user
 */
public class ShelterCell {
    private int cellId;
    private String location;
    private String status;
    private Animal animal;
    
    public static String OCCUPIED_STATUS = "OCCUPIED";
    public static String AVAIL_STATUS = "AVAIL";
    private static int count = 0;
    
    public ShelterCell() {
        count++;
        cellId = count;
        status = AVAIL_STATUS;
    }

    public int getCellId() {
        return cellId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    
    @Override
    public String toString() {
        return String.valueOf(cellId);
    }
}
