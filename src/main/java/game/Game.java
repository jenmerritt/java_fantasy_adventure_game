package game;

import game_modes.Winnable;

public class Game {

    public void playGame(Winnable gameMode){
        gameMode.setupGame();
        while(gameMode.checkWin() == false){
            gameMode.playRound(gameMode.getPlayer(), gameMode.getBoss());
        }
    }

}
