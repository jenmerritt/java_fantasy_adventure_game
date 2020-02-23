import abilities.ElectricAbility;
import abilities.FireAbility;
import abilities.WaterAbility;
import beasts.Beast;
import beasts.ElectricBeast;
import beasts.FireBeast;
import beasts.WaterBeast;
import characters.Boss;
import characters.Player;
import items.Ether;
import items.MaxEther;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player ash;
    private Boss rocket;
    private ElectricAbility thunderBolt;
    private ElectricBeast pikachu;
    private ArrayList<ElectricAbility> pikachuAbilities;
    private ArrayList<Beast> ashBeasts;
    private Ether ether;
    private MaxEther maxEther;
    private FireAbility flameThrower;
    private ArrayList<FireAbility> charmanderAbilities;
    private FireBeast charmander;
    private ArrayList<Beast> rocketBeasts;


    @Before
    public void before(){
        ashBeasts = new ArrayList<Beast>();
        rocketBeasts = new ArrayList<Beast>();
        pikachuAbilities = new ArrayList<ElectricAbility>();
        charmanderAbilities = new ArrayList<FireAbility>();
        thunderBolt = new ElectricAbility("Thunder Bolt", 25);
        pikachuAbilities.add(thunderBolt);
        flameThrower = new FireAbility("Flame Thrower", 40);
        charmanderAbilities.add(flameThrower);
        pikachu = new ElectricBeast("Pikachu", pikachuAbilities);
        charmander = new FireBeast("Charmander", charmanderAbilities);
        ash = new Player("Ash", ashBeasts);
        rocket = new Boss("Team Rocket", rocketBeasts);
        rocketBeasts.add(charmander);
        ashBeasts.add(pikachu);
        ether = new Ether();
        maxEther = new MaxEther();
    }

    @Test
    public void can_get_name(){
        assertEquals("Ash", ash.getName());
    }

    @Test
    public void can_get_beasts(){
        assertEquals(ashBeasts, ash.getBeasts());
    }

    @Test
    public void can_get_number_of_beasts(){
        assertEquals(1, ash.getNumberOfBeasts());
    }

    @Test
    public void can_add_beast(){
        WaterBeast squirtle = new WaterBeast("Squirtle", new ArrayList<WaterAbility>());
        ash.addBeast(squirtle);
        assertEquals(2, ash.getNumberOfBeasts());
    }

    @Test
    public void can_not_add_more_than_3_beasts(){
        WaterBeast squirtle = new WaterBeast("Squirtle", new ArrayList<WaterAbility>());
        ash.addBeast(squirtle);
        ash.addBeast(squirtle);
        ash.addBeast(squirtle);
        ash.addBeast(squirtle);
        assertEquals(3, ash.getNumberOfBeasts());
    }

    @Test
    public void number_of_items_starts_at_zero(){
        assertEquals(0, ash.getNumberOfItems());
    }

    @Test
    public void can_add_item(){
        ash.addItem(ether);
        assertEquals(1, ash.getNumberOfItems());
    }

    @Test
    public void can_not_add_more_than_5_items(){
        ash.addItem(ether);
        ash.addItem(ether);
        ash.addItem(ether);
        ash.addItem(ether);
        ash.addItem(ether);
        ash.addItem(ether);
        assertEquals(5, ash.getNumberOfItems());
    }

    @Test
    public void chosen_beast_starts_null(){
        assertEquals(null, ash.getChosenBeast());
    }

    @Test
    public void can_update_chosen_beast(){
        WaterBeast squirtle = new WaterBeast("Squirtle", new ArrayList<WaterAbility>());
        ash.addBeast(squirtle);
        ash.chooseBeast(1);
        assertEquals(squirtle, ash.getChosenBeast());
    }

    @Test
    public void can_fight_enemy_and_reduce_health_of_their_beast(){
        rocket.chooseBeast(0);
        ash.chooseBeast(0);
        ash.fight(rocket);
        assertEquals(75, charmander.getHealth());
    }

}
