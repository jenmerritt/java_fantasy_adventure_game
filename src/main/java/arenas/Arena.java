package arenas;

import beasts.Beast;
import characters.Boss;

import java.util.ArrayList;

public abstract class Arena {

    protected String name;
    protected Boss boss;

    public Arena() {
        this.name = "Arena";
        this.boss = new Boss("Boss", new ArrayList<Beast>());
    }

    public String getName() {
        return name;
    }

    public Boss getBoss() {
        return boss;
    }

    public abstract void setupBoss();

}
