package characters;

import abilities.Ability;
import beasts.Beast;
import items.Item;

import java.util.ArrayList;

public class Player extends Character implements IFight {

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

    public Item getItem(int index){
        return items.get(index);
    }

    public void fight(IFight opponent){
        Beast chosenBeast = getChosenBeast();
        chosenBeast.attack(opponent.getChosenBeast(), chosenBeast.engageAbility(0));
    }

    public void healChosenBeastWithItem(int itemIndex){
        if(getNumberOfItems() > 0){
            Item item = getItem(itemIndex);
            item.effectHealth(getChosenBeast());
        }

    }

}
