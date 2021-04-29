package hu.nive.ujratervezes.kepesitovizsga.army;

public class Archer extends  MilitaryUnit{

    public Archer() {
        this.hitPoints = 50;
        this.damagePoints = 20;
        this.armor = false;
    }

    @Override
    public int doDamage() {
        return damagePoints;
    }

    @Override
    public void sufferDamage(int damage) {
        hitPoints -= damage;
    }
}
