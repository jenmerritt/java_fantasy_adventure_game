import abilities.ElectricAbility;
import abilities.WaterAbility;
import beasts.WaterBeast;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class WaterAbilityTest {

    private WaterAbility waterCannon;

    @Before
    public void before(){
        waterCannon = new WaterAbility("Water Cannon", 10);
    }

    @Test
    public void can_get_name(){
        assertEquals("Water Cannon", waterCannon.getName());
    }

    @Test
    public void can_get_effect(){
        assertEquals(10, waterCannon.getEffect());
    }

}
