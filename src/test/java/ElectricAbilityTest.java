import abilities.ElectricAbility;
import abilities.WaterAbility;
import beasts.Beast;
import beasts.WaterBeast;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ElectricAbilityTest {

    private ElectricAbility thunderBolt;
    private WaterBeast squirtle;
    private WaterAbility waterCannon;

    @Before
    public void before(){
        thunderBolt = new ElectricAbility("Thunder Bolt", 25);
        ArrayList<WaterAbility> squirtleAbilities = new ArrayList<WaterAbility>();
        waterCannon = new WaterAbility("Water Cannon", 10);
        squirtleAbilities.add(waterCannon);
        squirtle = new WaterBeast("Squirtle", squirtleAbilities);
    }

    @Test
    public void can_get_name(){
        assertEquals("Thunder Bolt", thunderBolt.getName());
    }

    @Test
    public void can_get_effect(){
        assertEquals(25, thunderBolt.getEffect());
    }

}
