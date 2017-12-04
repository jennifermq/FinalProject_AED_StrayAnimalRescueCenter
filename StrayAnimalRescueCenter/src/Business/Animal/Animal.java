/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Animal;

import Business.Date.Date;
import Business.Treatment.TreatmentRecordDir;


/**
 *
 * @author user
 */
public abstract class Animal {
    private int animalId;
    private int age;
    private boolean isSterilized;
    private String color;
    private String gender;
    private AnimalType type;
    private String status;
    private Date nextReview;
    private TreatmentRecordDir treatmentDir;
    private AnimalStatusRecordDir statusDir;
    
    private static int count;
    public static String READY_STATUS = "READY";
    public static String UNREADY_STATUS = "UNREADY";
    public static String ADOPTED_STATUS = "ADOPTED";

    public Animal() {
        count++;
        this.animalId = count;
        
        this.statusDir = new AnimalStatusRecordDir();
        this.status = UNREADY_STATUS;
        this.nextReview = new Date();
        this.treatmentDir = new TreatmentRecordDir();
        this.statusDir = new AnimalStatusRecordDir();
    }

    public int getAnimalId() {
        return animalId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIsSterilized() {
        return isSterilized;
    }

    public void setIsSterilized(boolean isSterilized) {
        this.isSterilized = isSterilized;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getNextReview() {
        return nextReview;
    }

    public void setNextReview(Date d) {
        this.nextReview = d;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TreatmentRecordDir getTreatmentDir() {
        return treatmentDir;
    }

    public void setTreatmentDir(TreatmentRecordDir treatmentDir) {
        this.treatmentDir = treatmentDir;
    }

    public AnimalStatusRecordDir getStatusDir() {
        return statusDir;
    }

    public void setStatusDir(AnimalStatusRecordDir statusDir) {
        this.statusDir = statusDir;
    }

    public AnimalType getType() {
        return type;
    }

    public void setType(AnimalType type) {
        this.type = type;
    }
    
    public enum AnimalType {
        Dog("Dog"),
        Cat("Cat"),
        Other("Other");
            
        private String value;

        private AnimalType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
        
        @Override
        public String toString() {
            return value;
        }
    }
    
    @Override
    public String toString() {
        return String.valueOf(animalId);
    }
    
}
