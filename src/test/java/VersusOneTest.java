import abilities.FireAbility;
import abilities.WaterAbility;
import arenas.Stadium;
import beasts.Beast;
import beasts.FireBeast;
import beasts.WaterBeast;
import characters.Boss;
import characters.Player;
import game_modes.VersusOne;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class VersusOneTest {

    private Player ash;
    private Boss rocket;
    private WaterAbility waterCannon;
    private WaterBeast squirtle;
    private ArrayList<WaterAbility> squirtleAbilities;
    private ArrayList<Beast> ashBeasts;
    private FireAbility flameThrower;
    private ArrayList<FireAbility> charmanderAbilities;
    private FireBeast charmander;
    private ArrayList<Beast> rocketBeasts;
    private Stadium stadium;
    private VersusOne versusOne;

    @Before
    public void before(){
        ashBeasts = new ArrayList<Beast>();
        rocketBeasts = new ArrayList<Beast>();
        squirtleAbilities = new ArrayList<WaterAbility>();
        charmanderAbilities = new ArrayList<FireAbility>();
        waterCannon = new WaterAbility("WaterCannnon", 20);
        squirtleAbilities.add(waterCannon);
        flameThrower = new FireAbility("Flame Thrower", 20);
        charmanderAbilities.add(flameThrower);
        squirtle = new WaterBeast("Squirtle", squirtleAbilities);
        charmander = new FireBeast("Charmander", charmanderAbilities);
        rocketBeasts.add(charmander);
        ashBeasts.add(squirtle);
        ash = new Player("Ash", ashBeasts);
        rocket = new Boss("Team Rocket", rocketBeasts);
        stadium = new Stadium(rocket);
        versusOne = new VersusOne(stadium, ash);
    }

    @Test
    public void can_get_stadium(){
        assertEquals(stadium, versusOne.getStadium());
    }

    @Test
    public void can_get_player(){
        assertEquals(ash, versusOne.getPlayer());
    }

    @Test
    public void can_get_boss(){
        assertEquals(rocket, versusOne.getBoss());
    }

    @Test
    public void can_setup_game(){
        versusOne.setupGame();
        assertEquals(squirtle, ash.getChosenBeast());
        assertEquals(charmander, rocket.getChosenBeast());
    }

    @Test
    public void can_play_round(){
        versusOne.setupGame();
        versusOne.playRound(ash, rocket);
        assertEquals(0, charmander.getHealth());
        assertEquals(85, squirtle.getHealth());
    }

}
