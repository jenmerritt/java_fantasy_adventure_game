package game_modes;

import characters.IFight;

public interface IBattle {

     void setupGame();

     IFight getPlayer();

     IFight getBoss();

     void playRound(IFight player, IFight boss);

     IFight getWinner();
}
