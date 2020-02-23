package beasts;

import abilities.Ability;
import abilities.ElectricAbility;
import abilities.FireAbility;

import java.util.ArrayList;

public class FireBeast extends Beast {

    private ArrayList<FireAbility> abilities;

    public FireBeast(String name, ArrayList<FireAbility> abilities) {
        super(name);
        this.abilities = abilities;
        this.type = "FireBeast";
    }

    public ArrayList<FireAbility> getAbilities() {
        return this.abilities;
    }

    public int getNumberOfAbilities(){
        return this.abilities.size();
    }

    public Ability engageAbility(int index) {
        return this.abilities.get(index);
    }
}
