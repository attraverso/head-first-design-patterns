package dev.attraverso;

/*
 * We're marking this class ABSTRACT because we need it to provide base variables/methods for all subclasses,
 * but it would also make zero sense for a Character instance to start fighting.
 */
public abstract class Character {

    /* we leave it to the concrete class to define WHAT the behavior is. We're just making sure that,
     * when a fight breaks out, there is ONE clear way for other classes to issue a call to arms */
    WeaponBehavior weaponBehavior;

    /* every character has a different appearance, we just want to make sure that each concrete class
     * implements its own, so we can have them all appear as a group */
    public abstract void display();

    //each character may change behavior at runtime
    public void fight()
    {
        weaponBehavior.useWeapon();
    }
}
