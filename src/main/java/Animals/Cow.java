package Animals;

import Interfaces.Artiodactyls;
import Enum.*;

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
