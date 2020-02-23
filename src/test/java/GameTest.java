import abilities.FireAbility;
import abilities.WaterAbility;
import arenas.Stadium;
import beasts.Beast;
import beasts.FireBeast;
import beasts.WaterBeast;
import characters.Boss;
import characters.Player;
import game.Game;
import game_modes.VersusOne;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameTest {

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
    private Game game;

    @Before
    public void before() {
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
        game = new Game();
    }

    @Test
    public void can_get_correct_winner_of_versus_one_game(){
        game.playGame(versusOne);
        assertEquals(ash, versusOne.getWinner());
    }
}
