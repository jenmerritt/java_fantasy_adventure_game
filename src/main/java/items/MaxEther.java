package items;

import beasts.Beast;

public class MaxEther extends Item {

    public MaxEther() {
        this.name = "Max Ether";
        this.effect = 100;
    }

    public void effectHealth(Beast beast) {
        beast.setHealth(100);
    }
}
