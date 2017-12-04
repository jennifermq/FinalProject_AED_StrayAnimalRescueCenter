/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Animal;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class AnimalDir {
    private ArrayList<Animal> animalList;

    public AnimalDir() {
        animalList = new ArrayList<Animal>(); 
    }

    public ArrayList<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(ArrayList<Animal> animalList) {
        this.animalList = animalList;
    }
    
    public void addAnimal(Animal a){
        animalList.add(a);
    }
    
    public void removeAnimal(Animal a) {
        animalList.remove(a);
    }
    
}
