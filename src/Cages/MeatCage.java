package Cages;

import Animals.Animal;
import Animals.Carnivorous;

import java.util.ArrayList;


public class MeatCage {
    private int limit;
    public ArrayList<Object> meatCage = new ArrayList<>();


    public MeatCage(int limit) {
        this.limit = limit;
    }

    public void addAnimal(Animal animal) {

        if (limit > meatCage.size() && animal instanceof Carnivorous) {
            meatCage.add(animal);
            System.out.println(animal.getClass().getSimpleName() + " added. Current quantity = " + meatCage.size());
        } else if (limit <= meatCage.size()) {
            System.out.println("Cage is full");
        } else {
            System.out.println("Not Herbivore");
        }
    }

    public void whoInMeatCage() {
        System.out.println("In the MeatCage now:");
        for (Object o : meatCage) {
            System.out.println(o.getClass().getSimpleName());
        }

    }
}
