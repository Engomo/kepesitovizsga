package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit{

    private int numOfAttacks = 0;

    public HeavyCavalry() {
        this.hitPoints = 150;
        this.damagePoints = 20;
        this.armor = true;
    }

    @Override
    public int doDamage() {
        if (numOfAttacks == 0) {
            numOfAttacks++;
            return damagePoints * 3;
        } else
        return damagePoints;
    }

    @Override
    public void sufferDamage(int damage) {
        hitPoints -= damage/2;
    }
}
