package org.designPatterns.DecoratorDP.Decorator;

import org.designPatterns.DecoratorDP.Coffee;

public class SugarDecorator implements CoffeeDecorator {

    protected final Coffee coffee;
    public SugarDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return this.coffee.getCost() + 2.5;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription() + ", Sugar";
    }
}
