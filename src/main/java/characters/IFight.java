package characters;

import beasts.Beast;

import java.util.ArrayList;

public interface IFight {
    void fight(IFight opponent);
    ArrayList<Beast> getBeasts();
    Beast getChosenBeast();
    void chooseBeast(int index);

}
