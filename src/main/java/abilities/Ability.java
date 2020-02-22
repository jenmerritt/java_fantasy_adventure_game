package abilities;

import beasts.Beast;

import java.util.ArrayList;

public abstract class Ability implements IEffect {

    private String name;
    private int effect;

    public Ability(String name, int effect) {
        this.name = name;
        this.effect = effect;
    }

    public String getName() {
        return name;
    }

    public int getEffect() {
        return effect;
    }

    public void effectHealth(Beast beast) {
        int newHealth = beast.getHealth() - this.effect;
        beast.setHealth(newHealth);
    }
}
