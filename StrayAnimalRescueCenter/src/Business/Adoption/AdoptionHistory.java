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
public class AdoptionHistory {
    private Date date;
    private Animal animal;
    private String Status;
    private String message;
    
    public static String SUBMITTED_STATUS = "Submitted";
    public static String ASSIGNED_STATUS = "Assigned";
    public static String APPROVED_STATUS = "Approved";
    public static String REJECTED_STATUS = "Rejected";
    public static String INPROGRESS_STATUS = "In Progress";

    public Date getDate() {
        return date;
    }

    public void setDate(Date d) {
        this.date = d;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    @Override
    public String toString() {
        return date.getYear() + "/" + date.getDate() + "/" + date.getYear();
    }
    
}
