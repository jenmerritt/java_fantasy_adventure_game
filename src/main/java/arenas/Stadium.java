package arenas;

import characters.Boss;

public class Stadium extends Arena {

    public Stadium(Boss boss){
        this.boss = boss;
        this.name = "Stadium";
    }

    public void setupBoss() {
    }
}
