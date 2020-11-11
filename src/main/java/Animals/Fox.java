package main.java.Animals;

import main.java.Enum.*;

public class Fox extends Carnivorous {
    public String name = "Fox";

    Size size = Size.SIZE_2;

    public Size getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

}
