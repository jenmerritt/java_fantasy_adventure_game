package game_modes;

import arenas.Arena;
import characters.Boss;
import characters.IFight;
import characters.Player;

import java.util.Collections;

public class VersusOne implements Winnable {

    private Arena stadium;
    private Player player;
    private boolean hasBeenWon;
    private IFight winner;

    public VersusOne(Arena stadium, Player player) {
        this.stadium = stadium;
        this.player = player;
        this.hasBeenWon = false;
        this.winner = null;
    }

    public Arena getStadium() {
        return this.stadium;
    }

    public IFight getPlayer() {
        return this.player;
    }

    public IFight getBoss(){
        return this.stadium.getBoss();
    }

    public boolean getHasBeenWon(){
        return this.hasBeenWon;
    }

    public void setupGame() {
        // get boss from stadium
        IFight boss = getBoss();
        // set a random beast as the boss' chosen beast
        Collections.shuffle(boss.getBeasts());
        boss.chooseBeast(0);
        // could ask player for their chosen beast and input
        player.chooseBeast(0);
    }

    public void playRound(IFight player, IFight boss) {
        player.fight(boss);
        boss.fight(player);
//        if(boss.getChosenBeast().getHealth() > 0){
//        }
//        else {
//            this.hasBeenWon = true;
//            this.winner = player;
//        }
//        if(player.getChosenBeast().getHealth() == 0){
//            this.hasBeenWon = true;
//            this.winner = boss;
//        }
    }

    public boolean checkWin() {
        if(this.hasBeenWon == true){
            return true;
        } else {
            return false;
        }
    }

    public IFight getWinner() {
        return this.getWinner();
    }
}
