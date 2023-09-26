package designPatterns.structuralPatterns.proxy.machines;

import designPatterns.structuralPatterns.proxy.VendingMachine;

public class ProxyVendingMachine implements VendingMachine {
    private RealVendingMachine realMachine = new RealVendingMachine();

    @Override
    public void dispenseSnack(String snackName) {
        System.out.println("Welcome to the Fun Vending Machine!");
        System.out.println("Please do a little dance while we prepare your " + snackName);
        realMachine.dispenseSnack(snackName);
        System.out.println("Hope you enjoyed the dance!");
    }
}
