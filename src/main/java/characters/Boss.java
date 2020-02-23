package characters;

import beasts.Beast;

import java.util.ArrayList;

public class Boss extends Character implements IFight {

    public Boss(String name, ArrayList<Beast> beasts){
        super(name, beasts);
    }

    public void fight(IFight opponent){
        Beast chosenBeast = getChosenBeast();
        chosenBeast.attack(opponent.getChosenBeast(), chosenBeast.engageAbility(0));
    }
}
