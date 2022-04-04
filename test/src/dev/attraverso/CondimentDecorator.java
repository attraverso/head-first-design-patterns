package dev.attraverso;


public abstract class CondimentDecorator extends Beverage {
    // holds a concrete Beverage instance, the base that concrete decorators are going to wrap
    Beverage beverage;
}
