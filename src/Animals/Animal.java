package Animals;

import Exceptions.WrongFoodException;
import Food.*;
import Enum.*;
import java.util.Objects;

public abstract class Animal {

    public String name;

    public Size getSize() {
        return size;
    }

    private Size size;

    public void eat(Food food) throws WrongFoodException {
        System.out.println("Thank you for food");
    }

    public String getName(){
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return this.name.equals(animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
