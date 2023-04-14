package Model.units;

import Model.units.Enums.Speed;

public abstract class People {
    protected int hp;
    protected Speed speed;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getSpeed() {
        return speed.getMoveInEachTurn();
    }
}
