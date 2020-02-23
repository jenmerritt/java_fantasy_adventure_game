package abilities;

import beasts.Beast;

public class FireAbility extends Ability {

    public FireAbility(String name, int effect) {
        super(name, effect);
    }

    @Override
    public void effectHealth(Beast beast) {
        int beastHealth = beast.getHealth();
        if (beast.getType() == "GrassBeast") {
            beast.setHealth(beastHealth - (getEffect()*2));
        }
        else if(beast.getType() == "WaterBeast") {
            beast.setHealth(beastHealth - 5);
        }
            else{
            beast.setHealth(beastHealth - getEffect());
        }
    }

}
