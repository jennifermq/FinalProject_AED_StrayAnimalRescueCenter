/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Adoption;

import Business.Animal.Animal;
import Business.Date.Date;
import Business.Employee.Employee;


/**
 *
 * @author user
 */
public class AdoptionRecord {
    private Adopter adoptor;
    private Employee inspector;
    private Animal animal;
    private Date date;
    private String status;
    public static String SUBMITTED_STATUS = "Submitted";
    public static String PROCESSING_STATUS = "Processing";
    public static String APPROVED_STATUS = "Approved";
    public static String REJECTED_STATUS = "Rejected";
    public static String INPROGRESS_STATUS = "In Progress";

    public Adopter getAdoptor() {
        return adoptor;
    }

    public void setAdoptor(Adopter adoptor) {
        this.adoptor = adoptor;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date d) {
        this.date = d;
    }

    public Employee getInspector() {
        return inspector;
    }

    public void setInspector(Employee inspector) {
        this.inspector = inspector;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return date.getMonth()
               + "/" + date.getDate()
              + "/" + date.getYear();
    }
    
}
