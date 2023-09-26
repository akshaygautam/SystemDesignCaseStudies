package designPatterns.structuralPatterns.proxy;

import designPatterns.structuralPatterns.proxy.machines.ProxyVendingMachine;

public class Test {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new ProxyVendingMachine();
        vendingMachine.dispenseSnack("Burger");
    }
}
