package Gra.Characters;

import java.util.Random;

public class Avatar {
    private String characterName;
    private double health;
    private Stuff hand = null;
    private double capacity = 250;
    private Stuff[] backpack = new Stuff[3];
    private int backpackitemplace = 0;
    private int potionCount = 0;
    private double level = 1;


    public Avatar(String characterName){
        this.characterName = characterName;
        health = new Random().nextDouble(300, 500);
    }

    public void setName(String name){
        this.characterName = name;
    }

    public String getName(){
       return this.characterName;
    }

    public void setHealth(double health){
        this.health = health;
    }

    public double getHealth(){
        return this.health;
    }

    public void setHand(Stuff hand){
        this.hand = hand;
    }

    public Stuff getHand(){
        return this.hand;
    }

    public boolean isAlive(){
        if(this.health>0)
            return true;
        return false;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double attack(){
        if(hand instanceof Weapon){
            Weapon weapon = (Weapon) this.hand;
            return weapon.getBaseAttack();
        }

        if(getHand() instanceof Potion){
            Potion potion = (Potion) getHand();
            this.setHealth(this.getHealth() + potion.getHealAmount());
        }
            return 0;
    }

    public String toString(){
        return this.characterName;
    }

    public void hurt(double attackPower){
        this.health -= attackPower;
    }

    public void addToBackpack(Stuff item){
        double weightcombined = 0;
        for (int i = 0; i < backpack.length; i++) {
            weightcombined += this.backpack[i].getWeight();
        }

        if(weightcombined<capacity){
            backpack[backpackitemplace] = item;
            for (int i = 0; i < backpack.length; i++) {
                weightcombined += this.backpack[i].getWeight();
            }
            if(weightcombined<capacity)
            backpackitemplace++;
            else
                backpack[backpackitemplace] = null;
                System.out.println("can't add that to your backpack, capacity can't be exceeded");
        }
        else
            System.out.println("capacity has been reached, can't add that to your backpack");

    }

    public void useItem(int a){

        switch (a){
            case 1 -> this.hand = backpack[0];
            case 2 -> this.hand = backpack[1];
            case 3 -> this.hand = backpack[2];

            default -> System.out.println("there's no such space in your backpack");
        }

        if(potionCount==2) {
            System.out.println("you can't use potion several times in a row");
        }


        if (this.hand instanceof Potion && potionCount == 2)
            System.out.println("you can't use potion several times in a row");

        else {
            attack();
            potionCount = 0;
        }


        if (this.hand instanceof Potion){
            backpack[a - 1] = null;
            potionCount++;
            backpackitemplace--;
        }

    }

    public Stuff[] getBackpack() {
        return backpack;
    }
}
