import Animals.*;
import Cages.*;
import Food.*;

public class Main {

    public static void main (String[] args) {

        // animals init
        Duck duck = new Duck();
        Lion lion = new Lion();
        Horse horse = new Horse();
        Cow cow = new  Cow();
        Fox fox = new Fox();
        Pegasus pegasus = new Pegasus();
        Tiger tiger = new Tiger();

        // food init
        Beef beef = new Beef();
        Chicken chicken = new Chicken();
        Pork pork = new Pork();
        Fruit fruit = new Fruit();
        Grass grass = new Grass();
        Leaf leaf = new Leaf();

        // cages creation
        HerbCage herbCage = new HerbCage(2);
        MeatCage meatCage = new MeatCage(3);

        // herb cage filling
        System.out.println("Herbivore cage filling");
        herbCage.addAnimal(duck);
        herbCage.addAnimal(lion);
        herbCage.addAnimal(pegasus);
        herbCage.addAnimal(lion);
        herbCage.whoInHerbCage();
        System.out.println("---");

        // meat cage filling
        System.out.println("Carnivorous cage filling");
        meatCage.addAnimal(horse);
        meatCage.addAnimal(lion);
        meatCage.addAnimal(tiger);
        meatCage.addAnimal(fox);
        meatCage.addAnimal(duck);
        meatCage.whoInMeatCage();
        System.out.println("---");

        // Herbivore feeding
        System.out.println("Herbivore feeding");
        cow.eat(beef);
        duck.eat(fruit);
        horse.eat(grass);
        pegasus.eat(pork);
        System.out.println("---");

        // Carnivorous feeding
        System.out.println("Carnivorous feeding");
        lion.eat(beef);
        tiger.eat(fruit);
        fox.eat(grass);
        System.out.println("---");


    }
}
