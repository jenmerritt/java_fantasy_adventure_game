package game;

import game_modes.IBattle;
import game_modes.Story;

public class Game {

    public void playVersusMode(IBattle gameMode){
        gameMode.setupGame();
        gameMode.playRound(gameMode.getPlayer(), gameMode.getBoss());
    }

    public void playStoryMode(Story story){
        story.setupLevels();
        story.playStory();
    }

}
