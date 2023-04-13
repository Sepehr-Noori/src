package Model.units;

import Model.units.Enums.Speed;

public abstract class Units {
    private int hp;
    private Speed speed;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Speed getSpeed() {
        return speed;
    }

    protected void setSpeed(Speed speed) {
        this.speed = speed;
    }
}
