package org.example;

public class Animal {
    private String animalName;

    public Animal(String animalName){
        this.animalName = animalName;
    }

    public void animalSound(){
        System.out.println("Default aninal sound");
    }

    public String getAnimalName(){
        return animalName;
    }
}
