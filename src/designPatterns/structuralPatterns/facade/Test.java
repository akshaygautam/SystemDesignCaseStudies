package designPatterns.structuralPatterns.facade;

public class Test {
    public static void main(String[] args) {
        CoffeeMakerFacade coffeeMaker = new CoffeeMakerFacade();
        coffeeMaker.makeCoffee();
    }
}
