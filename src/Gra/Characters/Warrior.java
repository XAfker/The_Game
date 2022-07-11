package Gra.Characters;

public class Warrior extends Avatar {

    Weapon axe = new Weapon("Basic Axe");

    public void setAxe(Weapon axe) {
        this.axe = axe;
        axe.setBaseAttack(50);
        axe.setWeight(100);
    }

    public Warrior(String characterName){
        super(characterName);
        setHealth(500);
        setCapacity(250);
        setHand(axe);
    }

    @Override
    public double attack(){
        if(getHand() instanceof Weapon){
            Weapon weapon = (Weapon) getHand();
            return weapon.getBaseAttack() + weapon.getBonus();
        }

        if(getHand() instanceof Potion){
            Potion potion = (Potion) getHand();
            this.setHealth(this.getHealth() + potion.getHealAmount());
        }

        return 0;
    }

}
