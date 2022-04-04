package dev.attraverso;

public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage) {
        this.beverage = beverage;
        this.size = beverage.getSize();
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Whip";
    }

    public double cost() {

        double computedCost = beverage.cost();
        BeverageSize size = beverage.getSize();
        if (size == BeverageSize.TALL) {
            computedCost += .05;
        } else if (size == BeverageSize.GRANDE) {
            computedCost += .10;
        } else if (size == BeverageSize.VENTI) {
            computedCost += .15;
        }
        return computedCost;
    }
}
