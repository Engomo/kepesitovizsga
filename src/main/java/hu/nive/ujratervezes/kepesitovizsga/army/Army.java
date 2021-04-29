package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Army {

    List<MilitaryUnit> army = new ArrayList<>();

    public int getArmySize() {
        return army.size();
    }

    public void addUnit(MilitaryUnit unit) {
        army.add(unit);
    }

    public int getArmyDamage() {
        int armyDamage = 0;
        for (MilitaryUnit unit : army) {
            armyDamage += unit.doDamage();
        }
        return armyDamage;
    }

    public void damageAll(int damage) {
        for (MilitaryUnit unit : army) {
            unit.sufferDamage(damage);
            }
        Iterator<MilitaryUnit> armyIterator = army.iterator();
        while (armyIterator.hasNext()) {

            if (armyIterator.next().hitPoints < 25) {
                armyIterator.remove();
            }
        }
        }
    }

