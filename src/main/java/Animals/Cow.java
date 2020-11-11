package main.java.Animals;

import main.java.Interfaces.Artiodactyls;
import main.java.Enum.*;

public class Cow extends Herbivore implements Artiodactyls {

    private String name = "Cow";
    Size size = Size.SIZE_3;

    public Size getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    @Override
    public void hoof() {
        System.out.println("I have hooves");
    }
}
