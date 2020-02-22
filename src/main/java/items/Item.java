package items;

import abilities.IEffect;
import beasts.Beast;

public abstract class Item implements IEffect {

    protected String name;
    protected int effect;

    public Item() {
        this.name = "Item";
        this.effect = 10;
    }

    public String getName() {
        return name;
    }

    public int getEffect() {
        return effect;
    }

    public void effectHealth(Beast beast) {
        int newHealth = beast.getHealth() + this.effect;
        beast.setHealth(newHealth);
    }

}
