package org.designPatterns.DecoratorDP.Decorator;

import org.designPatterns.DecoratorDP.Coffee;

public class MilkDecorator implements CoffeeDecorator{

    protected final Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return this.coffee.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription() + ", Milk";
    }
}
