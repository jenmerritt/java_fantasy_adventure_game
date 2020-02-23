package game_modes;

import arenas.Arena;
import characters.Boss;
import characters.IFight;
import characters.Player;

import java.util.Collections;

public class VersusOne implements Winnable {

    private Arena stadium;
    private Player player;
    private IFight winner;

    public VersusOne(Arena stadium, Player player) {
        this.stadium = stadium;
        this.player = player;
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

    public IFight getWinner() {
        return this.winner;
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

    public boolean playerStillAlive(IFight player){
        if(player.getChosenBeastHealth() > 0){
            return true;
        }
        else return false;
    }


    public void playRound(IFight player, IFight boss){
        while(playerStillAlive(player) && playerStillAlive(boss)){
            player.fight(boss);
            player.fight(player);
        }
        if(!playerStillAlive(player)){
            this.winner = boss;
        }
        else if(!playerStillAlive(boss)){
            this.winner = player;
        }
    }

}
