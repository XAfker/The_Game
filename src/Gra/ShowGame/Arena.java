package Gra.ShowGame;

import Gra.Characters.*;

public class Arena {
    protected Avatar avatar;
    protected Monster monster;

    public Avatar ClassSelect(){
        java.util.Scanner avatarChoice = new java.util.Scanner(System.in);

        System.out.println("What will be the name of your avatar?");

        String avatarChosenName = avatarChoice.nextLine();

        System.out.println("Now, select class of your " +avatarChosenName +":");

        System.out.println();

        System.out.println("1 -> Warrior, has the highest health and capacity to wield items, mediocre attack strength tho and not so good in avoiding getting hurt");
        System.out.println("2 -> Assassin, well all around balanced with highest chance to dodge an attack");
        System.out.println("3 -> Mage, not a lot of health and capacity but can deal a lot of damage and he has a chance to block an attack");

        System.out.println();

        boolean isselected = false;

        loop:
       do {
           System.out.println("Select your character class by entering a number attached to the one you want: ");
           int avatarChosenClass = avatarChoice.nextInt();
          switch (avatarChosenClass) {
               case 1:
                   Avatar option1 = new Warrior(avatarChosenName);
                   System.out.println("You selected to be a Warrior");
                   isselected = true;
                   return option1;
               case 2:
                   Avatar option2 = new Assassin(avatarChosenName);
                   System.out.println("You selected to be a Assassin");
                   isselected = true;
                   return option2;
               case 3:
                   Avatar option3 = new Mage(avatarChosenName);
                   System.out.println("You selected to be a Mage");
                   isselected = true;
                   return option3;
               default:
                   System.out.println("not a available option, pick a valid one");
           }

       }while (!isselected);

       return new Avatar("idk some type of error ur not supposed to see this error");
    }



    Avatar player = ClassSelect();

    public void setPlayer(Avatar player) {
        this.player = player;
    }

    Monster enemy = new Monster();

    public Object action(){
        java.util.Scanner actionChoice = new java.util.Scanner(System.in);

        Object winner = player;
        System.out.println("Select what action do you want to take?");
        System.out.println("1 -> use item in hand " +"("+player.getHand()+")");
        System.out.println("2 -> switch item in hand");

        loop2:
        do {
            int a = actionChoice.nextInt();
            switch (a) {
                case 1:
                    if (player.getHand() instanceof Weapon);
                    enemy.hurt(player.attack());
                    if (player.getHand() instanceof Potion){
                        Potion potion = (Potion) player.getHand();
                        player.setHealth(player.getHealth() + potion.getHealAmount());
                    }
                    if (player.getHand() == null)
                        System.out.println("There's nothing in your hand");
                    break;

                case 2:
                    System.out.println("which item do you want to chose?");
                    System.out.println("1 -> " +player.getBackpack()[0]);
                    System.out.println("2 -> " +player.getBackpack()[1]);
                    System.out.println("3 -> " +player.getBackpack()[2]);

                    Stuff temp = player.getHand();
                    boolean control = false;

                    loop3:
                    do {
                        int insideChoiceBCKP = actionChoice.nextInt();
                        switch (insideChoiceBCKP) {
                            case 1:
                                player.setHand(player.getBackpack()[0]);
                                player.getBackpack()[0] = temp;
                                control = true;
                                continue loop2;
                            case 2:
                                player.setHand(player.getBackpack()[1]);
                                player.getBackpack()[1] = temp;
                                control = true;
                                continue loop2;
                            case 3:
                                player.setHand(player.getBackpack()[2]);
                                player.getBackpack()[2] = temp;
                                control = true;
                                continue loop2;

                            default:
                                System.out.println("please select a valid option");
                                continue loop3;
                        }
                    }while (!false);
                default:
                    System.out.println("please select a valid option");
            }
            /*     System.out.println(player.toString() +" health is equal to " +player.getHealth());
        enemy.hurt(player.attack());
            System.out.println("monster health is equal to: " +enemy.getHealth());
        player.hurt(enemy.attack());
            System.out.println(" ");
        if(player.getHealth()>enemy.getHealth())
            winner = player;
        else
            winner = enemy;*/
        }while ( (player.isAlive() && enemy.isAlive()));
        if(winner == player)
            System.out.println(player.getName() +" won");
        else
            System.out.println("Monster won");
        return winner;
    }
}
