package arenas;

import abilities.GrassAbility;
import beasts.Beast;
import beasts.GrassBeast;
import characters.Boss;

import java.util.ArrayList;

public class Greenhouse extends Arena {

    public Greenhouse(){
        this.boss = boss;
        this.name = "Greenhouse";
    }

    public void setupBoss(){
        GrassAbility razorLeaf = new GrassAbility("Razor Leaf", 20);
        ArrayList<GrassAbility> grassBeast1Abilities = new ArrayList<GrassAbility>();
        grassBeast1Abilities.add(razorLeaf);
        Beast grassBeast1 = new GrassBeast("Bulbasour", grassBeast1Abilities);
        ArrayList<Beast> greenhouseBeasts = new ArrayList<Beast>();
        greenhouseBeasts.add(grassBeast1);
        Boss greenhouseBoss = new Boss("Green Fingers", greenhouseBeasts);
        this.boss = greenhouseBoss;
    }
}
