/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Animal;

/**
 *
 * @author user
 */
public class OtherAnimal extends Animal{
    private String type;
    private String breed;
    private String color;
    private String personality;

    public String getOtherAnimalType() {
        return type;
    }

    public void setOtherAnimalType(String type) {
        this.type = type;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPersonality() {
        return personality;
    }

    public void setPersonality(String personality) {
        this.personality = personality;
    }
}
