package game_modes;

import arenas.*;
import characters.Player;

public class Story {

    private VersusOne level1;
    private VersusOne level2;
    private VersusOne level3;
    private Player player;
    private int currentLevel;
    private boolean storyComplete;

    public Story(Player player){
        this.level1 = new VersusOne(new Greenhouse(), player);
        this.level2 = new VersusOne(new Volcano(), player);
        this.level3 = new VersusOne(new CliffRocks(), player);
        this.player = player;
        this.currentLevel = 1;
        this.storyComplete = false;

    }

    public void setupLevels(){
        level1.getStadium().setupBoss();
        level2.getStadium().setupBoss();
        level3.getStadium().setupBoss();
    }

    public int getCurrentLevel() {
        return this.currentLevel;
    }

    public VersusOne getLevel1() {
        return level1;
    }

    public VersusOne getLevel2() {
        return level2;
    }

    public VersusOne getLevel3() {
        return level3;
    }

    public boolean isStoryComplete() {
        return storyComplete;
    }

    public void playLevel(IBattle level){
        level.setupGame();
        level.playRound(this.player, level.getBoss());
        if(level.getWinner() == this.player) {
            this.currentLevel++;
        }
    }

    public void playStory(){
        setupLevels();
        if(this.currentLevel == 1) {
            playLevel(level1);
        }
        if(this.currentLevel == 2){
            playLevel(level2);
        }
        if(this.currentLevel == 3){
            playLevel(level3);
        }
        if(this.currentLevel == 4){
            this.storyComplete = true;
        }
    }


    public void setCurrentLevel(int level) {
        this.currentLevel = level;
    }
}
