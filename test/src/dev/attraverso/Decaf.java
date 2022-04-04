package dev.attraverso;

public class Decaf extends Beverage{

    public Decaf(BeverageSize size) {

        description = "Decaf";
        this.size = size;
    }

    public double cost() {
        return 1.05;
    }

}
