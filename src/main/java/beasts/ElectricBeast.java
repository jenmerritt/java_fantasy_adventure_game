package beasts;

import abilities.Ability;
import abilities.ElectricAbility;

import java.util.ArrayList;

public class ElectricBeast extends Beast {

    private ArrayList<ElectricAbility> abilities;

    public ElectricBeast(String name, ArrayList<ElectricAbility> abilities) {
        super(name);
        this.abilities = abilities;
    }

    public ArrayList<ElectricAbility> getAbilities() {
        return this.abilities;
    }

    public int getNumberOfAbilities(){
        return this.abilities.size();
    }

    public Ability engageAbility(int index) {
        return this.abilities.get(index);
    }
}
