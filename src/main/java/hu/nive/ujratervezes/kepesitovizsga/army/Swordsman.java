package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit{

    private boolean shield = true;

    public Swordsman(boolean armor) {
        this.hitPoints = 100;
        this.damagePoints = 10;
        this.armor = armor;
    }

    @Override
    public int doDamage() {
        return damagePoints;
    }

    @Override
    public void sufferDamage(int damage) {
        if (shield == true) {
            setShield(false);
        } else if (armor == true) {
            hitPoints -= damage / 2;
        }else {
            hitPoints -= damage;
        }
    }

    public void setShield(boolean shield) {
        this.shield = shield;
    }
}
