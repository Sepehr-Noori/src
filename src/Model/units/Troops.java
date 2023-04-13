package Model.units;

import Model.units.Enums.ArmorType;
import Model.units.Enums.WeaponType;

public abstract class Troops extends Units{
    private WeaponType weaponType;
    private ArmorType armorType;
    private int damage;
    private boolean hasHorse;
    private boolean isArab;
    private boolean hasFiringWeapon;

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public ArmorType getArmorType() {
        return armorType;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isHasHorse() {
        return hasHorse;
    }

    public boolean isArab() {
        return isArab;
    }

    public boolean isHasFiringWeapon() {
        return hasFiringWeapon;
    }

    protected void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    protected void setArmorType(ArmorType armorType) {
        this.armorType = armorType;
    }

    protected void setDamage(int damage) {
        this.damage = damage;
    }

    protected void setHasHorse(boolean hasHorse) {
        this.hasHorse = hasHorse;
    }

    protected void setArab(boolean arab) {
        isArab = arab;
    }

    protected void setHasFiringWeapon(boolean hasFiringWeapon) {
        this.hasFiringWeapon = hasFiringWeapon;
    }
}
