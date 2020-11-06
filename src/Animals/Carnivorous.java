package Animals;
import Food.*;

public abstract class Carnivorous extends Animal {

    public void eat(Food food){
        if (food instanceof Meat){
            System.out.println("Thank you for food");
        } else {
            System.out.println("I don't eat Herb!");
        }
    }
}
