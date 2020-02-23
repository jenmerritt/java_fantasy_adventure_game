package beasts;

import abilities.Ability;
import abilities.ElectricAbility;
import abilities.WaterAbility;

import java.util.ArrayList;

public class WaterBeast extends Beast {

    private ArrayList<WaterAbility> abilities;

    public WaterBeast(String name, ArrayList<WaterAbility> abilities) {
        super(name);
        this.abilities = abilities;
        this.type = "WaterBeast";
    }

    public ArrayList<WaterAbility> getAbilities() {
        return this.abilities;
    }

    public int getNumberOfAbilities(){
        return this.abilities.size();
    }

    public Ability engageAbility(int index) {
        return this.abilities.get(index);
    }
}
