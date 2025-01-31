package org.designPatterns.DecoratorDP;

import org.designPatterns.DecoratorDP.Decorator.JaggeryDecorator;
import org.designPatterns.DecoratorDP.Decorator.MilkDecorator;
import org.designPatterns.DecoratorDP.Decorator.SugarDecorator;

public class Main {

    public static void main(String[] args) {

        Coffee coffee = new BaseCoffee();
        System.out.println(coffee.getDescription() + " - $" + coffee.getCost());
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " - $" + coffee.getCost());
        coffee  = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " - $" + coffee.getCost());
        coffee = new JaggeryDecorator(coffee);
        System.out.println(coffee.getDescription() + " - $" + coffee.getCost());
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " - $" + coffee.getCost());
        coffee = new JaggeryDecorator(coffee);
        System.out.println(coffee.getDescription() + " - $" + coffee.getCost());
    }

}
