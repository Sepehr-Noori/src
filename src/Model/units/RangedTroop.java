package Model.units;

public class RangedTroop extends Troops{
    private int range;
    private double damageRatioOnArmor;

    public RangedTroop(int range, double damageRatioOnArmor) {
        this.range = range;
        this.damageRatioOnArmor = damageRatioOnArmor;
    }

    public int getRange() {
        return range;
    }

    public double getDamageRatioOnArmor() {
        return damageRatioOnArmor;
    }
}
