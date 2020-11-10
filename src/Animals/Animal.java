package Animals;

import Food.*;

import java.util.Objects;

public abstract class Animal {

    public String name;

    public void eat(Food food){
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
