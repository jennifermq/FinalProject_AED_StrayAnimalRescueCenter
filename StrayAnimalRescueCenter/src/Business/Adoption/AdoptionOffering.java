/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Adoption;

import Business.Animal.Animal;
import Business.Date.Date;

/**
 *
 * @author user
 */
public class AdoptionOffering {
    private Animal animal;
    private Date publishedDate;
    private String status;
    
    public static String OPEN_STATUS = "Open";
    public static String CLOSE_STATUS = "Close";

    public AdoptionOffering() {
        this.status = OPEN_STATUS;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return animal.getType().getValue();
    }
    
}
