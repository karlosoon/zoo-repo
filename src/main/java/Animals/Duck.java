package main.java.Animals;

import main.java.Interfaces.Flying;
import main.java.Enum.*;

public class Duck extends Herbivore implements Flying {

    private String name = "Duck";
    private Size size = Size.SIZE_1;

    public Size getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
