package designPatterns.proxy;

import designPatterns.proxy.machines.ProxyVendingMachine;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new ProxyVendingMachine();
        vendingMachine.dispenseSnack("Burger");
    }
}
