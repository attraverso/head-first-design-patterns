package dev.attraverso;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        this.size = beverage.getSize();
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        double computedCost = this.beverage.cost();
        BeverageSize size = this.beverage.size;
        if (size == BeverageSize.TALL) {
            computedCost += .15;
        } else if (size == BeverageSize.GRANDE) {
            computedCost += .20;
        } else if (size == BeverageSize.VENTI) {
            computedCost += .25;
        }
        return computedCost;
    }
}
