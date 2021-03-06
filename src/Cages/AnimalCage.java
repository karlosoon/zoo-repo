package Cages;

import Animals.Animal;
import com.sun.tools.javac.Main;


import java.util.HashMap;


public class AnimalCage<T extends Animal> {
    private int limit;
    public HashMap<String, T> animalCage = new HashMap<>();

    public AnimalCage(int limit) {
        this.limit = limit;
    }

    public void addAnimal(T animal) {
        if (limit > animalCage.size()) {
            animalCage.put(animal.getName(), animal);
            System.out.println(animal.getClass().getSimpleName() + " added. Current quantity = " + animalCage.size());
        } else if (limit <= animalCage.size()) {
            System.out.println("Cage is full");
        }
    }

    public void deleteAnimalByName(String name) {
        if (animalCage.containsKey(name)){
            animalCage.remove(name);
            System.out.println(name + " was deleted");
        } else {
            System.out.println("No such animal: " + name);
        }
    }

    public void getAnimalByName (String name) {
        if (animalCage.containsKey(name)) {
            System.out.println("There is your " + name + ": " + animalCage.get(name));
        } else {
            System.out.println("No such animal: " + name);
        }
    }
}



