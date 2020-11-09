package Cages;

import Animals.Animal;
import java.util.HashMap;


public class AnimalCage<T> {
    private int limit;
    public HashMap<String, T> animalCage = new HashMap<>();


    public AnimalCage(int limit) {
        this.limit = limit;
    }

    public void addAnimal(T animal) {
        Animal ani = (Animal) animal;
        if (limit > animalCage.size()) {
            animalCage.put(ani.getName(), animal);
            System.out.println(animal.getClass().getSimpleName() + " added. Current quantity = " + animalCage.size());
        } else if (limit <= animalCage.size()) {
            System.out.println("Cage is full");
        }
    }

  //  public void addAnimalByName()
}



