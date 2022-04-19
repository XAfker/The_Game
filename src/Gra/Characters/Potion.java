package Gra.Characters;

import Gra.Characters.Stuff;

import java.util.Random;

public class Potion extends Stuff {

    private double healAmount;

    public Potion(){
        this.healAmount = new Random().nextDouble(10, 50);
        setWeight(10);
        setName("Potion");
    }

    public double getHealAmount(){
        return this.healAmount;
    }

}
