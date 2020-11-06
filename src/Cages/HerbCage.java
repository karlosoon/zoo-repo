package Cages;

import Animals.Animal;
import Animals.Herbivore;

import java.util.ArrayList;


public class HerbCage {
    private int limit;
    public ArrayList<Object> herbCage = new ArrayList<>();


    public HerbCage(int limit) {
        this.limit = limit;
    }

    public void addAnimal(Animal animal) {

        if (limit > herbCage.size() && animal instanceof Herbivore) {
            herbCage.add(animal);
            System.out.println(animal.getClass().getSimpleName() + " added. Current quantity = " + herbCage.size());
        } else if (limit <= herbCage.size()) {
            System.out.println("Cage is full");
        } else {
            System.out.println("Not Herbivore");
        }
    }

    public void whoInHerbCage() {
        System.out.println("In the HerbCage now:");
        for (Object o : herbCage) {
            System.out.println(o.getClass().getSimpleName());
        }

    }
}


