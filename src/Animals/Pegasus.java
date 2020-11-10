package Animals;

import Interfaces.Artiodactyls;
import Interfaces.Flying;

public class Pegasus extends Herbivore implements Flying, Artiodactyls {
    public String name = "Pegasus";

    public String getName() {
        return name;
    }

    @Override
    public void fly() {
        System.out.println("I am horse with wings");
    }

    @Override
    public void hoof() {
        System.out.println("I have hooves");
    }
}
