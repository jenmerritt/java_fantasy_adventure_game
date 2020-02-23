package game_modes;

import characters.IFight;

public interface Winnable {

     void setupGame();

     IFight getPlayer();

     IFight getBoss();

     void playRound(IFight player, IFight boss);

     IFight getWinner();
}
