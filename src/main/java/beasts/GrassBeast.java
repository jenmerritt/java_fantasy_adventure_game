package beasts;

import abilities.Ability;
import abilities.ElectricAbility;
import abilities.GrassAbility;

import java.util.ArrayList;

public class GrassBeast extends Beast {

    private ArrayList<GrassAbility> abilities;

    public GrassBeast(String name, ArrayList<GrassAbility> abilities) {
        super(name);
        this.abilities = abilities;
        this.type = "GrassBeast";
    }

    public ArrayList<GrassAbility> getAbilities() {
        return this.abilities;
    }

    public int getNumberOfAbilities(){
        return this.abilities.size();
    }

    public Ability engageAbility(int index) {
        return this.abilities.get(index);
    }
}
