package abilities;

import beasts.Beast;

public class ElectricAbility extends Ability {

    public ElectricAbility(String name, int effect) {
        super(name, effect);
    }

    @Override
    public void effectHealth(Beast beast) {
        int beastHealth = beast.getHealth();
        if (beast.getClass().getName() == "WaterBeast") {
            beast.setHealth(beastHealth);
        } else {
            beast.setHealth(beastHealth - getEffect());
        }
    }


}
