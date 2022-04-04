package dev.attraverso;

public class SteamedMilk extends CondimentDecorator{

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
        this.size = beverage.getSize();
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Steamed Milk";
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
