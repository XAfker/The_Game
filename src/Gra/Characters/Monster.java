package Gra.Characters;

import java.util.Random;

public class Monster {
    private double health;
    private double attackPower;
    private double attackChance;

    public Monster(){
    this.health = new Random().nextDouble(100, 500);
    this.attackPower = new Random().nextDouble(10, 50);
    this.attackChance = new Random().nextDouble(0.0,100);
    }



    public double attack(){
        double random = new Random().nextDouble(0.0, 100);
        if(random<attackChance)
            return attackPower;
        return 0;
    }

    public double getHealth(){
        return this.health;
    }

    public void setHealth(int add){
        this.health += add;
    }

    public void setAttackBonus(int bonus){
        this.attackChance += bonus;
    }

    public boolean isAlive(){
        if(this.health>0)
            return true;

        return false;
    }

    public void hurt(double attack){
        this.health -= attack;
    }

    public Monster spawn(){
        return new Monster();
    }


}
