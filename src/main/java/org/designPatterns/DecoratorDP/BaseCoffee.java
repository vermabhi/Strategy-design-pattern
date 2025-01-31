package org.designPatterns.DecoratorDP;

public class BaseCoffee implements Coffee{
    @Override
    public double getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}
