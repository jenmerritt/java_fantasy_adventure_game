import abilities.ElectricAbility;
import abilities.FireAbility;
import beasts.Beast;
import beasts.ElectricBeast;
import beasts.FireBeast;
import characters.Player;
import game_modes.Story;
import game_modes.VersusOne;
import items.Item;
import items.MaxEther;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class StoryTest {

    private ArrayList<FireAbility> charmanderAbilities;
    private FireAbility flameThrower;
    private FireAbility lowPowerFlame;
    private FireAbility mediumPowerFlame;
    private ArrayList<Beast> mistyBeasts;
    private FireBeast charmander;
    private Player misty;
    private Item maxEther;
    private Story storyA;

    @Before
    public void before(){
        charmanderAbilities = new ArrayList<FireAbility>();
        flameThrower = new FireAbility("Flame Thrower", 100);
        lowPowerFlame = new FireAbility("Low Power Flame", 20);
        mediumPowerFlame = new FireAbility("Medium Power Flame", 50);
        charmanderAbilities.add(flameThrower);
        charmander = new FireBeast("Charmander", charmanderAbilities);
        mistyBeasts = new ArrayList<Beast>();
        mistyBeasts.add(charmander);
        misty = new Player("Misty", mistyBeasts);
        maxEther = new MaxEther();
        storyA = new Story(misty);
        misty.addItem(maxEther);
    }

    @Test
    public void starts_at_level_1(){
        assertEquals(1, storyA.getCurrentLevel());
    }

    @Test
    public void can_play_level_one_and_reach_level_2(){
        storyA.setupLevels();
        VersusOne level1 = storyA.getLevel1();
        storyA.playLevel(level1);
        assertEquals(2, storyA.getCurrentLevel());
        assertEquals(100, misty.getChosenBeastHealth());
        assertEquals(0, level1.getBoss().getChosenBeastHealth());
    }

    @Test
    public void can_play_level_two_and_reach_level_3(){
        storyA.setupLevels();
        storyA.setCurrentLevel(2);
        VersusOne level2 = storyA.getLevel2();
        storyA.playLevel(level2);
        assertEquals(3, storyA.getCurrentLevel());
        assertEquals(100, misty.getChosenBeastHealth());
        assertEquals(0, level2.getBoss().getChosenBeastHealth());
    }

    @Test
    public void can_reach_level_2_and_stop_if_lose(){
        charmanderAbilities.remove(flameThrower);
        charmanderAbilities.add(lowPowerFlame);
        storyA.playStory();
        assertEquals(2, storyA.getCurrentLevel());
        assertEquals(0, misty.getChosenBeastHealth());
        assertEquals(false, storyA.isStoryComplete());
    }

    @Test
    public void can_reach_level_3_and_stop_if_lose(){
        charmanderAbilities.remove(flameThrower);
        charmanderAbilities.add(mediumPowerFlame);
        storyA.playStory();
        assertEquals(3, storyA.getCurrentLevel());
        assertEquals(0, misty.getChosenBeastHealth());
        assertEquals(false, storyA.isStoryComplete());
    }

    @Test
    public void can_complete_story(){
        mistyBeasts.remove(0);
        ElectricAbility thunderBolt = new ElectricAbility("Thunder Bolt", 100);
        ArrayList<ElectricAbility> pikachuAbilities = new ArrayList<ElectricAbility>();
        pikachuAbilities.add(thunderBolt);
        ElectricBeast pikachu = new ElectricBeast("Pikachu", pikachuAbilities);
        mistyBeasts.add(pikachu);
        storyA.playStory();
        assertEquals(4, storyA.getCurrentLevel());
        assertEquals(100, misty.getChosenBeastHealth());
        assertEquals(true, storyA.isStoryComplete());
    }

}
