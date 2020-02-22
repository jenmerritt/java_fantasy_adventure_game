import abilities.FireAbility;
import abilities.WaterAbility;
import beasts.FireBeast;
import beasts.WaterBeast;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FireAbilityTest {

    private FireAbility flameThrower;

    @Before
    public void before(){
        flameThrower = new FireAbility("Flame Thrower", 30);
    }

    @Test
    public void can_get_name(){
        assertEquals("Flame Thrower", flameThrower.getName());
    }

    @Test
    public void can_get_effect(){
        assertEquals(30, flameThrower.getEffect());
    }

}
