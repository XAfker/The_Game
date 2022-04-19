package Gra.Characters;

public class Mage extends Avatar {

    Weapon magicStuff = new Weapon("Disciples Stuff");

    public void setMagicStuff(Weapon magicStuff) {
        this.magicStuff = magicStuff;
        magicStuff.setWeight(15);
        magicStuff.setBaseAttack(150);
    }

    public Mage(String characterName){
        super(characterName);
        setHealth(150);
        setCapacity(35);
        setHand(magicStuff);
    }
}
