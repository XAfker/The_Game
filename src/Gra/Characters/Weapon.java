package Gra.Characters;

import java.util.Random;

public class Weapon extends Stuff {
    private double baseAttack = 10;
    private double bonus = baseAttack += (baseAttack * (new Random().nextDouble(10, 50) * 0.1));
    private String type;

    public Weapon(String name){
        setName(name);
        setWeight(0);
    }

    @Override
    public String toString(){
        return getName() +" | attack: " +getBaseAttack();
    }


    public double getBaseAttack(){
        return this.baseAttack;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBaseAttack(double baseAttack) {
        this.baseAttack = baseAttack;
    }

}
