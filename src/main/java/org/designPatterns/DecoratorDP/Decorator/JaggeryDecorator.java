package org.designPatterns.DecoratorDP.Decorator;

import org.designPatterns.DecoratorDP.Coffee;

public class JaggeryDecorator implements CoffeeDecorator{

    protected final Coffee coffee;

    public JaggeryDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return this.coffee.getCost()+3.5;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription() + ", Jaggery";
    }
}
