package org.example;

public class AnimalTester {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
        Lion lion = new Lion("Lion");
        Cow cow = new Cow("Cow");

        animal.animalSound();
        lion.animalSound();
        cow.animalSound();
    }
}
