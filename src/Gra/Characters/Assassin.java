package Gra.Characters;

public class Assassin extends Avatar {

    Weapon dualWieldWeapon = new Weapon("Small Daggers");

    public void setDualWieldWeapon(Weapon dualWieldWeapon) {
        this.dualWieldWeapon = dualWieldWeapon;
        dualWieldWeapon.setWeight(50);
        dualWieldWeapon.setBaseAttack(70);
    }

    public Assassin(String characterName){
        super(characterName);
        setHealth(250);
        setCapacity(100);
        setHand(dualWieldWeapon);
    }



}