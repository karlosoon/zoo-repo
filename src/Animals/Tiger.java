package Animals;

import Interfaces.Cat;

public class Tiger extends Carnivorous implements Cat {
    public String name = "Tiger";

    public String getName() {
        return name;
    }

    @Override
    public void meow() {
        System.out.println("Tiger says Meow");
    }
}
