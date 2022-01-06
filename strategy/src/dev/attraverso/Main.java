package dev.attraverso;

/*
* A basic terminal app with characters that have both common and particular behaviors.
* We want to display a character per type, and then have them all fight each other.
*/

public class Main {

    public static void main(String[] args) {
        /*
        * When it's time for a fight to break out, you only need to know which Character subtype objects are involved.
        * Then you can just call methods from their supertype (polymorphism).
        */
        Knight k = new Knight();
        k.display(); // this calls the Knight's version of display()
        Queen q = new Queen();
        q.display();
        Peasant p = new Peasant();
        p.display();
        Character p2 = p;
        p2.display(); //calling display on p and p1 leads to the exact same result (the method is abstract)

        Character[] arr = {q, k, p, p2};
        for (Character c : arr) {
            c.fight();
        }

        /* We can change a Peasant's behavior at runtime */
        p.setWeaponBehavior(new ShovelBehavior());
        p.fight();
    }

}