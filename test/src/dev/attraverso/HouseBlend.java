package dev.attraverso;

public class HouseBlend extends Beverage{

    public HouseBlend(BeverageSize size) {

        description = "House Blend";
        this.size = size;
    }

    public double cost() {
        return 0.89;
    }

}
