package beasts;

import abilities.Ability;
import items.Item;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public abstract class Beast {

    private String name;
    protected int health;
    protected String type;

    public Beast(String name) {
        this.name = name;
        this.health = 100;
        this.type = "Beast";
    }

    public String getType(){
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int newHealth){
        if(newHealth < 0){
            this.health = 0;
        } else this.health = newHealth;
    }

    public void attack(Beast enemyBeast, Ability ability){
        ability.effectHealth(enemyBeast);
    }

    public abstract Ability engageAbility(int index);
}
