package dev.attraverso;

public class Queen extends Character
{
    /* When we instantiate a new Queen, we establish what behavior she should manifest
    * when it's time to fight. */
    public Queen()
    {
        weaponBehavior = new WordBehavior();
    }

    public void display()
    {
        System.out.println("Rendering a Queen.");
    }
}
