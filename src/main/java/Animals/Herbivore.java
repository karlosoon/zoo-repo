package main.java.Animals;
import main.java.Exceptions.WrongFoodException;
import main.java.Food.*;

public abstract class Herbivore extends Animal {

    public String name;
    public void eat(Food food) throws WrongFoodException {

        if (!(food instanceof Herb)){
            throw new WrongFoodException("Wrong food");
        } else {
            System.out.println("Thank you for food");;
        }
    }
}
