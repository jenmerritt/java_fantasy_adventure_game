package arenas;

import abilities.FireAbility;
import beasts.Beast;
import beasts.FireBeast;
import characters.Boss;

import java.util.ArrayList;

public class Volcano extends Arena{

    public Volcano(){
        this.boss = boss;
        this.name = "Volcano";
    }

    public void setupBoss(){
        FireAbility flameThrower = new FireAbility("Flame Thrower", 25);
        ArrayList<FireAbility> fireBeast1Abilities = new ArrayList<FireAbility>();
        fireBeast1Abilities.add(flameThrower);
        Beast fireBeast1 = new FireBeast("Charmander", fireBeast1Abilities);
        ArrayList<Beast> fireBeasts = new ArrayList<Beast>();
        fireBeasts.add(fireBeast1);
        Boss volcanoBoss = new Boss("Lava", fireBeasts);
        this.boss = volcanoBoss;
    }
}
