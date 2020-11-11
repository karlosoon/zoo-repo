package main.java.Animals;

import main.java.Interfaces.Cat;
import main.java.Enum.*;

public class Tiger extends Carnivorous implements Cat {
    public String name = "Tiger";

    Size size = Size.SIZE_3;

    public Size getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    @Override
    public void meow() {
        System.out.println("Tiger says Meow");
    }
}
