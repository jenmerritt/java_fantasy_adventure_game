import abilities.ElectricAbility;
import beasts.ElectricBeast;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ElectricBeastTest {

    private ElectricBeast pikachu;
    private ElectricAbility thunderBolt;
    private ArrayList<ElectricAbility> pikachuAbilities;

    @Before
    public void before(){
        pikachuAbilities = new ArrayList<ElectricAbility>();
        thunderBolt = new ElectricAbility("Thunder Bolt", 25);
        pikachuAbilities.add(thunderBolt);
        pikachu = new ElectricBeast("Pikachu", pikachuAbilities);
    }

    @Test
    public void can_get_name(){
        assertEquals("Pikachu", pikachu.getName());
    }

    @Test
    public void can_get_abilities(){
        assertEquals(pikachuAbilities, pikachu.getAbilities());
    }

    @Test
    public void can_get_number_of_abilities(){
        assertEquals(1, pikachu.getNumberOfAbilities());
    }

    @Test
    public void can_get_health(){
        assertEquals(100, pikachu.getHealth());

    }
}
