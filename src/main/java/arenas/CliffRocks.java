package arenas;

import abilities.FireAbility;
import abilities.WaterAbility;
import beasts.Beast;
import beasts.FireBeast;
import beasts.WaterBeast;
import characters.Boss;

import java.util.ArrayList;

public class CliffRocks extends Arena {

    public CliffRocks(){
        this.boss = boss;
        this.name = "Cliff Rocks";
    }

    public void setupBoss(){
        WaterAbility waterCannon = new WaterAbility("Water Cannon", 20);
        ArrayList<WaterAbility> waterBeast1Abilities = new ArrayList<WaterAbility>();
        waterBeast1Abilities.add(waterCannon);
        Beast waterBeast1 = new WaterBeast("Squirtle", waterBeast1Abilities);
        ArrayList<Beast> waterBeasts = new ArrayList<Beast>();
        waterBeasts.add(waterBeast1);
        Boss cliffRocksBoss = new Boss("Aqua", waterBeasts);
        this.boss = cliffRocksBoss;
    }
}
