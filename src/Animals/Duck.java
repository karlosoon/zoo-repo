package Animals;

import Interfaces.Flying;

public class Duck extends Herbivore implements Flying {
    public String name = "Duck";

    public String getName() {
        return name;
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
