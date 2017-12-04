/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Animal;

import Business.Date.Date;


/**
 *
 * @author user
 */
public class AnimalStatusRecord {
    private Date date;
    private double weight;
    private String status;
    public static String GOOD_STATUS = "GOOD";
    public static String RESERVED_STATUS = "RESERVED";
    public static String BAD_STATUS = "BAD";

    public AnimalStatusRecord() {
        date = new Date();
    }
    
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date d) {
        this.date = d;
    }
}
