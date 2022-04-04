package dev.attraverso;

public class Soy extends CondimentDecorator{

    public Soy(Beverage beverage) {
        this.beverage = beverage;
        this.size = beverage.getSize();
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }

    public double cost()
    {
        double computedCost = beverage.cost();
        BeverageSize size = beverage.getSize();
        if (size == BeverageSize.TALL) {
            computedCost += .10;
        } else if (size == BeverageSize.GRANDE) {
            computedCost += .15;
        } else if (size == BeverageSize.VENTI) {
            computedCost += .20;
        }
        return computedCost;
    }
}
