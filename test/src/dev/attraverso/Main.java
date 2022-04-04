/* main branch has slightly more complicated version, with beverages that come in different sizes.
*  "decorator-base" branch has a simpler version*/

package dev.attraverso;

/* N.B. This is a basic implementation for learning purposes. IRL more patterns are needed to produce viable, production-worthy code.*/

public class Main {

    public static void main(String[] args) {
        // beverage with no condiments
        Beverage b = new Espresso(Beverage.BeverageSize.TALL);
        System.out.println(b.getDescription() + " | " + b.cost());

        //to add behavior at runtime, just add decorators to the initial class
        Beverage b2 = new Darkroast(Beverage.BeverageSize.GRANDE);
        b2 = new Mocha(b2);
        b2 = new Mocha(b2);
        b2 = new Whip(b2);
        System.out.println(b2.getDescription() + " | " + b2.cost());

        Beverage b3 = new HouseBlend(Beverage.BeverageSize.VENTI);
        b3 = new Soy(b3);
        b3 = new Mocha(b3);
        b3 = new Whip(b3);
        System.out.println(b3.getDescription() + " | " + b3.cost());
    }
}
