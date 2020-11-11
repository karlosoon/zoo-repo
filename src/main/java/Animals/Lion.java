package main.java.Animals;

import main.java.Interfaces.Cat;
import main.java.Enum.*;

public class Lion extends Carnivorous implements Cat {

    public String name = "Lion";

    Size size = Size.SIZE_3;

    public Size getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    @Override
    public void meow() {
        System.out.println("Lion says Meow");
    }
}
