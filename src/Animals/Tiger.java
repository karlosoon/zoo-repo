package Animals;

import Interfaces.Cat;
import Enum.*;

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
