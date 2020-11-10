package Animals;

import Interfaces.Artiodactyls;

public class Horse extends Herbivore implements Artiodactyls {
    public String name = "Horse";

    public String getName() {
        return name;
    }

    @Override
    public void hoof() {
        System.out.println("I have hooves");
    }

}
