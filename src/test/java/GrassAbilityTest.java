import abilities.FireAbility;
import abilities.GrassAbility;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GrassAbilityTest {

    private GrassAbility razorLeaf;

    @Before
    public void before(){
        razorLeaf = new GrassAbility("Razor Leaf", 20);
    }

    @Test
    public void can_get_name(){
        assertEquals("Razor Leaf", razorLeaf.getName());
    }

    @Test
    public void can_get_effect(){
        assertEquals(20, razorLeaf.getEffect());
    }

}
