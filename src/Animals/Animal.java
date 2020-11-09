package Animals;

import Food.*;

public abstract class Animal {

    String name;
    public void eat(Food food){
        System.out.println("Thank you for food");
    }

    public String getName(){
        return this.name;
    }
}
