import Animals.*;
import Cages.*;
import Exceptions.WrongFoodException;
import Food.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Main {

    public static void main (String[] args) throws WrongFoodException {

        final Logger LOG = LogManager.getLogger(Main.class.getName());


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
        AnimalCage<Herbivore> herbivoreAnimalCage = new AnimalCage<>(3);
        AnimalCage<Animal> animalAnimalCage = new AnimalCage<>(3);
        AnimalCage<Carnivorous> carnivorousAnimalCage = new AnimalCage<>(3);

        // herb cage filling

        herbivoreAnimalCage.addAnimal(duck);
        herbivoreAnimalCage.addAnimal(horse);
        herbivoreAnimalCage.addAnimal(cow);
        herbivoreAnimalCage.deleteAnimalByName("horse");
        herbivoreAnimalCage.deleteAnimalByName("Horse");
        herbivoreAnimalCage.getAnimalByName("cow");
        herbivoreAnimalCage.getAnimalByName("Cow");
        System.out.println(herbivoreAnimalCage.animalCage);
        System.out.println("---");

        // meat cage filling
        carnivorousAnimalCage.addAnimal(lion);
        carnivorousAnimalCage.addAnimal(tiger);
        carnivorousAnimalCage.addAnimal(fox);
        carnivorousAnimalCage.addAnimal(fox);
        System.out.println("---");

        // animal cage filling
        animalAnimalCage.addAnimal(duck);
        animalAnimalCage.addAnimal(tiger);
        animalAnimalCage.addAnimal(cow);
        animalAnimalCage.addAnimal(cow);
        System.out.println("---");

        // Herbivore feeding
        System.out.println("Herbivore feeding");
        cow.eat(fruit);
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
