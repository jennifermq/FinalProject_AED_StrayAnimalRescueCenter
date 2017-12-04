/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Delivery;

import Business.Adoption.Adopter;
import Business.Animal.Animal;
import Business.Date.Date;
import Business.Employee.Employee;

/**
 *
 * @author user
 */
public class DeliveryHistory {
    private Date date;
    private Employee courier;
    private Animal animal;
    private Adopter adopter;
    private String status;
    
    public static String WAITING_STATUS = "WAITING";
    public static String ASSIGNED_STATUS = "ASSIGNED";
    public static String RECEIVED_STATUS = "RECEIVED";

    public DeliveryHistory() {
        status = WAITING_STATUS;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date d) {
        this.date = d;
    }

    public Employee getCourier() {
        return courier;
    }

    public void setCourier(Employee courier) {
        this.courier = courier;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Adopter getAdopter() {
        return adopter;
    }

    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return date.getYear() + "/" + date.getDate() + "/" + date.getYear();
    }
    
}
