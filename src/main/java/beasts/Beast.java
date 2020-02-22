package beasts;

import abilities.Ability;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public abstract class Beast {

    private String name;
    protected int health;

    public Beast(String name) {
        this.name = name;
        this.health = 100;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int newHealth){
        this.health = newHealth;
    }

    public void attack(Beast enemyBeast, Ability ability){
        ability.effectHealth(enemyBeast);
    }

    public abstract Ability engageAbility(int index);
}
