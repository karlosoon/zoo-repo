package Animals;
import Food.*;

public abstract class Herbivore extends Animal {

    public String name;

    public void eat(Food food){
        if (food instanceof Herb){
            System.out.println("Thank you for food");
        } else {
            System.out.println("I don't eat Meat!");
        }
    }

}
