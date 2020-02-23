package characters;

import abilities.Ability;
import beasts.Beast;

import java.util.ArrayList;

public abstract class Character {

    private String name;
    private ArrayList<Beast> beasts;
    private Beast chosenBeast;

    public Character(String name, ArrayList<Beast> beasts){
        this.name = name;
        this.beasts = beasts;
        this.chosenBeast = null;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Beast> getBeasts(){
        return this.beasts;
    }

    public int getNumberOfBeasts(){
        return this.beasts.size();
    }

    public void addBeast(Beast beast){
        if(getNumberOfBeasts() < 3) {
            this.beasts.add(beast);
        }
    }

    public Beast getChosenBeast() {
        return this.chosenBeast;
    }

    public void chooseBeast(int index){
        this.chosenBeast = this.beasts.get(index);
    }

    public Ability chooseAttackMethod(int index){
        return this.chosenBeast.engageAbility(index);
    }

}
