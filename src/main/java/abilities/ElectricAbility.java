package abilities;

import beasts.Beast;

public class ElectricAbility extends Ability {

    public ElectricAbility(String name, int effect) {
        super(name, effect);
    }

    @Override
    public void effectHealth(Beast beast) {
        int beastHealth = beast.getHealth();
        if (beast.getType() == "WaterBeast") {
            beast.setHealth(beastHealth - (getEffect()*2));
        } else {
            beast.setHealth(beastHealth - getEffect());
        }
    }
}
