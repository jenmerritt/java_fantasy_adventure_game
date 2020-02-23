import abilities.ElectricAbility;
import abilities.WaterAbility;
import beasts.Beast;
import beasts.ElectricBeast;
import beasts.WaterBeast;
import characters.Boss;
import characters.Player;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BossTest {

    private Boss rocket;
    private ElectricBeast pikachu;
    private ElectricAbility thunderBolt;
    private ArrayList<Beast> rocketBeasts;
    private ArrayList<ElectricAbility> pikachuAbilities;
    private Player ash;
    private ArrayList<Beast> ashBeasts;


    @Before
    public void before(){
        ashBeasts = new ArrayList<Beast>();
        rocketBeasts = new ArrayList<Beast>();
        thunderBolt = new ElectricAbility("Thunder Bolt", 25);
        pikachuAbilities = new ArrayList<ElectricAbility>();
        pikachuAbilities.add(thunderBolt);
        pikachu = new ElectricBeast("Pikachu", pikachuAbilities);
        rocketBeasts.add(pikachu);
        ashBeasts.add(pikachu);
        rocket = new Boss("Team Rocket", rocketBeasts);
        ash = new Player("Ash", ashBeasts);
    }

    @Test
    public void can_get_name(){
        assertEquals("Team Rocket", rocket.getName());
    }

    @Test
    public void can_get_beasts(){
        assertEquals(rocketBeasts, rocket.getBeasts());
    }

    @Test
    public void can_get_number_of_beasts(){
        assertEquals(1, rocket.getNumberOfBeasts());
    }

    @Test
    public void can_add_beast(){
        WaterBeast squirtle = new WaterBeast("Squirtle", new ArrayList<WaterAbility>());
        rocket.addBeast(squirtle);
        assertEquals(2, rocket.getNumberOfBeasts());
    }

    @Test
    public void can_not_add_more_than_3_beasts(){
        WaterBeast squirtle = new WaterBeast("Squirtle", new ArrayList<WaterAbility>());
        rocket.addBeast(squirtle);
        rocket.addBeast(squirtle);
        rocket.addBeast(squirtle);
        rocket.addBeast(squirtle);
        assertEquals(3, rocket.getNumberOfBeasts());
    }

    @Test
    public void can_fight_player_and_reduce_health_of_their_beast(){
        rocket.chooseBeast(0);
        ash.chooseBeast(0);
        rocket.fight(ash);
        assertEquals(75, ash.getChosenBeast().getHealth());
    }

}
