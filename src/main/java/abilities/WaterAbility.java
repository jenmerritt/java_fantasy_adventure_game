package abilities;

import beasts.Beast;

public class WaterAbility extends Ability {

    public WaterAbility(String name, int effect) {
        super(name, effect);
    }

    @Override
    public void effectHealth(Beast beast) {
        int beastHealth = beast.getHealth();
        if (beast.getType() == "FireBeast") {
            beast.setHealth(beastHealth - (getEffect()*2));
        }
        else if(beast.getType() == "ElectricBeast") {
            beast.setHealth(beastHealth - 5);
        }
        else {
            beast.setHealth(beastHealth - getEffect());
        }
    }
}
