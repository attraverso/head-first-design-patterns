package dev.attraverso;

public class WordBehavior implements WeaponBehavior {
    /* this gets called by a Character instance through its fight() method and WeaponBehavior's own useWeapon() */
    public void useWeapon() {
            System.out.println("WordBehavior: Try to TALK some sense into people");
    }
}
