package designPatterns.facade;

import designPatterns.facade.complexInterfaces.CoffeeBeans;
import designPatterns.facade.complexInterfaces.CoffeeCup;
import designPatterns.facade.complexInterfaces.Milk;
import designPatterns.facade.complexInterfaces.Water;

public class CoffeeMakerFacade {
    private CoffeeBeans coffeeBeans;
    private Water water;
    private Milk milk;
    private CoffeeCup coffeeCup;

    public CoffeeMakerFacade() {
        this.coffeeBeans = new CoffeeBeans();
        this.water = new Water();
        this.milk = new Milk();
        this.coffeeCup = new CoffeeCup();
    }

    public void makeCoffee() {
        coffeeBeans.grind();
        water.boil();
        coffeeCup.pour();
        milk.froth();
        System.out.println("Enjoy your coffee!");
    }
}
