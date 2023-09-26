package designPatterns.structuralPatterns.proxy.machines;

import designPatterns.structuralPatterns.proxy.VendingMachine;

public class RealVendingMachine implements VendingMachine {
    @Override
    public void dispenseSnack(String snackName) {
        System.out.println("Dispensing "+ snackName);
    }
}
