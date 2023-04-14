package Model.units;

import Model.units.Enums.MeleeTroops;

public class MeleeTroop extends Troops{
    private boolean canScaleWall;
    private boolean canDigKhandagh;

    public MeleeTroop(MeleeTroops meleeTroop) {

    }

    public boolean isCanScaleWall() {
        return canScaleWall;
    }

    public boolean isCanDigKhandagh() {
        return canDigKhandagh;
    }
}
