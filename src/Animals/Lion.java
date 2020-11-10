package Animals;

import Interfaces.Cat;

public class Lion extends Carnivorous implements Cat {
    public String name = "Lion";

    public String getName() {
        return name;
    }

    @Override
    public void meow() {
        System.out.println("Lion says Meow");
    }
}
