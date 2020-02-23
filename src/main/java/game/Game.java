package game;

import characters.IFight;
import game_modes.Winnable;

public class Game {

        public void playGame(Winnable gameMode){
        gameMode.setupGame();
        gameMode.playRound(gameMode.getPlayer(), gameMode.getBoss());
    }

}
