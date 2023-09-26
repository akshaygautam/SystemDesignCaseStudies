package designPatterns.proxy.machines;

import designPatterns.proxy.VendingMachine;

import java.util.*;

public class RealVendingMachine implements VendingMachine {
    @Override
    public void dispenseSnack(String snackName) {
        System.out.println("Dispensing "+ snackName);
    }
}
