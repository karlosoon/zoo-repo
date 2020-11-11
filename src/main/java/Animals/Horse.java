package main.java.Animals;

import main.java.Interfaces.Artiodactyls;
import main.java.Enum.*;

public class Horse extends Herbivore implements Artiodactyls {

    public String name = "Horse";
    Size size = Size.SIZE_4;

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
