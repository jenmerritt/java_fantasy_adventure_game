package arenas;

import characters.Boss;

public abstract class Arena {

    protected String name;
    private Boss boss;

    public Arena(Boss boss) {
        this.name = "Arena";
        this.boss = boss;
    }

    public String getName() {
        return name;
    }

    public Boss getBoss() {
        return boss;
    }

//    public abstract void setupBoss();
}
