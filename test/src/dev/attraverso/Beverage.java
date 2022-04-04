package dev.attraverso;

// BASE TYPE FOR THE WHOLE PATTERN. every other class involved inherits this one
public abstract class Beverage {
    String description = "Base beverage.";
    BeverageSize size;
    enum BeverageSize {
        TALL,
        GRANDE,
        VENTI
    }

    public String getDescription() {
        return description;
    };

    public abstract double cost();

    public BeverageSize getSize()
    {
        return size;
    };
}
