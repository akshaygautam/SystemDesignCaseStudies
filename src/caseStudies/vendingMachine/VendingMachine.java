package caseStudies.vendingMachine;

import java.util.*;

public class VendingMachine {
    private List<List<Slot>> slotLists;

    public VendingMachine(){
        slotLists = new ArrayList<>();
        Collections.fill(slotLists, new ArrayList<>(10));
    }
}
