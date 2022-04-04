package dev.attraverso;

public class Darkroast extends Beverage{

    public Darkroast(BeverageSize size) {

        description = "Dark Roast";
        this.size = size;
    }

    public double cost() {
        return 0.99;
    }

}
