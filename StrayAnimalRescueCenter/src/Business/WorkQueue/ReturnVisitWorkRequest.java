/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Adoption.Adopter;
import Business.Animal.Animal;

/**
 *
 * @author user
 */
public class ReturnVisitWorkRequest extends WorkRequest {
    private Adopter adoptor;
    private Animal animal;
    private String result;

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

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
