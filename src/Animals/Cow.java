package Animals;

import Interfaces.Artiodactyls;

public class Cow extends Herbivore implements Artiodactyls {

    private String name = "Cow";

    public String getName() {
        return name;
    }

    @Override
    public void hoof() {
        System.out.println("I have hooves");
    }
}
