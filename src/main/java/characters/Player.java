package characters;

import abilities.Ability;
import beasts.Beast;
import items.Item;

import java.util.ArrayList;

public class Player extends Character {

    private ArrayList<Item> items;

    public Player(String name, ArrayList<Beast> beasts){
        super(name, beasts);
        this.items = new ArrayList<Item>();
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    public int getNumberOfItems(){
        return this.items.size();
    }

    public void addItem(Item item){
        if(getNumberOfItems() < 5) {
            this.items.add(item);
        }
    }

    public void fight(Enemy enemy){
        // enemy should choose beast
        enemy.changeChosenBeast(0);
        Beast enemyBeast = enemy.getChosenBeast();
        // Ask user which beast they want
        changeChosenBeast(0);
        // Ask user which ability they want to use
        Ability ability = chooseAttackMethod(0);
        // get chosen beast to attack
        getChosenBeast().attack(enemyBeast, ability);
    }

}
