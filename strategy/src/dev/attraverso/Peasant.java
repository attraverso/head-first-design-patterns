package dev.attraverso;

public class Peasant extends Character {

    Peasant() { weaponBehavior = new NoWeaponBehavior(); }

    public void display()
    {
        System.out.println("Rendering a Peasant.");
    }

    public void setWeaponBehavior(WeaponBehavior b)
    {
        weaponBehavior = b;
    }
}
