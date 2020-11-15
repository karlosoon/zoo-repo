package Animals;
import Exceptions.WrongFoodException;
import Food.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public abstract class Carnivorous extends Animal {

    final Logger LOG = LogManager.getLogger(Carnivorous.class.getName());

    public String name;
    public void eat(Food food) throws WrongFoodException {

        if (!(food instanceof Meat)){
            LOG.info("Wrong food");
            throw new WrongFoodException("Wrong food");
        } else {
            System.out.println("Thank you for food");;
        }
    }
}
