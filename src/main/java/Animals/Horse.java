package Animals;

import Interfaces.Artiodactyls;
import Enum.*;

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
