package Gra.Characters;

import java.util.Random;

public class MonsterLv1 extends Monster {
    public String type;

    public MonsterLv1(){
        this.type = typeGenerator();


    }

    public String typeGenerator(){
        switch (new Random().nextInt(0, 2)){
            case 0:
               return  "Normal monster";
            case 1:
                return "Dark monster";
            case 2:
                return "Swamp monster";
        }
        return "";
    }

}
